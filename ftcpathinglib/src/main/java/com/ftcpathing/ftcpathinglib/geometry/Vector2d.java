package com.ftcpathing.ftcpathinglib.geometry;

/**
 * Represents a 2D vector with x and y components.
 * <p>
 * This class provides methods for setting and retrieving the vector's components, 
 * performing vector arithmetic (addition, subtraction, and scaling), and calculating 
 * the distance between two vectors.
 * </p>
 */
public class Vector2d {
    private double m_x;
    private double m_y;

    /**
     * Constructs a {@code Vector2d} object with the specified x and y components.
     * 
     * @param x the x-component of the vector
     * @param y the y-component of the vector
     */
    public Vector2d(double x, double y) {
        this.m_x = x;
        this.m_y = y;
    }

    /**
     * Sets the components of the vector.
     * 
     * @param x the new x-component of the vector
     * @param y the new y-component of the vector
     */
    public void set(double x, double y) {
        this.m_x = x;
        this.m_y = y;
    }

    /**
     * Sets the x-component of the vector.
     * 
     * @param x the new x-component of the vector
     */
    public void setX(double x) {
        this.m_x = x;
    }

    /**
     * Sets the y-component of the vector.
     * 
     * @param y the new y-component of the vector
     */
    public void setY(double y) {
        this.m_y = y;
    }

    /**
     * Gets the x-component of the vector.
     * 
     * @return the x-component of the vector
     */
    public double getX() {
        return m_x;
    }

    /**
     * Gets the y-component of the vector.
     * 
     * @return the y-component of the vector
     */
    public double getY() {
        return m_y;
    }

    /**
     * Adds this vector to another vector.
     * 
     * @param vector the vector to add
     * @return a new {@code Vector2d} representing the result of the addition
     */
    public Vector2d plus(Vector2d vector) {
        return new Vector2d(this.getX() + vector.getX(), this.getY() + vector.getY());
    }

    /**
     * Subtracts another vector from this vector.
     * 
     * @param vector the vector to subtract
     * @return a new {@code Vector2d} representing the result of the subtraction
     */
    public Vector2d minus(Vector2d vector) {
        return new Vector2d(this.getX() - vector.getX(), this.getY() - vector.getY());
    }

    /**
     * Scales this vector by a scalar value.
     * 
     * @param scalar the scalar value to multiply the vector by
     * @return a new {@code Vector2d} representing the scaled vector
     */
    public Vector2d times(double scalar) {
        return new Vector2d(this.getX() * scalar, this.getY() * scalar);
    }

    /**
     * Calculates the distance between this vector (treated as a point) and another vector.
     * 
     * @param vector the other vector (treated as a point) to calculate the distance to
     * @return the distance between this vector and the other vector
     */
    public double calculateDistance(Vector2d vector) {
        double dx = vector.getX() - getX();
        double dy = vector.getY() - getY();

        return Math.sqrt(dx * dx + dy * dy);
    }
}
