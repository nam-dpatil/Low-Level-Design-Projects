package org.jspider.DS;

public class QueMain {

	public static void main(String[] args) {
		Quee q = new Quee(5);
		q.enQue(10);
		q.enQue(20);
		q.enQue(30);
		q.enQue(40);
		q.enQue(50);
		
//		q.display();
		q.deQue();
		q.display();
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		

	}

}
