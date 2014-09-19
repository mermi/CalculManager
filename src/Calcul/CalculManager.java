package Calcul;
import java.util.Scanner;

public class CalculManager{
	private double valeur1;
	private double valeur2;
	 
	// equivalent a un constructeur par defaut
	public CalculManager(){
	}
	//Constructeur surcharge ==> parametre
	public CalculManager(double valeur1,double valeur2){
		this.valeur1=valeur1;
		this.valeur2=valeur2;
	}
	 // Getters
	public double getValeur1(){
		return this.valeur1;
	}
	public double getValeur2(){
		return this.valeur2;
	}
	//Setters
	public void setValeur1(double valeur1){
		this.valeur1=valeur1;
	}
	public void setValeur2(double valeur2){
		this.valeur2=valeur2;
	}
	//Traitement
	public double calculerSomme(){
		return this.valeur1+this.valeur2;
	}
	public double calculerMultiplication(){
		return this.valeur1*this.valeur2;
	}
	public float calculerDivision(){
		//return (float) (this.valeur1/ this.valeur2);
		try {
			return (float) (this.valeur1/ this.valeur2);
	        
	    } catch (ArithmeticException e) {
	       System.out.println("ArithmeticException occured!");
	    }
		return 0;
		
		}
		
		public void exec_int(){
			CalculManager myCalculManager=new CalculManager();
			System.out.println("La somme de "+myCalculManager.getValeur1()+" et "+myCalculManager.getValeur2()+" est egale a "+ myCalculManager.calculerSomme());
			System.out.println("La Mutiplication de "+myCalculManager.getValeur1()+" et "+myCalculManager.getValeur2()+" est egale a "+ myCalculManager.calculerMultiplication());
			System.out.println("La division de "+myCalculManager.getValeur1()+" et "+myCalculManager.getValeur2()+" est egale a "+ myCalculManager.calculerDivision());
		}
		
		public void int_setter(){
			CalculManager myCalculManager=new CalculManager();
			myCalculManager.setValeur1(5.6);
			myCalculManager.setValeur2(4.4);
			System.out.println("La somme de "+myCalculManager.getValeur1()+" et "+myCalculManager.getValeur2()+" est egale a "+ myCalculManager.calculerSomme());
			System.out.println("La Mutiplication de "+myCalculManager.getValeur1()+" et "+myCalculManager.getValeur2()+" est egale a "+ myCalculManager.calculerMultiplication());
			System.out.println("La division de "+myCalculManager.getValeur1()+" et "+myCalculManager.getValeur2()+" est egale a "+ myCalculManager.calculerDivision());

		}
		
		public void int_const(){
			CalculManager myCalculManager=new CalculManager();
			myCalculManager=new CalculManager(9,11);
			System.out.println("La somme de "+myCalculManager.getValeur1()+" et "+myCalculManager.getValeur2()+" est egale a "+ myCalculManager.calculerSomme());
			System.out.println("La Mutiplication de "+myCalculManager.getValeur1()+" et "+myCalculManager.getValeur2()+" est egale a "+ myCalculManager.calculerMultiplication());
			System.out.println("La division de "+myCalculManager.getValeur1()+" et "+myCalculManager.getValeur2()+" est egale a "+ myCalculManager.calculerDivision());
		}
		
		public void int_scan(){
			CalculManager myCalculManager=new CalculManager();
			Scanner s= new Scanner ( System.in ) ; 
			System.out.println (" Veuillez introduire vos nombres ? "); 
			String strValeur1 = s.nextLine (); 
			System.out.println (" Veuillez introduire le deuxieme nombre ? "); 
			String strValeur2 = s.nextLine (); 
			System.out.println (" inputs " + strValeur1+" --- "+strValeur2);
			// controler les entrees utilisateurs
			// Conversion de string en double
			try{
				// Sol 1 : Utiliser la classe Double par constructeur ou methode valueOf
				Double valeur1=new Double(strValeur1);
				// Sol 2 : Utiliser la methodee parseDouble
				double valeur2=Double.parseDouble(strValeur2);
				myCalculManager=new CalculManager(valeur1,valeur2);
				System.out.println("La somme de "+myCalculManager.getValeur1()+" et "+myCalculManager.getValeur2()+" est egale a "+ myCalculManager.calculerSomme());
				System.out.println("La Multiplication de "+myCalculManager.getValeur1()+" et "+myCalculManager.getValeur2()+" est egale a "+ myCalculManager.calculerMultiplication());
				System.out.println("La division de "+myCalculManager.getValeur1()+" et "+myCalculManager.getValeur2()+" est egale a "+ myCalculManager.calculerDivision());

			}catch (NumberFormatException e) {
	                System.out.println("Veuillez introduire un nombre valide");
	                System.out.println("Description technique de l'erreur" + e);
	    }
		}
		
	
}