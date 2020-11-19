//FELLIPE SOARES ROMANO CB3005411
//STEFANY LISBOA DA SILVA CB3005551

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Student student = new Student("stefany","emailauthor@author", "program", 2010, 2.0);

        System.out.println(student.toString());

        student.setAdress();
        student.setProgram();
        student.setYear();
        student.setFee();
        System.out.println(student.toString());
	}

}