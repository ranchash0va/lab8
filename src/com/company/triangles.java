package com.company;
import java.io.*;
import java.util.Scanner;

public class triangles {

    public void function() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Triangle 1");
        System.out.println("Input 3 sides of triangle:");
        double stro1 = (double)scanner.nextInt();
        double stro2 = (double)scanner.nextInt();
        double stro3 = (double)scanner.nextInt();
        System.out.println("Length of three sides: " + stro1 + " " + stro2 + " " + stro3);
        double yglA = (Math.pow(stro1, 2.0D) + Math.pow(stro3, 2.0D) - Math.pow(stro2, 2.0D)) / (2.0D * stro1 * stro3);
        double yglB = (Math.pow(stro1, 2.0D) + Math.pow(stro2, 2.0D) - Math.pow(stro3, 2.0D)) / (2.0D * stro1 * stro2);
        double yglY = (Math.pow(stro2, 2.0D) + Math.pow(stro3, 2.0D) - Math.pow(stro1, 2.0D)) / (2.0D * stro3 * stro2);
        System.out.println("Corners: " + yglA + " " + yglB + " " + yglY);
        double P = stro1 + stro2 + stro3;
        System.out.println("Perimetr:" + P);
        double S = stro1 * stro2 / 2.0D;
        System.out.println("Square:" + S);
        System.out.println("____________________________");
        System.out.println("Triangle 2");
        System.out.println("Input 3 sides of triangle:");
        double stro12 = (double)scanner.nextInt();
        double stro22 = (double)scanner.nextInt();
        double stro32 = (double)scanner.nextInt();
        System.out.println("Length of three sides: " + stro12 + " " + stro22 + " " + stro32);
        double yglA2 = (Math.pow(stro12, 2.0D) + Math.pow(stro32, 2.0D) - Math.pow(stro22, 2.0D)) / (2.0D * stro12 * stro32);
        double yglB2 = (Math.pow(stro12, 2.0D) + Math.pow(stro22, 2.0D) - Math.pow(stro32, 2.0D)) / (2.0D * stro12 * stro22);
        double yglY2 = (Math.pow(stro22, 2.0D) + Math.pow(stro32, 2.0D) - Math.pow(stro12, 2.0D)) / (2.0D * stro32 * stro22);
        System.out.println("Corners: " + yglA2 + " " + yglB2 + " " + yglY2);
        double P2 = stro12 + stro22 + stro32;
        System.out.println("Perimetr:" + P2);
        double S2 = stro12 * stro22 / 2.0D;
        System.out.println("Square:" + S2);
        System.out.println("____________________________");
        System.out.println("Triangle 3");
        System.out.println("Input 3 sides of triangle:");
        double stro13 = (double)scanner.nextInt();
        double stro23 = (double)scanner.nextInt();
        double stro33 = (double)scanner.nextInt();
        System.out.println("Length of three sides: " + stro13 + " " + stro23 + " " + stro33);
        double yglA3 = (Math.pow(stro13, 2.0D) + Math.pow(stro33, 2.0D) - Math.pow(stro23, 2.0D)) / (2.0D * stro13 * stro33);
        double yglB3 = (Math.pow(stro13, 2.0D) + Math.pow(stro23, 2.0D) - Math.pow(stro33, 2.0D)) / (2.0D * stro13 * stro23);
        double yglY3 = (Math.pow(stro23, 2.0D) + Math.pow(stro33, 2.0D) - Math.pow(stro13, 2.0D)) / (2.0D * stro33 * stro23);
        System.out.println("Corners: " + yglA3 + " " + yglB3 + " " + yglY3);
        double P3 = stro13 + stro23 + stro33;
        System.out.println("Perimetr:" + P3);
        double S3 = stro13 * stro23 / 2.0D;
        System.out.println("Square:" + S3);
        if (S > S2 && S > S3) {
            System.out.println("Largest square:" + S);
        }

        if (S2 > S && S2 > S3) {
            System.out.println("Largest square:" + S2);
        }

        if (S3 > S && S3 > S2) {
            System.out.println("Largest square:" + S3);
        }

        System.out.println("*____________________________*");
        File myFile = new File("triangles.txt");

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile)));
            writer.println("Triangle 1"+"\n"+"Length of three sides: " + stro1 + " " + stro2 + " " + stro3
                    +"\n"+"Corners: " + yglA + " " + yglB + " " + yglY
                    +"\n"+"Perimetr:" + P+"\n"+"Square:" + S+"\n"+"____________________________"
                    +"\n"+"Triangle 2"+"\n"+"Length of three sides: " + stro12 + " " + stro22 + " " + stro32
                    +"\n"+"Corners: " + yglA2 + " " + yglB2 + " " + yglY2
                    +"\n"+"Perimetr:" + P2+"\n"+"Square:" + S2
                    +"\n"+"Triangle 3"+"\n"+"Length of three sides: " + stro13 + " " + stro23 + " " + stro33
                    +"\n"+"Corners: " + yglA3 + " " + yglB3 + " " + yglY3
                    +"\n"+"Perimetr:" + P3+"\n"+"Square:" + S3+"\n"+
                    "Largest square:" + S+"\n"+"Largest square:" + S2
                    +"\n"+"Largest square:" + S3);
            writer.flush();
            writer.close();
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }
    }
}