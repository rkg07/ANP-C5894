package Oops;

//Define interface
interface Animalss 
{
	// Abstract method signatures (no implementation)
  void makeSound();
  void eat();
}

//Implement the interface in a class
class Dogss implements Animalss 
{
@Override
public void makeSound()
{
   System.out.println("Dog barks");
}

@Override
public void eat()
{
   System.out.println("Dog eats bones");
}
}

class Cat implements Animalss 
{
@Override
public void makeSound()
{
   System.out.println("Cat meows");
}

@Override
public void eat() 
{
   System.out.println("Cat eats fish");
}
}

class InterfaceExample
{
public static void main(String[] args) 
{
   Animalss dog = new Dogss();
   Animalss cat = new Cat();

   dog.makeSound(); // Output: Dog barks
   dog.eat();       // Output: Dog eats bones

   cat.makeSound(); // Output: Cat meows
   cat.eat();       // Output: Cat eats fish
}
}