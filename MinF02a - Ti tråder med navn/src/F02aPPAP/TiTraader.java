package F02aPPAP;

public class TiTraader {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());

		Runnable r = new MinRunnable();

		for (int i = 1; i <= 10; i++) {
			Thread t = new Thread(r, "Tr�d #" + i);
			t.start();

		}
		
//		for (int i = 1; i <= 10; i++) {
//			Thread t2 =  new MinTraad("Tr�d #" + i);
//			t2.start();
//
//		}
	}
}

class MinRunnable implements Runnable {
	@Override
	public void run() {
		String navn = Thread.currentThread().getName();
		System.out.println("Hallo fra " + navn);
	}
}