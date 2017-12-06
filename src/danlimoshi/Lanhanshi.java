package danlimoshi;

public class Lanhanshi {
	private static Lanhanshi instance = null;

	private Lanhanshi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public synchronized static Lanhanshi getInstance() {
		if (instance == null) {
			instance = new Lanhanshi();
		}
		return instance;
	}
}
