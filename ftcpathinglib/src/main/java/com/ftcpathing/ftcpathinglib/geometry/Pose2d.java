package com.ftcpathing.ftcpathinglib.geometry;

public class Pose2d {
    Vector2d m_position;
    Rotation2d m_rotation;

    public Pose2d(double x, double y, double rotation) {
        this.m_position = new Vector2d(x, y);
        this.m_rotation = new Rotation2d(rotation);
    }

    public Pose2d(Vector2d position, Rotation2d rotation) {
        this.m_position = position;
        this.m_rotation = rotation;
    }

    public Pose2d(Vector2d position, double rotation) {
        this.m_position = position;
        this.m_rotation = new Rotation2d(rotation);
    }

    public Pose2d(double x, double y, Rotation2d rotation) {
        this.m_position = new Vector2d(x, y);
        this.m_rotation = rotation;
    }

    public void setX(double x) {
        this.m_position.setX(x);
    }

    public void setY(double y) {
        this.m_position.setY(y);
    }

    public void setRotationDegrees(double rotation) {
        this.m_rotation.setDegrees(rotation);
    }

    public void setRotationRadians(double rotation) {
        this.m_rotation.setRadians(rotation);
    }

}
