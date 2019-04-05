import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EconomicPhonebook {
	
	 public class phoneNumber extends Node {
		 
		 public int number;
		 
		 
	 }
	public static void main(String[] args) throws IOException {
		File ar=new File("C:\\Users\\micha\\OneDrive\\Escritorio\\eco.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new FileWriter(ar));
		
		List numbers=new List();
		while(br.readLine()!=null) {
			
			int cases=Integer.parseInt(br.readLine());
			
			for (int i = 0; i < cases; i++) {
				
				
				
				
				
			}
			
			
			
		}
			
			
		
		
	}
	

}
