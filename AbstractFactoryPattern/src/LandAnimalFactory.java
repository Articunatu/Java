
public class LandAnimalFactory extends AnimalFactory
{
	public Animal GetAnimal(String Animaltype)
    {
        if (Animaltype.equals("Lion"))
        {
            return new Lion();
        }
        else if (Animaltype.equals("Cat"))
        {
            return new Cat();
        }
        else
        {
            return new Dog();
        }
    }
}