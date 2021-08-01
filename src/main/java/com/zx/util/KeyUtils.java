package com.zx.util;

import java.util.Random;

public class KeyUtils {


    public static synchronized String genUniKey(){
        Random random=new Random();
        Integer number=random.nextInt(900000)+1000000;
        return System.currentTimeMillis()+String.valueOf(number);

    }
}
