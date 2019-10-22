/**
 * 
 */
package com.inc.user.helper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;




/**
 * @author Ananthan
 *
 */
public class CsvCompare {

	public static void main(String[] args) throws IOException {
	
		List<String[]> data1 = readData("D:/CareerProject/report/target/site/jacoco/jacoco.csv");
		List<String[]> data2 = readData("D:/CareerProject/report/target/site/jacoco/jacoco.csv");
		for(String s[] : data1) {
			for(String ss : s) {
				System.out.println(ss);
				System.out.println("\t");
			}
			System.out.println("\n");
		}
	}
	
	public static List<String[]> readData(String file) throws IOException { 
	    int count = 0;
	    List<String[]> content = new ArrayList<>();
	    try(BufferedReader br = new BufferedReader(new FileReader(file))) {
	        String line = "";
	        while ((line = br.readLine()) != null) {
	            content.add(line.split(","));
	        }
	    } catch (FileNotFoundException e) {
	      //Some error logging
	    }
	    return content;
	}
}
