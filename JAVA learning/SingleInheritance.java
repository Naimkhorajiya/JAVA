   //Single Inheritance

class Parent
{
	void showParent()
	{
		System.out.println("This is Parent class.");
	}
}
class Child extends Parent
{
	void showChild()
	{
		System.out.println("This is child class.");
	}
}
class SingleInheritance
{
	public static void main(String[]args)
	{
		Child c = new Child();
		c.showParent();
		c.showChild();
	}
}