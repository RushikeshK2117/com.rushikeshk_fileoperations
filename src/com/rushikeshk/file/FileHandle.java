package com.rushikeshk.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandle {
	//Assignment No.: 3 Starts == Call all the methods of the File class 
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\rushikesh\\Desktop\\FileOperations\\DemoFile.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("This is a data I want to write in line 1.");//this is erase whatever was previously and rewrite the file data
		fw.append("This is a data I want to append to line 1 .");//this is simply add the new information to the end of whatever text was already there 
		fw.flush();
		fw.close();
		File del= new File("C:\\Users\\rushikesh\\Desktop\\FileOperations\\DeleteThis.txt");//creating file object
		boolean fvar = del.createNewFile();//create new file into specified location
		if(fvar) {
			System.out.println("Created="+fvar);
			System.out.println("File is created successfully");
				}
		else {
			System.out.println("File already exsist in the specified location");
			}
		System.out.println("Is file exists...?="+del.exists());
		System.out.println("Is file readable...?="+del.canRead());//returns true is the file is readable
		System.out.println("Is file writeable...?="+del.canWrite());//returns true if the file is writeable
		System.out.println("Is file executableable...?="+del.canExecute());//returns true if the file is executable 
		System.out.println("Name of the file="+del.getName());//returns the name of the specified file
		System.out.println("Path of the file="+del.getAbsolutePath());//returns the path of specified file
		System.out.println("Is File Deleted...?="+del.delete());//delete the specified file
	}
}
//Assignment No.: 3 Ends