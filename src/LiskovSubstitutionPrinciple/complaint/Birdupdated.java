package LiskovSubstitutionPrinciple.complaint;

/*In the following example we are able to replace all the objects with their sub types*/
public class Birdupdated{
	public static void main(String[] args) {
		makeBirdFly(new Sparrow());
		Bird bird = new Ostrich();
		bird.eat();
	}
	public static void makeBirdFly(Flyable bird) {
		bird.fly();
	}
}
interface Bird{
	public void eat();
}
interface Flyable extends Bird{
	public void fly();
}
class Sparrow implements Flyable{

	@Override
	public void fly() {
		System.out.println("Sparrow is Flying !!");
	}

	@Override
	public void eat() {
		System.out.println("Sparrow is Eating !!");
	}	
}
class Ostrich implements Bird{

	@Override
	public void eat() {
		System.out.println("Ostrich is Eating !!");
	}
	
}
