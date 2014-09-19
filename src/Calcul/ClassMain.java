package Calcul;

import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args) {
		CalculManager myCalculManager=new CalculManager();
		System.out.println("****************************");
		
		System.out.println("1: Execution sans initialistion");
		System.out.println("2: Initialisation par setter");
		System.out.println("3: Initialisation par constructeur");
		System.out.println("4: Initialisation moyennant la classe Scanner");
		System.out.println("Choisissez l'une des option:");
		System.out.println("**********************************");

		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		while((n>=5)|(n<=0)){
			System.out.println("Choisissez l'une des options :");
			 c = new Scanner(System.in);
			 n = c.nextInt();
		}
		;
		
		switch (n){
		case 1: myCalculManager.exec_int();
		break;
		case 2: myCalculManager.int_setter();
		break;
		case 3: myCalculManager.int_const();
		break;
		case 4: myCalculManager.int_scan();
		break;
		
		}
		
	}
	

}
