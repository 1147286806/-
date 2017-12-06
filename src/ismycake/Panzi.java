package ismycake;

import java.awt.List;
import java.util.LinkedList;

public class Panzi {
	private LinkedList<Cake> linkedList = new LinkedList<Cake>();
	public static void main(String[] args) {
		LinkedList<Cake> list = new LinkedList<Cake>();
		list.addLast(new Cake("nums"));
		list.removeFirst();
	}
	
	public synchronized void putCake(Cake cake) {
		linkedList.addLast(cake);
		notifyAll();
		System.out.println("发出提醒");
	}
	
	public synchronized Cake getCake() {
		if (linkedList.size() <= 0) {
			try {
				System.out.println("请等待");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Cake cake = linkedList.removeFirst();
		return cake;
	}
}
