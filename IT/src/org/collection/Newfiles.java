package org.collection;

import java.io.File;
import java.io.FileWriter;

public class Newfiles {
	
	public static void main(String[] args) throws Throwable {
		
		File f = new File("C:\\Users\\HP\\workspace\\IT\\test\\A\\B\\article.txt");
		
		
		FileWriter  f1 = new FileWriter(f);
		
		f1.write("Hi all");
		
		f1.close();
		
	}

}


