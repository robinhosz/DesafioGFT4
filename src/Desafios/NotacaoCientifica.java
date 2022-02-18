package Desafios;

	import java.util.Scanner;

	public class NotacaoCientifica {

	    public static void main(String[] args) {


	    Scanner leitor = new Scanner(System.in);
	    double X = leitor.nextDouble();
			System.out.println(String.format((String.valueOf(X).startsWith("-") ? "" : "+") + "%.4E", X));

	    }
	}

