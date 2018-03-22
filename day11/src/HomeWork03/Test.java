package HomeWork03;

public class Test {
	public static void main(String[] args) {
		//普通car
		PTCar p = new PTCar();
		p.run();
		System.out.println("=======");
		
		//高端car
		GDCar g = new GDCar();
		g.run();
		g.jiao();
		g.stop();
	}
}
