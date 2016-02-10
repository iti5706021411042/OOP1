package homework;
import java.io.*;

import javax.swing.JOptionPane;

import java.util.*;
public class SevenDwarves {

	public static void main(String[] args) 
	{
		Scanner gold = new Scanner(System.in);
		int d1,d2,d3,d4,d5,d6,d7,d8,d9,Total_dwarves ;
		
		
		System.out.printf("Enter Dwarves 1 : ");
		d1 = gold.nextInt();
		while(d1 >= 100)
		{
			System.out.println("Error ");
			System.out.printf("Enter Dwarves 1 : ");
			d1 = gold.nextInt();
			System.out.println();
		}
		System.out.printf("Enter Dwarves 2 : ");
		d2 = gold.nextInt();
		while(d2 >= 100 || d2 == d1)
		{
			System.out.println("Error ");
			System.out.printf("Enter Dwarves 2 : ");
			d2 = gold.nextInt();
			System.out.println();
		}
		System.out.printf("Enter Dwarves 3 : ");
		d3 = gold.nextInt();
		while(d3 >= 100 || d3 == d2 || d3 == d1)
		{
			System.out.println("Error ");
			System.out.printf("Enter Dwarves  3 : ");
			d3 = gold.nextInt();
			System.out.println();
		}
		System.out.printf("Enter Dwarves 4 : ");
		d4 = gold.nextInt();
		while(d4 >= 100 || d4 == d3 || d4 == d2 || d4 == d1)
		{
			System.out.println("Error ");
			System.out.printf("Enter Dwarves 4 : ");
			d4 = gold.nextInt();
			System.out.println();
		}
		System.out.printf("Enter Dwarves 5 : ");
		d5 = gold.nextInt();
		while(d5 >= 100 || d5 == d4 || d5 == d3 || d5 == d2 || d5 == d1)
		{
			System.out.println("Error ");
			System.out.printf("Enter Dwarves 5 : ");
			d5 = gold.nextInt();
			System.out.println();
		}
		System.out.printf("Enter Dwarves 6 : ");
		d6 = gold.nextInt();
		while(d6 >= 100 || d6 == d5 || d6 == d4 || d6 == d3 || d6 == d2 || d6 == d1)
		{
			System.out.println("Error ");
			System.out.printf("Enter Dwarves 6 : ");
			d6 = gold.nextInt();
			System.out.println();
		}
		System.out.printf("Enter Dwarves 7 : ");
		d7 = gold.nextInt();
		while(d7 >= 100 || d7 == d6 || d7 == d5 || d7 == d4 || d7 == d3 || d7 == d2 || d7 == d1)
		{
			System.out.println("Error ");
			System.out.printf("Enter Dwarves 7 : ");
			d7 = gold.nextInt();
			System.out.println();
		}
		System.out.printf("Enter Dwarves 8 : ");
		d8 = gold.nextInt();
		while(d8 >= 100 || d8 == d7 || d8 == d6 || d8 == d5 || d8 == d4 || d8 == d3 || d8 == d2 || d8 == d1)
		{
			System.out.println("Error ");
			System.out.printf("Enter Dwarves 8 : ");
			d8 = gold.nextInt();
			System.out.println();
		}
		System.out.printf("Enter Dwarves 9 : ");
		d9 = gold.nextInt();
		while(d9 >= 100 || d9 == d8 || d9 == d7 || d9 == d6 || d9 == d5 || d9 == d4 || d9 == d3 || d9 == d2 || d9 == d1)
		{
			System.out.println("Error ");
			System.out.printf("Enter Dwarves 9 : ");
			d9 = gold.nextInt();
			System.out.println();
		}
		
		
		Total_dwarves = d1+d2+d3+d4+d5+d6+d7+d8+d9;
		

		
				if((Total_dwarves - d1 - d2) == 100)
				{
					System.out.println("Total_dwarves = "+d3+" "+d4+" "+d5+" "+d6+" "+d7+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d1 - d3) == 100)
				{
					System.out.println("Total_dwarves = "+d2+" "+d4+" "+d5+" "+d6+" "+d7+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d1 - d4) == 100)
				{
					System.out.println("Total_dwarves = "+d2+" "+d3+" "+d5+" "+d6+" "+d7+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d1 - d5) == 100)
				{
					System.out.println("Total_dwarves = "+d2+" "+d3+" "+d4+" "+d6+" "+d7+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d1 - d6) == 100)
				{
					System.out.println("Total_dwarves = "+d2+" "+d3+" "+d4+" "+d5+" "+d7+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d1 - d7) == 100)
				{
					System.out.println("Total_dwarves = "+d2+" "+d3+" "+d4+" "+d5+" "+d6+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d1 - d8) == 100)
				{
					System.out.println("Total_dwarves = "+d2+" "+d3+" "+d4+" "+d5+" "+d6+" "+d7+" "+d9);
				}
				else if((Total_dwarves- d1 - d9) == 100)
				{
					System.out.println("Total_dwarves = "+d2+" "+d3+" "+d4+" "+d5+" "+d6+" "+d7+" "+d8);
				}
				else if((Total_dwarves - d2 - d3) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d4+" "+d5+" "+d6+" "+d7+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d2 - d4) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d3+" "+d5+" "+d6+" "+d7+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d2 - d5) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d3+" "+d4+" "+d6+" "+d7+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d2 - d6) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d3+" "+d4+" "+d5+" "+d7+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d2 - d7) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d3+" "+d4+" "+d5+" "+d6+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d2 - d8) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d3+" "+d4+" "+d5+" "+d6+" "+d7+" "+d9);
				}
				else if((Total_dwarves - d2 - d9) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d3+" "+d4+" "+d5+" "+d6+" "+d7+" "+d8);
				}
				else if((Total_dwarves - d3 - d4) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d5+" "+d6+" "+d7+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d3 - d5) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d4+" "+d6+" "+d7+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d3 - d6) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d4+" "+d5+" "+d7+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d3 - d7) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d4+" "+d5+" "+d6+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d3 - d8) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d4+" "+d5+" "+d6+" "+d7+" "+d9);
				}
				else if((Total_dwarves - d3 - d9) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d4+" "+d5+" "+d6+" "+d7+" "+d8);
				}
				else if((Total_dwarves - d4 - d5) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d3+" "+d6+" "+d7+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d4 - d6) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d3+" "+d5+" "+d7+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d4 - d7) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d3+" "+d5+" "+d6+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d4 - d8) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d3+" "+d5+" "+d6+" "+d7+" "+d9);
				}
				else if((Total_dwarves - d4 - d9) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d3+" "+d5+" "+d6+" "+d7+" "+d8);
				}
				else if((Total_dwarves - d5 - d6) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d3+" "+d4+" "+d7+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d5 - d7) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d3+" "+d4+" "+d6+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d5 - d8) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d3+" "+d4+" "+d6+" "+d7+" "+d9);
				}
				else if((Total_dwarves - d5 - d9) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d3+" "+d4+" "+d6+" "+d7+" "+d8);
				}
				else if((Total_dwarves - d6 - d7) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d3+" "+d4+" "+d5+" "+d8+" "+d9);
				}
				else if((Total_dwarves - d6 - d8) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d3+" "+d4+" "+d5+" "+d7+" "+d9);
				}
				else if((Total_dwarves - d6 - d9) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d3+" "+d4+" "+d5+" "+d7+" "+d8);
				}
				else if((Total_dwarves - d7 - d8) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d3+" "+d4+" "+d5+" "+d6+" "+d9);
				}
				else if((Total_dwarves - d7 - d9) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d3+" "+d4+" "+d5+" "+d6+" "+d8);
				}
				else if((Total_dwarves - d8 - d9) == 100)
				{
					System.out.println("Total_dwarves = "+d1+" "+d2+" "+d3+" "+d4+" "+d5+" "+d6+" "+d7);
				}
				else
				{
					System.out.println("Error ");
				}
				
				
		}
		
	}

