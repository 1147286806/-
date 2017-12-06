package ismycake;

import java.util.Random;

public class Consumer extends Thread{
	private Panzi panzi;

	public Consumer(Panzi panzi,String name) {
		super(name);
		this.panzi = panzi;
	}
	
	@Override
	public void run() {
		for (int i = 1; i < 1000; i++) {
			Cake cake = panzi.getCake();
			System.out.println(Thread.currentThread().getName() + "得到蛋糕" + cake);
			try {
				Thread.sleep(new Random().nextInt(5000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
