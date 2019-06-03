/**
 * 
 */
package com.jevcodes.Factory.FactoryExamples;

/**
 * @author Jevic
 *
 */
public class TeacherFactory {

	public static Teacher createTeacher(Class a) {
		if(a == ComputerScienceTeacher.class) {
			return new ComputerScienceTeacher();
		}
		else if (a == MathTeacher.class) {
			return new MathTeacher();
		}
		else if (a == GymTeacher.class) {
			return new GymTeacher();
		}
		else return new GenericTeacher();
	}
}
