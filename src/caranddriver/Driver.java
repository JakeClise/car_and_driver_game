package caranddriver;

public class Driver extends Car{
	
	public Driver() {};
	
	public  Boolean isGameOver() {
		if (this.checkGas() <= 0) {
			return true;
		}
		return false;
	}
	
	public String Drive () {
		this.setGas(1);
		if (this.isGameOver()) {
			return "You are out of gas, game over.";
		}
		return "You are driving the car.\nGas remaining: " + this.checkGas() + "/10";
	}
	
	
	public String useBoosters() {
		this.setGas(3);
		if (this.isGameOver()) {
			return "You are out of gas, game over.";
		}
		return "You have used the boosters.\n Gas remaining: " + this.checkGas() + "/10";
		
	
	}
	
	public String refuel() {
		if (this.isGameOver()) {
			return "You are out of gas, game over.";	
		}
		this.setGas(-2);
		return "You are refueling the car.\n Gas remaining: " + this.checkGas() + "/10";
	}
}
	

	
