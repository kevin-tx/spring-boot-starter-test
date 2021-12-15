package com.kevin;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author TX
 * @date 2020/7/6 20:31
 */
public class LogUtil {

    static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    public static void log(String log) {
        System.out.println(formatter.format(new Date()) + "--" + Thread.currentThread().getName() + "--" + log);
    }
}
