//FELLIPE SOARES ROMANO CB3005411
//STEFANY LISBOA DA SILVA CB3005551

import java.util.Scanner;

public class Author {

	Scanner s = new Scanner(System.in);
    private String name;
    private String email;
    private char gender;
    
	public Author(String n, String e, char g) {

        this.name = n;
        this.email = e;
        this.gender = g;

		
    }

    
    public String getName() {
		return name;
	}
    
    public String getEmail() {
		return email;
    }
    
    public void setEmail() {
		System.out.println("Digite o email: ");
		email = s.next();
	}    
     
    public char getGender() {
		return gender;
	}
	
	
	public String toString() {
		return "Author[name=" + name + ", email=" + email + ", gender=" + gender+"]";
	}
		
	public static void main(String[] args) {

        
    }

}