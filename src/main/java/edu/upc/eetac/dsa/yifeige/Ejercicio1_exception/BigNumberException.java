package edu.upc.eetac.dsa.yifeige.Ejercicio1_exception;

public class BigNumberException extends Exception
{
	public BigNumberException(int a)
	{

	   super("El numero " + a + " es superior a 1000\n");
	  //System.out.printf("El numero " + a + " es superior a 1000");
	  
	}

}
