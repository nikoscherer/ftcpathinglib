package com.ftcpathing.ftcpathinglib.utils;

import com.ftcpathing.ftcpathinglib.geometry.Vector2d;

/**
 * A utility class for performing linear, quadratic, and cubic interpolation 
 * (lerp) operations on {@link Vector2d} objects.
 * <p>
 * Lerp (Linear Interpolation) is commonly used in animations, robotics, and 
 * pathfinding to smoothly transition between points in space.
 * </p>
 */
public class LerpUtil {

    private LerpUtil() {
        throw new AssertionError("Utility class!");
    }

    /**
     * Linearly interpolates between two {@link Vector2d} points.
     * 
     * @param a the starting point of the interpolation
     * @param b the ending point of the interpolation
     * @param t the interpolation parameter, where 0 <= t <= 1
     *          <ul>
     *              <li>t = 0 returns point {@code a}</li>
     *              <li>t = 1 returns point {@code b}</li>
     *              <li>Values in between return a point proportionally between {@code a} and {@code b}</li>
     *          </ul>
     * @return the interpolated {@link Vector2d} point
     */
    public static Vector2d linearLerp(Vector2d a, Vector2d b, double t) {
        t = Math.max(0, Math.min(1, t)); // Clamp t between 0 and 1
        return a.plus(b.minus(a).times(t));
    }

    /**
     * Quadratically interpolates between three {@link Vector2d} points.
     * <p>
     * Combines two linear interpolations to compute the result.
     * </p>
     * 
     * @param a the first point
     * @param b the middle control point
     * @param c the final point
     * @param t the interpolation parameter, where 0 <= t <= 1
     *          <ul>
     *              <li>t = 0 returns point {@code a}</li>
     *              <li>t = 1 returns point {@code c}</li>
     *              <li>Values in between create a curve influenced by control point {@code b}</li>
     *          </ul>
     * @return the interpolated {@link Vector2d} point
     */
    public static Vector2d quadraticLerp(Vector2d a, Vector2d b, Vector2d c, double t) {
        return linearLerp(linearLerp(a, b, t), linearLerp(b, c, t), t);
    }

    /**
     * Cubically interpolates between four {@link Vector2d} points.
     * <p>
     * Combines two quadratic interpolations to compute the result, producing a 
     * smooth curve that passes near all four points.
     * </p>
     * 
     * @param a the first point
     * @param b the first control point
     * @param c the second control point
     * @param d the final point
     * @param t the interpolation parameter, where 0 <= t <= 1
     *          <ul>
     *              <li>t = 0 returns point {@code a}</li>
     *              <li>t = 1 returns point {@code d}</li>
     *              <li>Values in between create a curve influenced by control points {@code b} and {@code c}</li>
     *          </ul>
     * @return the interpolated {@link Vector2d} point
     */
    public static Vector2d cubicLerp(Vector2d a, Vector2d b, Vector2d c, Vector2d d, double t) {
        return linearLerp(quadraticLerp(a, b, c, t), quadraticLerp(b, c, d, t), t);
    }
}