package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class ProgramFiles {

	public static void main(String[] args) {
		
		String path = "C:\\temp\\sale.cvs";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path) ) ){
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage() );
		}
	}
}
