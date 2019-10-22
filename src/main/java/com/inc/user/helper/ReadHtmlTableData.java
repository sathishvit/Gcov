package com.inc.user.helper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ReadHtmlTableData {
   public static void main(String[] args) throws IOException, ParseException {
	   List<String[]> master = extractHtmlTableData("D:/CareerProject/report/target/site/jacoco/index.html");
	   List<String[]> slave = extractHtmlTableData("D:/CareerProject/report/target/site/jacoco/index.html");
	   List<String[]> finalData = compareAndFinalData(master, slave);
	   writeHtmlFile(finalData);
   }


   public static List<String[]> extractHtmlTableData(String file) {
	   
	   File input = new File(file);
	   List<String[]> content = new ArrayList<>();
      try {
    	  Document doc = Jsoup.parse(input, "UTF-8", "http://example.com/");
         Elements tableElements = doc.select("table");

         Elements tableHeaderEles = tableElements.select("thead tr th");
         System.out.println("headers");
         for (int i = 0; i < tableHeaderEles.size(); i++) {
            System.out.println(tableHeaderEles.get(i).text());
         }
         System.out.println();

         Elements tableRowElements = tableElements.select(":not(thead) tr");

         for (int i = 0; i < tableRowElements.size(); i++) {
            Element row = tableRowElements.get(i);
            System.out.println("row");
            Elements rowItems = row.select("td");
            String s[] = new String [rowItems.size()];
            for (int j = 0; j < rowItems.size(); j++) {
            	s[j] =rowItems.get(j).text();
               System.out.println(rowItems.get(j).text());
            }
            content.add(s);
            System.out.println();
         }
         
         for(String s[] : content) {
 			for(String ss : s) {
 				System.out.println(ss);
 				System.out.println("\t");
 			}
 			System.out.println("\n");
 		}

      } catch (Exception e) {
         e.printStackTrace();
      }
      return content;  
   }
   
   private static List<String[]> compareAndFinalData(List<String[]> master, List<String[]> slave) throws FileNotFoundException, ParseException {
		// TODO Auto-generated method stub
	   
	   File newFile = new File("D:\\name");
	   
	           PrintWriter writer = new PrintWriter(newFile);

	   
	   List<String[]> result = new ArrayList<String[]>();
//	   for(String s[] : slave) {
//		   for(String ss : s) {
//			   if()
//		   }
//	   }
	   NumberFormat defaultFormat = NumberFormat.getPercentInstance();
			   Number value = defaultFormat.parse("100%");
			   System.out.println("Data value"+value);
//	   
	   String[] temp = new String[master.get(0).length];
	   for(int i = 0; i < slave.size(); i++) {
		   String[] s1 = new String[master.get(0).length];
		               for(int c = 0; c < master.size(); c++) {
		                   if(slave.get(i)[0].equals(master.get(c)[0])) {
		                	   if(slave.get(i)[0].equals("Total")) {
		                		   temp =slave.get(i);
		                		   break;
		                	   }else if(slave.get(i)[0].equals("Element")) {
		                	   s1[0]= slave.get(i)[0];
		                	   s1[1]= slave.get(i)[1];
		                	   s1[2]= slave.get(i)[2];
		                	   s1[3]= slave.get(i)[3];
		                	   s1[4]= slave.get(i)[4];
		                	   s1[5]= slave.get(i)[5];
		                	   s1[6]= slave.get(i)[6];
		                	   s1[7]= slave.get(i)[7];
		                	   s1[8]= slave.get(i)[8];
		                	   s1[9]= slave.get(i)[9];
		                	   s1[10]= slave.get(i)[10];
		                	   s1[11]= slave.get(i)[11];
		                	   s1[12]= slave.get(i)[12];
		                      // writer.println(master.get(i)[0]);
//		                       writer.close();
		                   }else {
		                	   s1[0]= slave.get(i)[0];
		                	   
		                	   int vv = Integer.parseInt((master.get(c)[1].equals("") || slave.get(c)[1].equals("n/a"))?"0":master.get(c)[1]);
		                	   s1[1]= String.valueOf(Integer.valueOf((slave.get(i)[1].equals("") || slave.get(i)[1].equals("n/a"))?"0":slave.get(i)[1])-vv);
		                	   s1[2]= String.valueOf(Integer.valueOf((slave.get(i)[2].equals("") || slave.get(i)[2].equals("n/a"))?"0":slave.get(i)[2].trim().replace("%", ""))-Integer.parseInt((master.get(c)[2].equals("") || slave.get(c)[2].equals("n/a"))?"0":master.get(c)[2].trim().replace("%", "")));
		                	   s1[3]= String.valueOf(Integer.valueOf((slave.get(i)[3].equals("") || slave.get(i)[3].equals("n/a"))?"0":slave.get(i)[3])-Integer.parseInt((master.get(c)[3].equals("") || slave.get(c)[3].equals("n/a"))?"0":master.get(c)[3]));
		                	   s1[4]= String.valueOf(Integer.valueOf((slave.get(i)[4].equals("") || slave.get(i)[4].equals("n/a"))?"0":slave.get(i)[4].trim().replace("%", ""))-Integer.parseInt((master.get(c)[4].equals("") || slave.get(c)[4].equals("n/a"))?"0":master.get(c)[4].trim().replace("%", "")));
		                	   s1[5]= String.valueOf(Integer.valueOf((slave.get(i)[5].equals("") || slave.get(i)[5].equals("n/a"))?"0":slave.get(i)[5])-Integer.parseInt((master.get(c)[5].equals("") || slave.get(c)[5].equals("n/a"))?"0":master.get(c)[5]));
		                	   s1[6]= String.valueOf(Integer.valueOf((slave.get(i)[6].equals("") || slave.get(i)[6].equals("n/a"))?"0":slave.get(i)[6])-Integer.parseInt((master.get(c)[6].equals("") || slave.get(c)[6].equals("n/a"))?"0":master.get(c)[6]));
		                	   s1[7]= String.valueOf(Integer.valueOf((slave.get(i)[7].equals("") || slave.get(i)[7].equals("n/a"))?"0":slave.get(i)[7])-Integer.parseInt((master.get(c)[7].equals("") || slave.get(c)[7].equals("n/a"))?"0":master.get(c)[7]));
		                	   s1[8]= String.valueOf(Integer.valueOf((slave.get(i)[8].equals("") || slave.get(i)[8].equals("n/a"))?"0":slave.get(i)[8])-Integer.parseInt((master.get(c)[8].equals("") || slave.get(c)[8].equals("n/a"))?"0":master.get(c)[8]));
		                	   s1[9]= String.valueOf(Integer.valueOf((slave.get(i)[9].equals("") || slave.get(i)[9].equals("n/a"))?"0":slave.get(i)[9])-Integer.parseInt((master.get(c)[9].equals("") || slave.get(c)[9].equals("n/a"))?"0":master.get(c)[9]));
		                	   s1[10]= String.valueOf(Integer.valueOf((slave.get(i)[10].equals("") || slave.get(i)[10].equals("n/a"))?"0":slave.get(i)[10])-Integer.parseInt((master.get(c)[10].equals("") || slave.get(c)[10].equals("n/a"))?"0":master.get(c)[10]));
		                	   s1[11]= String.valueOf(Integer.valueOf((slave.get(i)[11].equals("") || slave.get(i)[11].equals("n/a"))?"0":slave.get(i)[11])-Integer.parseInt((master.get(c)[11].equals("") || slave.get(c)[11].equals("n/a"))?"0":master.get(c)[11]));
		                	   s1[12]= String.valueOf(Integer.valueOf((slave.get(i)[12].equals("") || slave.get(i)[12].equals("n/a"))?"0":slave.get(i)[12])-Integer.parseInt((master.get(c)[12].equals("") || slave.get(c)[12].equals("n/a"))?"0":master.get(c)[12]));
		                   }
		                	   
		                	   result.add(s1);
		               }
		               
		   
		           }

	}
	   result.add(temp);
	   return result;
	   
   }
   private static void writeHtmlFile(List<String[]> finalData) throws IOException {
		// TODO Auto-generated method stub
	   PrintWriter pw = new PrintWriter(new FileWriter("D:/test.html"));
       pw.println("<html><head><title>Data input</title><head></head><body><table>");
       pw.println("<tr>");
       for(String s : finalData.get(0)) {
    	   pw.println("<th>"+s+"</th>"); 
       }
       pw.println("</tr>");
       for (int i = 1; i < finalData.size(); i++) {
    	   pw.println("<tr>");
           for(String w : finalData.get(i)) {
        	   pw.println("<td>"+w+"</td>"); 
           }
           pw.println("</tr>");
       }
       pw.println("</table></body></html>");
       pw.close();	
	}
}