import java.util.Scanner;

public class Ejer1 {
	static int Es_primo(int num) 
	{
		int i,sw=0;
		for(i=2;i<num;i++)
		{
			if(num%i==0) 
			{
				sw=1;
			}
		}
		return sw;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hola Amigos");
		
		/*int numeros;
		numeros = (int)5.3;
		System.out.println(numeros);*/
		
		//Entrdas de datos
		/*
		Scanner lee = new Scanner(System.in);
		
		int num;
		System.out.println("Intro n:");
		num = lee.nextInt();
		System.out.println("El dato es "+num);*/
		
		//Estructuras if
		/*Scanner lee = new Scanner(System.in);
		
		int num;
		System.out.println("Intro n:");
		num = lee.nextInt();
		System.out.println("El dato es "+num);
		if(num > 20) 
		{
			System.out.println("Es mayor a 20");
		}
		else 
		{
			System.out.println("Es menor a 20");
		}*/
		
		//Estructura de for
		/*Scanner lee = new Scanner(System.in);
		
		int num,i;
		System.out.println("Intro n:");
		num = lee.nextInt();
		
		
		for(i=1;i<=num;i=i+1) 
		{
			System.out.println(i);
		}*/
		
		//Estructura while
		// Dado un lote num. verificar que sea par 
		// Salir cuando sea un numero -1
		/*Scanner lee = new Scanner(System.in);
		
		int num;
		System.out.println("Intro n:");
		num = lee.nextInt();
		
		while(num != -1) 
		{
			if(num%2==0) 
			{
				System.out.println("Es par");
			}
			System.out.println("Intro n:");
			num = lee.nextInt();
		}*/
		
		//Descomposicion
		/*Scanner lee = new Scanner(System.in);
		int num,dig;
		System.out.println("Intro n:");
		num = lee.nextInt();
		// declarar la variable dig
		
		while(num!=0) 
		{
			dig = num%10;
			num = num/10;
			System.out.println("El dig por derecha es "+dig);
		}*/
		
		//Por izq
		/*Scanner lee = new Scanner(System.in);
		int num,dig,cd;
		System.out.println("Intro n:");
		num = lee.nextInt();
		// declarar la variable dig, cd
		cd = (int) (Math.log10(num)+1);
		
		while(num!=0) 
		{
			dig = (int) (num/Math.pow(10, cd-1));
			num = (int) (num%Math.pow(10, cd-1));
			cd--;//cd = cd-1;
			System.out.println("El dig por izq. es "+dig);
		}*/
		// Funciones
		Scanner lee = new Scanner(System.in);
		int num,primos;
		System.out.println("Intro n:");
		num = lee.nextInt();
		
		primos = es_primo_x(num);
		if(primos==0) 
		{
			System.out.println("Es primo");
		}
		else
		{
			System.out.println("No es primo");
		}
	}
}
