package program.wait.demo1;

public class Output implements Runnable {
	private Resource r = new Resource();

	public Output(Resource r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		while(true) {
			r.out();
		}
	}
	
}
