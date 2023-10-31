package lectures.oop;

public class Main {

	public static void main(String[] args) {

		  Bank b = new Bank();
		  b.customerPin();
		  b.printInfo();
		 

		// Cannot instantiate abstract class
		// AbstractExample a = new AbstractExample();

		C c = new C();
		c.printInfo();
		c.printInfo1();

		// Child ex = new Child();
		// ex.printInfo();

		// InterfaceExampleVehicle v = new Car("BMW", "1000", 35000);
		// System.out.println(v.getBrand());

		// Circle c = new Circle();
		// c.draw();
		// c.completedraw();

	}

}
