package ȯ������;

import java.util.Scanner;
public class Total_Won {

		public double MONEY_TO_EXCHANGE_KOR = 0;
		public int option = 0;
		
		public void Insert_Won() {
			
			Scanner myInput = new Scanner(System.in);
			System.out.print("���� ��ȭ �Է� : ");
			MONEY_TO_EXCHANGE_KOR = myInput.nextDouble();
			System.out.printf("\n 1:USD, 2:EUR, 3:JPY?\n");
			int option = myInput.nextInt();		
			
			myInput.close();
		}
}
