package ȯ������;
import java.util.Scanner;

public class exchangerate {
	



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			final double EXCAHNGE_RATE_USD = 1131.80;
			final double EXCAHNGE_RATE_EUR = 1346.23;
			final double EXCAHNGE_RATE_JPY = 10.25;
			
			double MONEY_TO_EXCHANGE_KOR, exchangeRate, RESULT_OF_EXCHANGE;
			int changeMoney, changeKOR;
			String selectedTypeText;
			
			Scanner myInput = new Scanner(System.in);
			System.out.print("���� ��ȭ �Է� : ");
			MONEY_TO_EXCHANGE_KOR = myInput.nextDouble();
			System.out.printf("\n 1:USD, 2:EUR, 3:JPY?\n");
			int option = myInput.nextInt();		
			myInput.close();
			
			if (option == 1) {
				selectedTypeText = "USD";
				exchangeRate = EXCAHNGE_RATE_USD;			
			} else if (option == 2) {
				selectedTypeText = "EUR";
				exchangeRate = EXCAHNGE_RATE_EUR;
			} else {
				selectedTypeText = "JPY";
				exchangeRate = EXCAHNGE_RATE_JPY;
			}
			System.out.printf("%s��(��) �����Ͽ����ϴ�.\n", selectedTypeText);
			RESULT_OF_EXCHANGE = MONEY_TO_EXCHANGE_KOR / exchangeRate;
			changeMoney = (int) RESULT_OF_EXCHANGE;
			RESULT_OF_EXCHANGE = RESULT_OF_EXCHANGE - changeMoney;
			changeKOR = (int) (RESULT_OF_EXCHANGE * exchangeRate);
			changeKOR = changeKOR / 10 * 10;
			
			System.out.printf("\n���� ȯ���� 1 %s�� %f ���Դϴ�.", selectedTypeText, exchangeRate);
			System.out.printf("\nȯ���ݾ� : %d %s", changeMoney, selectedTypeText);
			switch(option) {
			case 1:
				System.out.println("\n$100 ���� " + (int) changeMoney / 100 + " ��");
				System.out.println("$50 ���� " + (int) changeMoney % 100 / 50 + " ��");
				System.out.println("$20 ���� " + (int) changeMoney % 100 % 50 / 20 + " ��");
				System.out.println("$10 ���� " + (int) changeMoney % 100 % 50 % 20 / 10 + " ��");
				System.out.println("$5 ���� " + (int) changeMoney % 100 % 50 % 20 % 10 / 5 + " ��");
				System.out.println("$1 ���� " + (int) changeMoney % 100 % 50 % 20 % 10 % 5 / 1 + " ��");			
			break; 
			case 2: 
				System.out.println("\n200���α� " + (int) changeMoney / 200 + " ��");
				System.out.println("100���α� " + (int) changeMoney % 200 / 100 + " ��");
				System.out.println("50���α� " + (int) changeMoney % 200 % 100 / 50 + " ��");
				System.out.println("20���α� " + (int) changeMoney % 200 % 100 % 50 / 20 + " ��");
				System.out.println("10���α� " + (int) changeMoney % 200 % 100 % 50 % 20 / 10 + " ��");
				System.out.println("5���α� " + (int) changeMoney % 200 % 100 % 50 % 20 % 10 / 5 + " ��");
				System.out.println("2���ε��� " + (int) changeMoney % 200 % 100 % 50 % 20 % 10 % 5 / 2 + " ��");
				System.out.println("1���ε��� " + (int) changeMoney % 200 % 100 % 50 % 20 % 10 % 5 % 2 / 1 + " ��");
			 break;
			 default:
				System.out.println("\n10000���� " + (int) changeMoney / 10000 + " ��");
				System.out.println("5000���� " + (int) changeMoney % 10000 / 5000 + " ��");
				System.out.println("2000���� " + (int) changeMoney % 10000 % 5000 / 2000 + " ��");
				System.out.println("1000���� " + (int) changeMoney % 10000 % 5000 % 2000 / 1000 + " ��");
				System.out.println("500������ " + (int) changeMoney % 10000 % 5000 % 2000 % 1000 / 500 + " ��");
				System.out.println("100������ " + (int) changeMoney % 10000 % 5000 % 2000 % 500 / 100 + " ��");
				System.out.println("50������ " + (int) changeMoney % 10000 % 5000 % 2000 % 500 % 100 / 50 + " ��");
				System.out.println("10������ " + (int) changeMoney % 10000 % 5000 % 2000 % 500 % 100 % 50 / 10 + " ��");
				System.out.println("1������ " + (int) changeMoney % 10000 % 5000 % 2000 % 500 % 100 % 50 % 10 / 1 + " ��");	
			}
			// ��ȭ �Ž�����
			System.out.println("\n�Ž����� : " + changeKOR + " ��");
			System.out.println("\n5������ " + (int) changeKOR / 50000 + " ��");
			System.out.println("1������ " + (int) changeKOR % 50000 / 10000 + " ��");
			System.out.println("5õ���� " + (int) changeKOR % 50000 % 10000 / 5000 + " ��");
			System.out.println("1õ���� " + (int) changeKOR % 50000 % 10000 % 5000 / 1000 + " ��");
			System.out.println("500�� " + (int) changeKOR % 50000 % 10000 % 5000 % 1000 / 500 + " ��");
			System.out.println("100�� " + (int) changeKOR % 50000 % 10000 % 5000 % 1000 % 500 / 100 + " ��");
			System.out.println("50�� " + (int) changeKOR % 50000 % 10000 % 5000 % 1000 % 500 % 100 / 50 + " ��");
			System.out.println("10�� " + (int) changeKOR % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50 / 10 + " ��");
		
		myInput.close();
		}

	}



