package com.splhead.jardatocentimeter.utils;

public class Utils {
    public static double convertJardasToCentimeters(double yards) {
        if (yards < 0) {
            return 0;
        }

        return yards * 91.44;
    }

    public static String unity(double value, String single) {
        return value > 1 ? single + 's' : single;
    }

    public static String doubleToString(double value) {
        return String.valueOf(value);
    }
}
