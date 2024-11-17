package com.ftcpathing.ftcpathinglib.geometry;

public class Rotation2d {
    private double m_rotation;

    public Rotation2d(double rotation) {
        this.m_rotation = rotation;
    }

    public void setRadians(double rotation) {
        m_rotation = rotation;
    }

    public void setDegrees(double rotation) {
        m_rotation = Math.toRadians(rotation);
    }

    public double inDegrees() {
        return Math.toDegrees(m_rotation);
    }

    public double inRadians() {
        return m_rotation;
    }
}
