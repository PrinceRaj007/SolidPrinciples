package LiskovSubstitutionPrinciple.noncomplaint;

/*All the objects should be replaceable with their subtypes according to LSP, but here in makeBirdFlu method when Bird 
 * object is replaced with it's subtype Ostrich it throw an Exception as Ostrich doesn't support fly() method*/
class BirdDriver{
	public static void main(String[] args) {
		makeBirdFly(new Sparrow());
		makeBirdFly(new Ostrich());
	}
	public static void makeBirdFly(Bird bird) {
		bird.fly();
	}
}
class Bird {
	public void eat() {
		System.out.println("Bird is Eating !!");
	}
	public void fly() {
		System.out.println("Bird is Flying !!");
	}
}
class Sparrow extends Bird{
	public void eat() {
		System.out.println("Sparrow is Eating !!");
	}
	public void fly() {
		System.out.println("Sparrow is Flying !!");
	}
}
class Ostrich extends Bird {
	public void eat() {
		System.out.println("Ostrich is eating !!");
	}
	public void fly() {
		System.out.println("Ostrich can't Fly !!");
		throw new UnsupportedOperationException("!! Unsupported Action !!");
	}
}
