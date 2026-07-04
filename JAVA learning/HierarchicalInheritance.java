//Hierarchical Inheritance

class Animal
{
	void eat()
	{
		System.out.println("Animal eat a food.");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog barks loudly.");
	}
}
class Cat extends Dog
{
	void meow()
	{
		System.out.println("Cat meow softly.");
	}
}
class HierarchicalInheritance
{
	public static void main(String[]args)
	{
		Dog d = new Dog();
		d.bark();

		Cat c = new Cat();
		c.meow();
	}
}
