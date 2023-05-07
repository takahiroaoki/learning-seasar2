package org.seasar.example.s2container.ognl;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateFormatter {
    public SimpleDateFormat format;

    public String format(Date date) {
        return format.format(date);
    }

}
