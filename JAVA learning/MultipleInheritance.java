//Multiple Inheritance

interface A  //method declaration
{
	void methodA(); //implement
}
interface B
{
	void methodB();
}
class C implements A, B
{
	public void methodA() //C એ interface A ની methodA ને implement કરી છે
	{
		System.out.println("Method A.");
	}
	
	public void methodB()
	{
		System.out.println("Method B.");
	}
}
class MultipleInheritance //main class
{
	public static void main(String[]args)
	{
		C obj = new C(); // C નો object બનાવ્યો
		obj.methodA(); //methodA call
		obj.methodB(); ////methodA call
	}
}