package ismycake;

import java.util.Random;

public class Producer extends Thread{
	private Panzi panzi;

	public Producer(String name,Panzi panzi) {
		super(name);
		this.panzi = panzi;
	}

	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			Cake cake = new Cake("num");
			System.out.println(Thread.currentThread().getName() + "生产蛋糕" + cake);
			panzi.putCake(cake);
			try {
				Thread.sleep(new Random().nextInt(5000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
