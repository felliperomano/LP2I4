//FELLIPE SOARES ROMANO CB3005411
//STEFANY LISBOA DA SILVA CB3005551

import java.util.Scanner;

public class Staff extends Person {
	Scanner s = new Scanner(System.in);
	private String school;
	private double pay;
	
	public Staff(String n, String a, String s, Double p) {
		super(n, a);
		this.school = s;
		this.pay = p;
	}
	
	public String getSchool() {
		return school;
	}
	
	public void setSchool() {
		System.out.println("Digite a escola");
		school = s.next();
	}
	
	public double getPay() {
		return pay;
	}
	
	public void setPay() {
		System.out.println("Digite o pagamento");
		pay = s.nextDouble();
	}
	
	public String toString(){
		return "Staff[Person[name" + getName() + ", adress=" + getAdress() + "], school=" + school + ", pay=" + pay + "]";
	}
}
