package Lab;
abstract class Animal{
	protected int legs;
	Animal(int legs){
		this.legs=legs;
	}
	abstract void eat();
	void walk() {
		if(legs!=0)
		System.out.println("this animal walks by "+legs+" legs");
		else
			System.out.println("fish has no legs");
	}
}	
class Spider extends Animal{
	Spider(int legs){
		super(legs);
	}
	void eat() {
		System.out.println("spider eats insects");
	}
	
}
interface Pet{
	static void getname() {}
	static void setname(String name) {}
	static void play() {}
}
class Cat extends Animal implements Pet{
	String name;
	//Cat(){
		//this("");
	//}
	Cat(String name,int legs){
		super(legs);
		this.name=name;
	}
	
	String getname() {
		return name;
	}
	void setname(String name) {
		
		System.out.println("this cats name is "+name);
	}
	void eat() {
		System.out.println("caT eats fishes");
	}
	void play() {
		System.out.println("cat play with rats");
	}
}
class Fish extends Animal implements Pet {
	String name;
	Fish(String name,int legs){
		super(legs);
		this.name=name;
	}
	String getname() {
		return name;
	}
	
	void setname(String name) {
		System.out.println("this fish name is "+name);
	}
	void eat() {
		System.out.println("fish eats plants");
	}
}
public class AnimalPlanet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("FISH");
		Fish f=new Fish("mimi",0);
		System.out.println("this fish name is"+f.getname());
		f.eat();
		f.walk();
		f.setname("momo");
		Cat c = new Cat("fluffy",4);
		System.out.println("CAT");
		System.out.println("this cats name is"+c.getname());
		c.walk();
		c.play();
		c.eat();
		c.setname("moose");
		
		System.out.println("SPIDER");
		Animal e=new Spider(8);
		e.eat();
		e.walk();
	}

}
