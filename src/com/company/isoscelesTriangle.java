package com.company;
import java.io.*;
import java.util.Scanner;

public class isoscelesTriangle {
    public void function() {
        System.out.println("Input 3 sides of triangle:");
        Scanner scanner = new Scanner(System.in);
        double stro1 = (double)scanner.nextInt();
        double stro2 = (double)scanner.nextInt();
        double stro3 = (double)scanner.nextInt();
        double yglA = (Math.pow(stro1, 2.0D) + Math.pow(stro3, 2.0D) - Math.pow(stro2, 2.0D)) / (2.0D * stro1 * stro3);
        double yglB = (Math.pow(stro1, 2.0D) + Math.pow(stro2, 2.0D) - Math.pow(stro3, 2.0D)) / (2.0D * stro1 * stro2);
        double yglY = (Math.pow(stro2, 2.0D) + Math.pow(stro3, 2.0D) - Math.pow(stro1, 2.0D)) / (2.0D * stro3 * stro2);
        double P = stro1 + stro2 + stro3;
        double S = stro1 * stro2 / 2.0D;
        if (yglA == yglY) {
            System.out.println("Triangle 1");
            System.out.println("Length of three sides: " + stro1 + " " + stro2 + " " + stro3);
            System.out.println("Corners: " + yglA + " " + yglB + " " + yglY);
            System.out.println("Perimetr:" + P);
            System.out.println("Square:" + S);
        }

        System.out.println("____________________________");
        System.out.println("Input 3 sides of triangle:");
        double stro12 = (double)scanner.nextInt();
        double stro22 = (double)scanner.nextInt();
        double stro32 = (double)scanner.nextInt();
        double yglA2 = (Math.pow(stro12, 2.0D) + Math.pow(stro32, 2.0D) - Math.pow(stro22, 2.0D)) / (2.0D * stro12 * stro32);
        double yglB2 = (Math.pow(stro12, 2.0D) + Math.pow(stro22, 2.0D) - Math.pow(stro32, 2.0D)) / (2.0D * stro12 * stro22);
        double yglY2 = (Math.pow(stro22, 2.0D) + Math.pow(stro32, 2.0D) - Math.pow(stro12, 2.0D)) / (2.0D * stro32 * stro22);
        double P2 = stro12 + stro22 + stro32;
        double S2 = stro12 * stro22 / 2.0D;
        if (yglA2 == yglY2) {
            System.out.println("Triangle 2");
            System.out.println("Length of three sides: " + stro12 + " " + stro22 + " " + stro32);
            System.out.println("Corners: " + yglA2 + " " + yglB2 + " " + yglY2);
            System.out.println("Perimetr:" + P2);
            System.out.println("Square:" + S2);
        }

        System.out.println("____________________________");
        System.out.println("Input 3 sides of triangle:");
        double stro13 = (double)scanner.nextInt();
        double stro23 = (double)scanner.nextInt();
        double stro33 = (double)scanner.nextInt();
        double yglA3 = (Math.pow(stro13, 2.0D) + Math.pow(stro33, 2.0D) - Math.pow(stro23, 2.0D)) / (2.0D * stro13 * stro33);
        double yglB3 = (Math.pow(stro13, 2.0D) + Math.pow(stro23, 2.0D) - Math.pow(stro33, 2.0D)) / (2.0D * stro13 * stro23);
        double yglY3 = (Math.pow(stro23, 2.0D) + Math.pow(stro33, 2.0D) - Math.pow(stro13, 2.0D)) / (2.0D * stro33 * stro23);
        double P3 = stro13 + stro23 + stro33;
        double S3 = stro13 * stro23 / 2.0D;
        if (yglA3 == yglY3) {
            System.out.println("Triangle 3");
            System.out.println("Length of three sides: " + stro13 + " " + stro23 + " " + stro33);
            System.out.println("Corners: " + yglA3 + " " + yglB3 + " " + yglY3);
            System.out.println("Perimetr:" + P3);
            System.out.println("Square:" + S3);
        }

        if (S > S2 && S > S3) {
            System.out.println("Largest square:" + S);
        }

        if (S2 > S && S2 > S3) {
            System.out.println("Largest square:" + S2);
        }

        if (S3 > S && S3 > S2) {
            System.out.println("Largest square:" + S3);
        }
        File myFile = new File("isoscelesTriangle.txt");

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile)));
            writer.println("\n"+"Triangle 1"+"\n"+
                    "Length of three sides: " + stro12 + " " + stro22 + " " + stro32
                    +"\n"+"Corners: " + yglA + " " + yglB + " " + yglY+"\n"+
                    "Perimetr:" + P +"\n"+"Square:" + S  +"\n"+"____________________________"+"\n"+
                    "Triangle 2"+"\n"+"Length of three sides: " + stro12 + " " + stro22 + " " + stro32+"\n"+
                    "Corners: " + yglA2 + " " + yglB2 + " " + yglY2+"\n"+"Perimetr:" + P2
                    +"\n"+"Square:" + S2+"\n"+"____________________________"+"\n"+
                    "Triangle 3"+"\n"+"Length of three sides: " + stro13 + " " + stro23 + " " + stro33
                    +"\n"+"Corners: " + yglA3 + " " + yglB3 + " " + yglY3+"\n"+"Perimetr:" + P3
                    +"\n"+"Square:" + S3 +"\n"+"Largest square:" + S+"\n"+"Largest square:" + S2+"\n"+
                    "Largest square:" + S3);
            writer.flush();
            writer.close();
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }
    }
    }
