package com.zk.dialog.utils;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * author: ZK.
 * date:   On 2017/1/9
 */

public class StringUtil {
    public static final String EMPTY = "";

    public static boolean isNullOrEmpty(String value) {
        return value == null || EMPTY.equals(value);
    }

    public static boolean isNullOrWhiteSpace(String value) {
        return value == null || EMPTY.equals(value.trim());
    }


}
