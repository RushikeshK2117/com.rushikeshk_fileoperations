package com.rushikeshk.file;

import java.io.File;

public class FileOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir;
		try {
		File f= new File("C:\\Users\\rushikesh\\Desktop\\FileOperations\\DemoFile.txt");
		boolean fvar= f.createNewFile();
		
		if(fvar) {
			System.out.println("Created="+fvar);
			System.out.println("File is created successfully");
		}
		else {
			System.out.println("File already exsist in the specified location");
		}
		

		
		//Assignment No.:1 Start == Print the directory in which DemoFile.txt exists
		dir = f.getParent();//returns the pathname of directory in which file is exist
		System.out.println("Directory Path="+dir);
		//Assignment No.:1 End 
		
		
		
		//Assignment No.:2 Start == Print the content of above directory (in which the DemoFile.txt is exist)
		File dir1= new File(dir);
		File[] contentsOfDirectory=dir1.listFiles();
		
		//loop for read each content name in specified directory
		for(File object:contentsOfDirectory) {
			
			//print the name of contents which are in file format 
			if(object.isFile()) {
				System.out.format("File Name = %s%n", object.getName());
			}
			
			//print the name of contents which are in directory format 
			else if(object.isDirectory()) {
				System.out.format("Directory Name = %s%n", object.getName());
			}
		//Assignment No.:2 End
		
			
		//Assignment No.:3 Start ==
			System.out.println("Is File Exist= "+f.exists());
			System.out.println("Path of File="+f.getAbsolutePath());
			//System.out.println("File Deleted...!"+f.delete());
			
			
		}
		}
		catch(Exception e) {
			System.out.println("Exception occurred");
		}
		}
}

