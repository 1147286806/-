package danlimoshi;

public class Ehanshi {
	private static final Ehanshi instance = new Ehanshi();

	private Ehanshi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static Ehanshi getInstance() {
		return instance;
	}
}
