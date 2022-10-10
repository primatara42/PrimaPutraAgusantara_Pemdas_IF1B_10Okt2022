package primapackage;

import java.util.Scanner;

public class Latihan_01 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int bilangan1;
		System.out.print("Masukkan Angka : ");
		bilangan1 = input.nextInt();
		
		if(bilangan1 % 2 == 0)
		{
			System.out.println("Bilangan1 Adalah Jenis Bilangan Genap");
		}
		
		else
		{
			System.out.println("Bilangan1 Adalah Jenis Bilangan Ganjil");
		}
	}
}
