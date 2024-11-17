package com.ftcpathing.ftcpathinglib.spline;

import com.ftcpathing.ftcpathinglib.geometry.Vector2d;

public class CubicBezierCurve {
    private Vector2d m_start;
    private Vector2d m_startControl;
    private Vector2d m_endControl;
    private Vector2d m_end;

    public CubicBezierCurve(Vector2d start, Vector2d startControl, Vector2d endControl, Vector2d end) {
        this.m_start = start;
        this.m_startControl = startControl;
        this.m_endControl = endControl;
        this.m_end = end;
    }
}
