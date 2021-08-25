package F02aPPAP;

public class MinTraad extends Thread {

	public MinTraad(String name) {
		Thread.currentThread().setName(name);
	}

	@Override
	public void run() {
		String navn = Thread.currentThread().getName();
		System.out.println("Hallo fra " + navn);

	}

}
