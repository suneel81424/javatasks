/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.test;

import static com.imi.test.SMTPConstants.SMTP_CONNECTION_TIMEOUT;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.URLDataSource;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author suneelkumar.a
 */
public class SmptMailGun {

    private Session m_objSession = null;
    private String m_strUserName = "mahesh@sandboxb7fd3b59b9244f2d8873617a2d497270.mailgun.org";
    private String m_strPassword = "4c97910616cc5b449cad37ee4aca0f7b-2a9a428a-77251d34";

    private class SMTPAuthenticator extends javax.mail.Authenticator {

        @Override
        public PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication("mahesh@sandboxb7fd3b59b9244f2d8873617a2d497270.mailgun.org", m_strPassword);
        }
    }

    public void sendMail(String[] args) throws MessagingException, UnsupportedEncodingException, MalformedURLException, IOException {
        Properties objMailerProps = getServerProperties("smtp", "smtp-mail.outlook.com", "587", "XOAUTH2");

        m_objSession = Session.getInstance(objMailerProps, new SMTPAuthenticator());
        m_objSession.setDebug(false);
        System.out.println(m_strUserName);

        CustomMimeMessage msg = new CustomMimeMessage(m_objSession);
        String fromName = "suneel3598@outlook.com";

        msg.setFrom(new InternetAddress(m_strUserName, "test@sandboxb7fd3b59b9244f2d8873617a2d497270.mailgun.org"));
        InternetAddress[] replyAddresses = new InternetAddress[1];
        replyAddresses[0] = new InternetAddress(m_strUserName);
        msg.setReplyTo(replyAddresses);
        // COVER WRAP
        MimeBodyPart wrap = new MimeBodyPart();
        // ALTERNATIVE TEXT/HTML CONTENT
        MimeMultipart cover = new MimeMultipart("alternative");
        MimeBodyPart html = new MimeBodyPart();
        html.setContent("<html><a href=\"http://example.com\">link text</a></html>", "text/html; charset=UTF-8");
        MimeBodyPart text = new MimeBodyPart();
        text.setText("suneelfromimi", "UTF-8");
        cover.addBodyPart(text);
        cover.addBodyPart(html);
        wrap.setContent(cover);
        MimeMultipart mp = new MimeMultipart();
        MimeBodyPart att = new MimeBodyPart();
        System.out.println("attchentb strt to load" + new Date());
//        URL url = new java.net.URL("https://imitestbysuneel.s3.amazonaws.com/suneelytest/serer.log");
        URL url = new java.net.URL("https://res.cloudinary.com/demo/image/upload/w_250,h_250,c_mfit/w_700/saple.jpg");
        URLConnection urlConnection = url.openConnection();
        urlConnection.setConnectTimeout(5000);
        urlConnection.setReadTimeout(500);
//        Object content = urlConnection.getContent();
//        MimeBodyPart att2 = new MimeBodyPart();
//        byte[] decode = BASE64DecoderStream.decode("c3VuZWVsss".getBytes());
//        DataSource byteArrayDS = new ByteArrayDataSource(decode, "application/octet-stream");
//        att2.setDataHandler(new DataHandler(byteArrayDS));
//        att2.setFileName("suneel.txt");
//        att2.setDisposition("attachment");
//         Add the attachment to the message.
//        mp.addBodyPart(att2);
        URLDataSource urlDatasource = new URLDataSource(url);

        att.setDataHandler(new DataHandler(urlDatasource));
        att.setFileName("suneel.jpg");
        att.setDisposition("attachment");
        mp.addBodyPart(att);
//        mp.addBodyPart(att2);
        mp.addBodyPart(wrap);
        String[] toAddrs = "suneelkumar.a@imimobile.com".split(",");
        InternetAddress[] addresses = new InternetAddress[toAddrs.length];
        for (int i = 0; i < toAddrs.length; i++) {
            addresses[i] = new InternetAddress(toAddrs[i]);
        }
        msg.setRecipients(javax.mail.Message.RecipientType.TO, addresses);
        msg.setSubject("test by suneel from imi");
        msg.setContent(mp);
        msg.saveChanges();
//        msg.updateMessageID();
        System.out.println("attchentb end to load" + new Date());

        try {
//            long lStart = System.currentTimeMillis();
//            Transport transport = m_objSession.getTransport("smtp");
//        transport.connect("smtp.mailgun.org", "mahesh@sandboxb7fd3b59b9244f2d8873617a2d497270.mailgun.org", "4c97910616cc5b449cad37ee4aca0f7b-2a9a428a-77251d34");
            System.out.println(new Date());
//            System.out.println(msg.getMessageID());
            Transport.send(msg);
            System.out.println(new Date());
        } catch (Exception e) {
            System.out.println(e.getCause());
//            System.out.println(ExceptionUtils.getStackTrace(e));
            System.out.println(e.getCause() instanceof FileNotFoundException);
//            System.out.println(e);
            System.out.println(new Date());
        }
    }

    public static void main(String[] args) throws MessagingException, UnsupportedEncodingException, IOException {
        new SmptMailGun().sendMail(args);
    }

    private Properties getServerProperties(String protocol, String host,
            String port, String authType) {
        Properties properties = System.getProperties();

        properties.put(SMTPConstants.SMTP_SENDPARTIAL.getKey(), "true");
        properties.put(SMTPConstants.SMTP_AUTH.getKey(), "true");
        properties.put(SMTPConstants.TRANSPORT_PROTOCAL.getKey(), "smtp");
        properties.put(SMTPConstants.SMTP_HOST.getKey(), "smtp.mailgun.org");
        properties.put(SMTPConstants.SMTP_PORT.getKey(), "587");
        properties.put(SMTPConstants.SMTP_CONNECTION_TIMEOUT.getKey(), "30000");
        properties.put(SMTPConstants.SMTP_TIMEOUT.getKey(), "100000");
        properties.put("mail.smtp.writetimeout", "30000");
        properties.put(SMTPConstants.SMTP_USERNAME.getKey(), "mahesh@sandboxb7fd3b59b9244f2d8873617a2d497270.mailgun.org");
        properties.put(SMTPConstants.SMTP_PSWD.getKey(), "4c97910616cc5b449cad37ee4aca0f7b-2a9a428a-77251d34");
        properties.put("mail.smtp.ssl.enable", "true");
        System.out.println(SMTP_CONNECTION_TIMEOUT.name());
        return properties;
    }
}
