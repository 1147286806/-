package ismycake;

public class CakeTest {
	public static void main(String[] args) {
		Panzi panzi = new Panzi();
		Producer producer = new Producer("厨师", panzi);
		producer.start();
		Consumer consumer = new Consumer(panzi, "顾客");
		consumer.start();
	}
}
