package ȯ������;

import java.util.Scanner;

public class OrderClass {
	int type = 0;
	Scanner scan = new Scanner(System.in);
	
	public int InputNo() {
	    System.out.println("��ǰ��ȣ�� �Է����ּ���. : " );
	    int inputNo = scan.nextInt();
	    return inputNo;
	}
	public int inputCount() {
		System.out.println("��� �����Ͻðڽ��ϱ�? : " );
	    int count = scan.nextInt();	   
	     return count;
	}

	public void inputADD() {
	    System.out.print("1. �߰�����, 2. �������� : " );
	    type = scan.nextInt();	 
	}
} 

