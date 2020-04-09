/**
 * The homework on "Java Core" Course in LOGOS IT Academy
 * Lesson 12 - List
 * 
 * *
 */

package ua.lviv.lgs.hw12.task1;

/**
 * * Application includes Task1
 * 
 * @author alexl
 * 
 * @version 1.0
 *
 */

public class Helm {
	
	private float diameter;
	private String material;
	/*Constructor declaration*/
	public Helm(float diameter, String material) {
		super();
		this.diameter = diameter;
		this.material = material;
	}
	public float getDiameter() {
		return diameter;
	}
	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Helm [diameter=" + diameter + ", material=" + material + "]";
	}
	
	
	
	
}
