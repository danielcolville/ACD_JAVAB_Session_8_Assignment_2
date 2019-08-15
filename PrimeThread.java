package session8;

public class PrimeThread extends Thread implements Runnable {
	
	int num;
	PrimeThread(int num) {
		this.num=num;
	}
	@Override
	public void run() {
		super.run();
		int breakpoint=num/2;
		if(num==0||num==1) {
			System.out.println(num+" is not Prime");
			return;
		}
		else {
			for(int i=2;i<=breakpoint;i++) {
				if(num%i==0) {
					System.out.println(num+" is not Prime");	
					return;
				}
			}
		}
		System.out.println(num+" is prime");
	}
}
