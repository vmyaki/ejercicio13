import java.util.Scanner;

public class clase13 {

	public static void main(String[] args) {
		// Declaramos variables
		
		int num;
		
		//Mensaje
		
		System.out.println("Introduce un n�mero:");
		
		//Creamos una clase o objeto para poder pedir por teclado
		
		Scanner teclado=new Scanner (System.in);
		
		num=teclado.nextInt();
		
		//calculo
		
		if(num%2==0)
		{
			System.out.println("El n�mero es par");
		}
		else
		{
			System.out.println("El n�mero es impar");
		}
	
	}

}
