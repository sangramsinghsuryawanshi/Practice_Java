/*
Question

Create a program to demonstrate Runtime Polymorphism using method overriding.

Requirements
Create a parent class Animal.
Create child classes Dog and Cat.
Override the sound() method.
Call the overridden methods using the parent class reference.
Input
No Input
Output
Dog is Barking

Cat is Meowing
*/
class Animal
{
	public void sound()
	{
		System.out.println("Animal sound");
	}
}
class Dog extends Animal
{
	public void sound()
	{
		System.out.println("Dog is Barking");
	}
}
class Cat extends Animal
{
	public void sound()
	{
		System.out.println("Cat is Meowing");
	}
}
public class MethodOverriding
{
	public static void main(String[]ar)
	{
		Animal animal = new Dog(); // loos coupling
		animal.sound();

		Animal ani = new Cat();
		ani.sound();
	}
}
