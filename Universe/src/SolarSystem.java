import java.util.ArrayList;
import java.util.List;

public class SolarSystem 
{
	public String name;
	List<Planet> planets = new ArrayList<Planet>();

	public double size;
	
	public void PrintPlanets()
	{
		System.out.println("Alla planeter i " + this.name.toUpperCase() + ":\n");
		
		for (Planet p : planets)
		{
			System.out.println("Planetens namn:\t\t" + p.name);
			System.out.println("Planetens storlek:\t" + p.diameter + " km");
			String rockOrGas = p.isGas ? "Gas" : "Sten";
			System.out.println("Planetens material:\t" + rockOrGas + "\n");
		}	
	}
}
