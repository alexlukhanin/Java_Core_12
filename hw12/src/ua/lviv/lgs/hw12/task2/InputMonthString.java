/**
 * The homework on "Java Core" Course in LOGOS IT Academy
 * Lesson 12 - List
 * 
 * *
 */

package ua.lviv.lgs.hw12.task2;

//import java.util.ArrayList;
//import java.util.List;

/**
 * * Console application with exception Task2
 * 
 * @author alexl
 * 
 * @version 1.0
 *
 */

public class InputMonthString {
	/*
	 * This class checks month input from the user and assigns value of string, when
	 * it's correct
	 */

	Months[] monMas = Months.values();
	private String string;
	boolean flag = false;

	public InputMonthString(String string) {
		super();
		// boolean flag = false;
		for (Months m : monMas) {
			if (m.name().equals(string)) {
				System.out.println("¬ведений м≥с€ць " + string + " ≥снуЇ");
				flag = true;
			}
		}

		if (flag) {
			this.string = string;
		} else {
			try {
				throw new WrongInputConsoleParametersException("“акого м≥с€ц€ не ≥снуЇ, спробуйте ще:");
			} catch (WrongInputConsoleParametersException e) {
				System.out.println(e.getMessage());
			}

		}
	}

	public String getString() {
		return string;
	}

}
