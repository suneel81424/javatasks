/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.singleton;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author suneelkumar.a
 */
public class AppTest {
    
    public static void main(String[] args) throws IOException {
        File folder = new File(args[0]);
        System.out.println(args[0]);
        File[] hiddenFiles = folder.listFiles(s -> s.getName().endsWith(".crc")&&s.getName().contains("thread_0_clientId3708"));
        
        for (File hiddenFile : hiddenFiles) {
            String hidden = hiddenFile.getAbsolutePath();
            System.out.println(hidden);
            File file = new File(hidden);
            file.delete();
        }
    }
}
