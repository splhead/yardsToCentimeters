package com.splhead.jardatocentimeter.utils;

public class Utils {
    public static double convertJardasToCentimeters(double yards) {
        if (yards < 0) {
            return 0;
        }

        return yards * 91.44;
    }

    private static String unity(double value, String single) {
        return value > 1 ? single + 's' : single;
    }

    private static String isOrAre(double value) {
        return value > 1 ? " são iguais a " : " é igual a ";
    }

    public static String out(double yards, double centimeters) {
        String out = Utils.doubleToString(yards) +
                " " +
                Utils.unity(yards, "jarda") +
                Utils.isOrAre((yards)) +
                Utils.doubleToString(centimeters) +
                " " +
                Utils.unity(centimeters, "centímetro");

        return out;
    }

    public static String doubleToString(double value) {
        return String.valueOf(value);
    }
}
