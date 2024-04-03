package ru.diana.linesegment.service;

import ru.diana.linesegment.util.LineSegment;

public class SegmentLength {
    private LineSegment lineSegment;

    public SegmentLength(LineSegment lineSegment) {
        this.lineSegment = lineSegment;
    }
    public double calculateLength() {
        double x1 = lineSegment.getX1();
        double x2 = lineSegment.getX2();
        double y1 = lineSegment.getY1();
        double y2 = lineSegment.getY2();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
