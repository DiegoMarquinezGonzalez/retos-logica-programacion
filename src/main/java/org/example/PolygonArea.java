package org.example;

import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        /*
         * Crea una única función (importante que sólo sea una) que sea capaz
         * de calcular y retornar el área de un polígono.
         * - La función recibirá por parámetro sólo UN polígono a la vez.
         * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
         * - Imprime el cálculo del área de un polígono de cada tipo.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un polígono (triángulo, cuadrado, rectángulo): ");
        String polygon = sc.next().toLowerCase();

        double area = polygonArea(polygon,sc);
        if (area != -1){
            System.out.println("El área del poligono "+polygon+ " es: "+area);
        }else{
            System.out.println("Poligono no soportado");
        }
    }
    public static double polygonArea(String polygon, Scanner sc){
        double area = 0;
        double lado,base,altura;
        switch(polygon){
            case "triángulo":
                System.out.println("Introduce la base: ");
                base = sc.nextDouble();
                System.out.println("Introduce la altura: ");
                altura = sc.nextDouble();
                area = (base*altura)/2;
                break;
            case "cuadrado":
                System.out.println("Introduce el lado: ");
                lado = sc.nextDouble();
                area = lado*lado;
                break;
            case "rectángulo":
                System.out.println("Introduce la base: ");
                base = sc.nextDouble();
                System.out.println("Introduce la altura: ");
                altura = sc.nextDouble();
                area = base * altura;
                break;
            default:
                area =1;
                break;
        }
        return area;
    }
}
