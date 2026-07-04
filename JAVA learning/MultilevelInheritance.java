//Multilevel Inheritance

class GrandParent
{
	void display()
	{
		System.out.println("Grandparent class");
	}
}
class Parent extends GrandParent
{
	void displayParent()
	{
		System.out.println("Parent class");
	}
}
class Child extends Parent
{
	void displayChild()
	{
		System.out.println("Child class");
	}
}

class MultilevelInheritance
{
	public static void main(String[]args)
	{
		Child c = new Child(); //create a obj (child)
		c.display();
		c.displayParent();
		c.displayChild();
	}
}