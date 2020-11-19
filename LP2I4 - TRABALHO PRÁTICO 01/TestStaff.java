//FELLIPE SOARES ROMANO CB3005411
//STEFANY LISBOA DA SILVA CB3005551

import java.util.Scanner;

public class TestStaff {

	public static void main(String[] args) {
		Staff staff = new Staff("stefany","emailauthor@author", "school", 100.0);

        System.out.println(staff.toString());

        staff.setAdress();
        staff.setSchool();
        staff.setPay();
        System.out.println(staff.toString());  
	}

}