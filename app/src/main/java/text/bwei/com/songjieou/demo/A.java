package text.bwei.com.songjieou.demo;

import java.text.SimpleDateFormat;

/**
 * 1.version:
 * 2.date:2016/12/1 19:31
 * 3.update:2016/12/1.
 * 4.autour:张玉杰
 */
public class A {
    public static String dateToStr(java.util.Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = sdf.format(date);
        return str;
    }

}
