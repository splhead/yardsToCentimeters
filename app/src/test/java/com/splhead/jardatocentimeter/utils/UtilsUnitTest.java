package com.splhead.jardatocentimeter.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilsUnitTest {

    @Test
    public void convertionJardasToCentimeters_isCorrect() {
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
    public void shouldBeZeroWhenJardasIsLessThanZero() {
        double centimeters;
        double jardas = -22;

        centimeters = Utils.convertJardasToCentimeters(jardas);

        assertEquals(centimeters, 0, 0.01);
    }

    @Test
    public void shouldRepresentCorrectUnityInSingleOrPlural() {
        double greaterThanOne = 2;
        double lessThanOne = 0.99;

        assertEquals(Utils.unity(greaterThanOne, "jarda"), "jardas");
        assertEquals(Utils.unity(lessThanOne, "jarda"), "jarda");

        assertEquals(Utils.unity(greaterThanOne, "centímetro"), "centímetros");
        assertEquals(Utils.unity(lessThanOne, "centímetro"), "centímetro");
    }
}