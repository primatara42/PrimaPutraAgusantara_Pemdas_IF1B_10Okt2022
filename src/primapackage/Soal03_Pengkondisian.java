package primapackage;

import java.util.Scanner;

public class Soal03_Pengkondisian 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double ipk;
		int sks = 0;
		
		System.out.println("Masukkan IPK Anda : ");
		ipk = input.nextDouble();
		
		if(ipk >= 3.00)
		{
			sks = 24;
		}
		
		else if(ipk <= 2.99 && ipk >= 2.50)
		{
			sks = 21;
		}
		
		else if(ipk <= 2.49 && ipk >= 2.00)
		{
			sks = 18;
		}
		
		else if(ipk <= 1.99 && ipk >= 1.50)
		{
			sks = 15;
		}
		
		else if(ipk < 1.50)
		{
			sks = 12;
		}
		
		System.out.println("Dengan IPK Sebesar " + ipk + ", Anda Mendapatkan " + sks + " SKS");
	}
}
