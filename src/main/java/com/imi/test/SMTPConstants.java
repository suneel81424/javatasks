/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.test;

/**
 *
 * @author suneelkumar.a
 */
public enum SMTPConstants {

    SMTP_SENDPARTIAL("mail.smtp.sendpartial"),
    SMTP_AUTH("mail.smtp.auth"),
    SMTP_USERNAME("mail.user"),
    SMTP_PSWD("mail.password"),
    SMTP_HOST("mail.smtp.host"),
    SMTP_PORT("mail.smtp.port"),
    SMTP_CONNECTION_TIMEOUT("mail.smtp.connectiontimeout"),
    SMTP_TIMEOUT("mail.smtp.timeout"),
    TRANSPORT_PROTOCAL("mail.transport.protocol"),
    SMTP_MAIL_ENCRYPTION("mail.smtp.%s.enable");
    private final String key;

    private SMTPConstants(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

}
