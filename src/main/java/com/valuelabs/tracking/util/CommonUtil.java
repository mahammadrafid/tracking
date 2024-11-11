package com.valuelabs.tracking.util;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.UUID;

public class CommonUtil {
    static Random random = new Random();
   public static String generateUniqueTrackingNumber(){
       String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
       StringBuilder sb = new StringBuilder(16);
       for (int i = 0; i < 16; i++) {
           sb.append(chars.charAt(random.nextInt(chars.length())));
       }
       return sb.toString();
    }
}
