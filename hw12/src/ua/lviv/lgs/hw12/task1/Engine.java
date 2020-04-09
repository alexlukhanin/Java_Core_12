/**
 * The homework on "Java Core" Course in LOGOS IT Academy
 * Lesson 12 - List
 * 
 * *
 */

package ua.lviv.lgs.hw12.task1;

/**
 * * Application includes Task 1
 * 
 * @author alexl
 * 
 * @version 1.0
 *
 */

public class Engine {
	
	private int cylinderNumber;

	public Engine(int cylinderNumber) {
		super();
		this.cylinderNumber = cylinderNumber;
	}

	public int getCylinderNumber() {
		return cylinderNumber;
	}

	public void setCylinderNumber(int cylinderNumber) {
		this.cylinderNumber = cylinderNumber;
	}

	@Override
	public String toString() {
		return "Engine [cylinderNumber=" + cylinderNumber + "]";
	}
	
	
	
	
}
