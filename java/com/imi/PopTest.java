/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeBodyPart;

/**
 *
 * @author suneelkumar.a
 */
public class PopTest {

    private static final String HOST = "pop.gmail.com";
    private static final String USERNAME = "";
    private static final String PASSWORD = "";

    public static void doit() throws MessagingException, IOException {
        Folder folder = null;
        Store store = null;
        try {
            Properties props = new Properties();
            props.put("mail.store.protocol", "pop3s"); // Google uses POP3S not POP3
            Session session = Session.getDefaultInstance(props);
            // session.setDebug(true);
            store = session.getStore();
            store.connect(HOST, USERNAME, PASSWORD);
            folder = store.getDefaultFolder().getFolder("INBOX");
            folder.open(Folder.READ_ONLY);
            Message[] messages = folder.getMessages();
            System.out.println("No of Messages : " + folder.getMessageCount());
            System.out.println("No of Unread Messages : " + folder.getUnreadMessageCount());
            for (int i = 0; i < messages.length; ++i) {
                System.out.println("MESSAGE #" + (i + 1) + ":");
                Message msg = messages[i];
                String from = "unknown";
                if (msg.getReplyTo().length >= 1) {
                    from = msg.getReplyTo()[0].toString();
                } else if (msg.getFrom().length >= 1) {
                    from = msg.getFrom()[0].toString();
                }
                String subject = msg.getFileName();
                System.out.println("Saving ... " + subject + " " + from);
        // you may want to replace the spaces with "_"
                // the files will be saved into the TEMP directory
                String filename = "c:/test/" + subject;
                saveParts(msg.getContent(), filename);
            }
        } finally {
            if (folder != null) {
                folder.close(true);
            }
            if (store != null) {
                store.close();
            }
        }
    }

    public static void saveParts(Object content, String filename)
            throws IOException, MessagingException {
        OutputStream out = null;
        InputStream in = null;
        try {
            if (content instanceof Multipart) {
                Multipart multi = ((Multipart) content);
                int parts = multi.getCount();
                for (int j = 0; j < parts; ++j) {
                    MimeBodyPart part = (MimeBodyPart) multi.getBodyPart(j);
                    if (part.getContent() instanceof Multipart) {
                        // part-within-a-part, do some recursion...
                        saveParts(part.getContent(), filename);
                    } else {
                        String extension = "";
                        if (part.isMimeType("text/html")) {
                            extension = "html";
                        } else {
                            if (part.isMimeType("text/plain")) {
                                extension = "txt";
                            } else {
                                //  Try to get the name of the attachment
                                extension = part.getDataHandler().getName();
                            }
                            filename = filename + "." + extension;
                            System.out.println("... " + filename);
                            File file = new File(filename);
                            if(!file.exists()){
                                file.createNewFile();
                                System.out.println(file.getAbsolutePath());
                            }
                            out = new FileOutputStream(new File(filename));
                            in = part.getInputStream();
                            int k;
                            while ((k = in.read()) != -1) {
                                out.write(k);
                            }
                        }
                    }
                }
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }

    public static void main(String args[]) throws Exception {
        PopTest.doit();
    }
}
