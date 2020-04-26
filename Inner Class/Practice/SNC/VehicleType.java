public class VehicleType
{
	interface Vehicle
	{
		public int getNoOfWheels();
	}
	
	abstract class Bus implements Vehicle
	{
		public int Vehicle()
		{
			return 6;
		}
	}
	
	abstract class Car implements Vehicle
	{
		public int Vehicle()
		{
			return 4;
		}
	}
	public static void main(String[] args)
	{
		VehicleType vt = new VehicleType();
		vt.Bus();
		vt.Car();
	}
}