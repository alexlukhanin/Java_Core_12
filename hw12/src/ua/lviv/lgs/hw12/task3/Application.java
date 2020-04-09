/**
 * The homework on "Java Core" Course in LOGOS IT Academy
 * Lesson 12 - List
 * 
 * *
 */


package ua.lviv.lgs.hw12.task3;

/**
 * * Application includes Task 3
 * 
 * @author alexl
 * 
 * @version 1.0
 *
 */

public class Application {

	public static void main(String[] args) {

		int intNumber = 198;
		Double doubleNumber = 56.2565999;
		
		
		
		SimpleArrayList simpleArrayList = new SimpleArrayList();
		System.out.println(simpleArrayList);
		
		
		simpleArrayList.add(15);
		simpleArrayList.add("red");
		simpleArrayList.add("blue");
		simpleArrayList.add(45.222544455);
		simpleArrayList.add('a');
		simpleArrayList.add('b');
		simpleArrayList.add(intNumber);
		simpleArrayList.add(doubleNumber);
		
		System.out.println(simpleArrayList);
		
		
		simpleArrayList.remove(3);
		System.out.println(simpleArrayList);
		
		for (int i =0; i < 3; i++) {
			simpleArrayList.remove(3);
			System.out.println(simpleArrayList);
		}
		
		
		for (int i =0; i < 20; i++) {
			simpleArrayList.add("Cat");
			System.out.println(simpleArrayList);
		}
		
		for (int i =0; i < 5; i++) {
			simpleArrayList.remove(15);
			System.out.println(simpleArrayList);
		}
		
		for (int i =0; i < 15; i++) {
			simpleArrayList.remove(2);
			System.out.println(simpleArrayList);
		}
		
	}

}
