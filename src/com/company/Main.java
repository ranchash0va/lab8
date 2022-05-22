package com.company;
import java.io.*;
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        /**20.Создать класс треугольник, члены класса – координаты 3-х точек. Предусмотреть в классе
        методы проверки существования треугольника, вычисления и вывода сведений о фигуре – длины сторон,
        углы, периметр, площадь. Создать производный класс – равнобедренный треугольник, предусмотреть
        в классе проверку, является ли треугольник равнобедренным. Написать программу, демонстрирующую
        работу с классом: дано N треугольников и M равнобедренных треугольников, найти номера подобных
        треугольников и равнобедренный треугольник с наибольшей площадь
         */
        triangles treygol = new triangles();
        treygol.function();
        isoscelesTriangle isoscelesTriangle = new isoscelesTriangle();
        isoscelesTriangle.function();
        Square square = new Square();
        square.function();
    }
}