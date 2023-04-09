package oops;

class Dog{
	protected String Breed = "Labrador";
	public String Bark() {
		String str = "Barking Sound.........";
		return str;
	}
}

class Tommy extends Dog {
	public String petname = "Tommy";

}
public class Inheritance{
	public static void main(String[] arg) {
			Tommy t = new Tommy();
			System.out.println("Pet Name: " + t.petname + "\nBreed: " + t.Breed + "\nDoes: " + t.Bark());
		
	}
}