package practice;

public class Demo {

	public static void main(String[] args) {
		Cat cat = new Cat("Fluffy",2);
		System.out.println(cat.getName()+" is "+cat.getAge()+" years old.");
		cat.makeSound();

	}

}
