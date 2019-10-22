package com.inc.user.utility;
// Recursive Java program to print all files 
// in a folder(and sub-folders) 

import java.io.File; 

public class GFG 
{ 
	static void RecursivePrint(File[] arr, int level) 
	{ 
		// for-each loop for main directory files 
		for (File f : arr) 
		{ 
			// tabs for internal levels 
			for (int i = 0; i < level; i++) 
				System.out.print("\t"); 
			
			if(f.isFile()) 
				System.out.println(f.getName()); 
			
			else if(f.isDirectory()) 
			{ 
				System.out.println("[" + f.getName() + "]"); 
			
				// recursion for sub-directories 
				RecursivePrint(f.listFiles(), level + 1); 
			} 
		} 
	} 
	
	// Driver Method 
	public static void main(String[] args) 
	{ 
		// Provide full path for directory(change accordingly) 
		String maindirpath = "D:\\CareerProject\\incHRM\\src"; 
				
		// File object 
		File maindir = new File(maindirpath); 
		
		if(maindir.exists() && maindir.isDirectory()) 
		{ 
			// array for files and sub-directories 
			// of directory pointed by maindir 
			File arr[] = maindir.listFiles(); 
			
			System.out.println("**********************************************"); 
			System.out.println("Files from main directory : " + maindir); 
			System.out.println("**********************************************"); 
			
			// Calling recursive method 
			RecursivePrint(arr, 0); 
	} 
	} 
} 
