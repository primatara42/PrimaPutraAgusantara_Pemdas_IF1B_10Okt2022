package primapackage;

import java.util.Scanner;

public class Soal02_Pengkondisian 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int totalBelanja;
		double totalDiskon = 0;
		double diskon;
		
		System.out.print("Masukkan Total Belanja Anda : ");
		totalBelanja = input.nextInt();
		
		if(totalBelanja > 350000)
		{
			diskon = 0.05;
			totalDiskon = totalBelanja * diskon;
		}
		
		else if(totalBelanja >= 200000 && totalBelanja <= 350000)
		{
			diskon = 0.025;
			totalDiskon = totalBelanja * diskon;
		}
		
		totalBelanja = (int) (totalBelanja - totalDiskon);
		
		System.out.println("Total yang Harus Dibayar Adalah " + totalBelanja);
		
		
		
		
	}
}
