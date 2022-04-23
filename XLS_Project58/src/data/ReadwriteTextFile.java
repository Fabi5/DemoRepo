package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadwriteTextFile {

	public static void main(String[] args) throws IOException {
		
		// create new file
		File f = new File ("C:\\Testing\\temp.txt");
		f.createNewFile();
		
		
		// Write into Textfile
		FileWriter fw = new FileWriter(f);
		BufferedWriter out = new BufferedWriter(fw);
		
		out.write("This is 1st line");
		out.newLine();
		out.write("This is 2nd line");
		out.newLine();
		out.write("This is 3rd line");
		out.newLine();
		out.write("This is 4th line");
		out.newLine();
		out.write("This is 5th line");
		out.flush();
		// Read text file
		FileReader fr = new FileReader(f);
		BufferedReader rd = new BufferedReader(fr);
		
		/*System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());*/
		
		
		String x;
		int i = 0;
		while((x=rd.readLine())!=null ) {
		System.out.println(x);
		i++;
		}  
		System.out.println("Total number of lines: "+i);
}
}