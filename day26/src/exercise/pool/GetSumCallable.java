package exercise.pool;

import java.util.concurrent.Callable;

public class GetSumCallable implements Callable<Integer> {
	int x;
	int y;
	public GetSumCallable() {super();};
	public GetSumCallable(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Integer call() throws Exception {
		
		return x+y;
	}
	
}
