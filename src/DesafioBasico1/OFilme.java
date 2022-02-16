package DesafioBasico1;

import java.util.Scanner;

public class OFilme {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();

        double aumento = (B * 100.0 / A) - 100.0;

        System.out.println(String.format("%.2f%%", aumento));
    }
}