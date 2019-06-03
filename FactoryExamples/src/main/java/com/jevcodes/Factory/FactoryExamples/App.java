package com.jevcodes.Factory.FactoryExamples;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Teacher csTeacher = TeacherFactory.createTeacher(ComputerScienceTeacher.class);
    	
    	System.out.println(csTeacher.teachTodaysLesson());

    	Teacher mathTeacher = TeacherFactory.createTeacher(MathTeacher.class);
    	
    	System.out.println(mathTeacher.teachTodaysLesson());
    	
    	Teacher studentTeacher = TeacherFactory.createTeacher(Teacher.class);
    	
    	System.out.println(studentTeacher.teachTodaysLesson());
    	
    	//student teacher becomes a GymTeacher.
    	studentTeacher = TeacherFactory.createTeacher(GymTeacher.class);
    	
    	System.out.println(studentTeacher.teachTodaysLesson());
    	
    }
}
