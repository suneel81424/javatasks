/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.test;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author suneelkumar.a
 */
public class CustomMimeMessage extends MimeMessage {

    public CustomMimeMessage(Session session) {
        super(session);
    }
//    private static final Logger LOGGER = Logger.getLogger(CustomMimeMessage.class);

//    protected void setHeaders(n) throws MessagingException {
//        if (LOGGER.isDebugEnabled()) {
//            LOGGER.debug("smtpHeaders=> " + emailMT.getSmtpHeaders());
//        }
//        if (emailMT.getSmtpHeaders() != null && emailMT.getSmtpHeaders().length() > 0) {
//            JSONObject callBackHeaders = emailMT.getSmtpHeaders();
//            callBackHeaders.keySet().forEach(key -> {
//                try {
//                    String value = callBackHeaders.getString(key.toString());
//                    if (LOGGER.isDebugEnabled()) {
//                        LOGGER.debug("key=> " + key + " value=> " + value);
//                    }
//                    setHeader(key.toString(), value);
//                } catch (JSONException | MessagingException e) {
//                    LOGGER.error("problem while setting header key=> " + key + " ex=>" + ExceptionUtils.getStackTrace(e));
//                }
//            }
//            );
//        }
//    }
}
