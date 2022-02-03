
public class Program {

	public static void main(String[] args) 
	{
		Animal animal;
        AnimalFactory animalFactory;
        animalFactory = AnimalFactory.CreateAnimalFactory("Sea");
        System.out.println("Animal Factory type : " + animalFactory.getClass().getName());
        animal = animalFactory.GetAnimal("Sharp");
        System.out.println("Animal type : " + animal.getClass().getName());
        System.out.println(animal.Speak());
        System.out.println("--------------");
        animalFactory = AnimalFactory.CreateAnimalFactory("Land");
        System.out.println("Animal Factory type : " + animalFactory.getClass().getName());
        animal = animalFactory.GetAnimal("Lion");
        System.out.println("Animal type : " + animal.getClass().getName());
        System.out.println(animal.Speak());
	}
}
