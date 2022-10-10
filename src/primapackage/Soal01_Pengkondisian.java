package primapackage;

import java.util.Scanner;

public class Soal01_Pengkondisian 
{
	public static void main(String[] args)
	{
		int suhu;
		String pernyataan = null;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Temperatur : " );
		suhu = input.nextInt();
		System.out.println(suhu + " Derajat Celcius");
		
		if(suhu <= 0 )
		{
			pernyataan = "Keadaan Beku";
		}
		
		else if(suhu > 0 && suhu < 100)
		{
			pernyataan = "Keadaan Cair";
		}
		
		else if(suhu >= 100)
		{
			pernyataan = "Keadaan Menguap";
		}
		
		System.out.println(pernyataan);
		
	}
}
