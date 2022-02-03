
public class UniverseController 
{

	public static void main(String[] args) 
	{
		Planet tellus = new Planet();
        tellus.name = "Tellus";
        tellus.diameter = 9.87;
        tellus.isGas = false;
        
        Planet mars = new Planet();
        mars.name = "Mars";
        mars.diameter = 6.65;
        mars.isGas = false;
        
        Planet jupiter = new Planet();
        jupiter.name = "Jupiter";
        jupiter.diameter = 52.48;
        jupiter.isGas = true;
         
        
        SolarSystem solarSystem = new SolarSystem();
        solarSystem.name = "Solsystemet";
        solarSystem.planets.add(tellus);
        solarSystem.planets.add(mars);
        solarSystem.planets.add(jupiter);

        solarSystem.PrintPlanets();
	}
}
