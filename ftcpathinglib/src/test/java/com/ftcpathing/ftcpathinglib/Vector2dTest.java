package com.ftcpathing.ftcpathinglib;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ftcpathing.ftcpathinglib.geometry.Vector2d;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Vector2dTest {
    
    @Test
    void testInitialValues() {
        Vector2d point = new Vector2d(3.0, 4.0);
        assertEquals(3.0, point.getX());
        assertEquals(4.0, point.getY());
    }

    @Test
    void testSetValues() {
        Vector2d point = new Vector2d(0.0, 0.0);
        point.set(5.0, 6.0);
        assertEquals(5.0, point.getX());
        assertEquals(6.0, point.getY());
    }

    @Test
    void testSetXandSetY() {
        Vector2d point = new Vector2d(0.0, 0.0);
        point.setX(11.0);
        point.setY(16.0);
        assertEquals(11.0, point.getX());
        assertEquals(16.0, point.getY());
    }

    @ParameterizedTest
    @CsvSource({
        "0.0, 0.0, 0.0, 0.0, 0.0",
        "5.0, 5.0, 0.0, 0.0, 7.07107",
        "3.3, 10.0, 198.0, 192.0, 266.51846",
        "-100.0, -104.0, 102.0, -10.0, 222.80036"
    })
    void testCalculateDistance(double x1, double y1, double x2, double y2, double expected) {
        Vector2d point1 = new Vector2d(x1, y1);
        Vector2d point2 = new Vector2d(x2, y2);

        assertEquals(expected, new BigDecimal(point1.calculateDistance(point2)).setScale(5, RoundingMode.HALF_UP).doubleValue());
    }
}
