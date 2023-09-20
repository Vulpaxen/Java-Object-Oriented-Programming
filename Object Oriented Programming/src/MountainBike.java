public class MountainBike extends Bicycle {
    // Class MountainBike adding 1 field
    public int seatHeight;

    // Class MountainBike have1 constructor
    public MountainBike(int startHeight, int startSpeed, int startGear ) {
        //super(startSpeed, startGear);
        speed = startSpeed;
        gear = startGear;
        seatHeight = startHeight;
    }

    // Class MountainBike adding 1 function
    public void setHeight ( int newValue ) {
        seatHeight = newValue;
    }

	public void printSpeed() {
		System.out.println("Kecepatan sepeda = "+super.getSpeed());
	}

    public int getHeight()
    {
		return seatHeight;
	}
}
