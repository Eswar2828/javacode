class Animal
{
	public void eat()
	{
		System.out.println("Animal is eating");
	}
	public void sleep()
	{
		System.out.println("Animal is sleeping");
	}
}
class Tiger extends Animal
{
	public void eat()
	{
		System.out.println("Tiger is eating");
	}
	public void foodHabbit()
	{
		System.out.println("Tiger can eat only meet");
	}
}
class Deer extends Animal
{
	public void eat()
	{
		System.out.println("Deer is eating");
	}
	public void foodHabbit()
	{
		System.out.println("Deer can eat only grass");
	}
}
class Monkey extends Animal
{
	public void eat()
	{
		System.out.println("Monkey is eating");
	}
	public void foodHabbit()
	{
		System.out.println("Monkey can eat whatever you give");
	}
}
class Animals 
{
	public static void main(String[] args) 
	{
		Tiger t=new Tiger();
		Deer d=new Deer();
		Monkey m=new Monkey();
		t.eat();
		t.sleep();
		System.out.println();
		d.eat();
		d.sleep();
		System.out.println();
		m.eat();
		m.sleep();
		System.out.println();
	}
}
