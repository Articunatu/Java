
public class SeaAnimalFactory extends AnimalFactory
{
	public  Animal GetAnimal(String Animaltype)
    {
        if (Animaltype.equals("Octupus"))
        {
            return new Octupus();
        }
        else
        {
            return new Shark();
        }
    }
}