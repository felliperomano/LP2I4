//FELLIPE SOARES ROMANO CB3005411
//STEFANY LISBOA DA SILVA CB3005551

import java.util.Scanner;

public class Person {
	Scanner s = new Scanner(System.in);
	private String name;
	private String adress;
	
	public Person(String n, String a) {
		this.name = n;
		this.adress = a;
	}
	
    public String getName() {
		return name;
	}
    
    public String getAdress() {
		return adress;
	}
    
    public void setAdress() {
    	System.out.println("Digite o seu endereco: ");
		adress = s.next();
	}
    
	public String toString() {
		return "Person[name=" + name + ", adress=" + adress + "]";
	}
}
