package com.splhead.jardatocentimeter.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilsUnitTest {

    @Test
    public void conversionYardsToCentimeters_isCorrect() {
        double centimeters = 0;
        double jardas = 1;

        try {
            centimeters = Utils.convertJardasToCentimeters(jardas);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(centimeters, 91.44, 0.01);
    }

    @Test
    public void shouldBeZeroWhenYardsIsLessThanZero() {
        double centimeters;
        double jardas = -22;

        centimeters = Utils.convertJardasToCentimeters(jardas);

        assertEquals(centimeters, 0, 0.01);
    }

    @Test
    public void shouldFormatSingleOutCorrectly() {
        String out = Utils.out(0.01, 0.91);
        assertEquals(out, "0.01 jarda é igual a 0.91 centímetro");

        out = Utils.out(0.99, 90.52);
        assertEquals(out, "0.99 jarda é igual a 90.52 centímetros");
    }

    @Test
    public void shouldFormatPluralOutCorrectly() {
        String out = Utils.out(2.0, 182.88);
        assertEquals(out, "2.0 jardas são iguais a 182.88 centimetros");
    }
}