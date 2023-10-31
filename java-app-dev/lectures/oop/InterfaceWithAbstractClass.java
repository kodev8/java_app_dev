package lectures.oop;

interface InterfaceWithAbstractClass {
	
	void printInfo() ;
	default void printInfo1() {//Can have body only when it's static/default method
		System.out.println("Printing from Interface!");
	}
	
}

abstract class B implements InterfaceWithAbstractClass{
	int value = 100;
	
	@Override
	public void printInfo() {
		System.out.println("Printing from abstract class");
	}
	
}

class C extends B{
	C(){
		super.printInfo();
	}
	int value = 200;
	public void printInfo() {
		System.out.println("Printing from class " + super.value);
	}
}
