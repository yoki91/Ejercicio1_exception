package edu.upc.eetac.dsa.yifeige.Ejercicio1_exception;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers 
{

	public void ReadList() 
	{
		// The FileWriter constructor throws IOException, which must be caught.
		
		try (BufferedReader in= new BufferedReader(new FileReader("OutFile.txt")))
		{
		  int line = 0;
		  for (String x = in.readLine(); x != null; x = in.readLine()) 
		   {
					line++;
					int entero=Integer.parseInt(x);
					System.out.println(entero);
					if(entero>1000)
					throw new BigNumberException(entero);
		    }
			  in.close();
		}
		catch(BigNumberException e)
		{
			  System.out.println("Error de exception Numero " + e.getMessage());
		}
		catch (IOException e) 
		{
		  System.out.println("Error de exceptionIO: " + e.getMessage());
		  
		} 
		catch (IndexOutOfBoundsException e) 
		{
			System.out.println("Error de exception IndexOutOfBound: "+ e.getMessage());
		}
		

	}
}
