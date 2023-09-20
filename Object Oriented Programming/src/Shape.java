abstract class Shape2 {

	public String color;
	public Shape2() {
	}
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	abstract public double area();
}