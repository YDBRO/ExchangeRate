package ȯ������;

import java.util.ArrayList;

public class Print {
	
	int totalPrice = 0;

	public void printOrder(ArrayList<OrderListArray> orderList) {

	System.out.println("       [ �� �� �� ]");
	System.out.println("����ī��(������) / 123-45-67890 / ����");
	System.out.println("����Ư���� ������ ������� 20�� 20, 4��");
	System.out.println("02-6049-2611 / 20190430-01-0012");
	System.out.println("-------------------------------------");
	System.out.printf("%-15s %s    %s    %s \n", "��ǰ��", "�ܰ�", "����", "�ݾ�" );
	System.out.println("-------------------------------------");
	for (int index = 0; index < orderList.size(); index++) {
	System.out.printf("%-15s   %d    %d    %d\n", orderList.get(index).name, orderList.get(index).price, orderList.get(index).count, orderList.get(index).price * orderList.get(index).count);}
	System.out.println("-------------------------------------");
	
	System.out.printf("�հ� �ݾ�            %d\n", totalPrice);
	System.out.printf("���� �ݾ�            %d\n", 0);
	System.out.println("-------------------------------------");
	System.out.println("  ** ���γ��� :     ����");
	System.out.println("-------------------------------------");

	
}
 

}
