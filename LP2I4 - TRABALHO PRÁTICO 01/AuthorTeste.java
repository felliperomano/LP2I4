//FELLIPE SOARES ROMANO CB3005411
//STEFANY LISBOA CB3005551

import java.util.Scanner;

public class AuthorTeste {

	public static void main(String[] args) {
		Author author = new Author("nomeauthor","emailauthor@author",'f');

        System.out.println(author.toString());

        author.setEmail();
        System.out.println(author.toString());
	}

}