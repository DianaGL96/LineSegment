package ru.diana.linesegment.main;

import ru.diana.linesegment.util.LineSegment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точки A (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Введите координаты точки B (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        LineSegment lineSegment = new LineSegment(x1, x2, y1, y2);
        double length = lineSegment.calculateLength();
        System.out.println("\nДлина отрезка AB на плоскости равна " + length);
    }
}
