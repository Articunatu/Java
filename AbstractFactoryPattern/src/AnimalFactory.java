
public abstract class AnimalFactory 
{
	public abstract Animal GetAnimal(String Animaltype);
    public static AnimalFactory CreateAnimalFactory(String FactoryType)
    {
        if (FactoryType.equals("Sea"))
        {
            return new SeaAnimalFactory();
        }
        else
        {
            return new LandAnimalFactory();
        }
    }
}