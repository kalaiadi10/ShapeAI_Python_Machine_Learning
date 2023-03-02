package corejava;
//parent class
 class Animal 
 {

	//method
	 public void display()
	 {
		 System.out.println("Inside parent class");

	}

}
 //child class
class Dog extends Animal 
 {
public void sound()
	{
		System.out.println("Barks,,, ");
	}
 }
// main class
class Tester{
	public static void main(String[] args)
	{
		//create an object of  CHILD class
		
		Dog d= new Dog();
		d.display();
		d.sound();
	}
	
}