package Datapractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadwriteTextFile {

	
	
	public static void main(String[] args) throws IOException {
		//create text file with path
		File khan = new File("C:\\Testing\\temp1.txt");
		khan.createNewFile();
		//command for writing in text file  
		FileWriter  Fw1 = new FileWriter(khan);
		// write in single array
		BufferedWriter Bw = new BufferedWriter (Fw1);
		
	
		
		Bw.write("how are you");
		Bw.newLine();
		Bw.write(" i am good");
		Bw.newLine();
		Bw.write("how are you");
		Bw.newLine();
		Bw.write(" i am good");
		Bw.newLine();
		Bw.write("how are you");
		Bw.newLine();
		Bw.write(" i am good");
		Bw.flush();
		
		//second method to print lines with loops.
		FileReader Fr1 = new FileReader(khan);
		BufferedReader Br = new BufferedReader (Fr1);
		
		//System.out.println(Br.readLine());
		//System.out.println(Br.readLine());
		
		String x;
		while((x=Br.readLine()) !=null) {
			System.out.println(x);
		}
		
		

	}

}
