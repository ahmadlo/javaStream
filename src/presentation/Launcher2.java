package presentation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Launcher2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> people = null;
	
		try {
			// on récpère la liste d'étudiants  
		 people =  Files.lines(Paths.get("liste-etudiants.txt"));
		 
			
	
			// on filtre et on affiche 
			people
				.filter(x -> x.contains("am"))
				.forEach(System.out::println);

			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			people.close();
		}

	}

}
