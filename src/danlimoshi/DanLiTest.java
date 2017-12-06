package danlimoshi;

public class DanLiTest {
	public static void main(String[] args) {
		Lanhanshi lanhanshi = Lanhanshi.getInstance();
		Lanhanshi lanhanshi2 = Lanhanshi.getInstance();
		System.out.println(lanhanshi == lanhanshi2);
		Ehanshi ehanshi = Ehanshi.getInstance();
		Ehanshi ehanshi2 = Ehanshi.getInstance();
		System.out.println(ehanshi == ehanshi2);
	}
}
