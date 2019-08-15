package session8;

public class PrimeThreadMain {

	public static void main(String[] args) {
		PrimeThread pt1=new PrimeThread(37);
		PrimeThread pt2=new PrimeThread(55);
		pt1.start();
		pt2.start();
	}

}
