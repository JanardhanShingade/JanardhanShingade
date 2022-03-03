package assistedproject3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
 
public class FileHandlig {
     public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
          {
             String filename= "\\src\\test.txt4";
             FileWriter fw = new FileWriter(filename,true); 
             //appends the string to the file
             fw.write("text file created\n");
             fw.write("text appended into file\n");
             fw.write("text line1\n");
             fw.write("text line2\n");
             fw.close();
             
             BufferedReader br = new BufferedReader(new FileReader("\\src\\test.txt4"));
             //read the file content
             
             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();
           }
           catch(IOException ioe)
           {
            System.err.println("IOException: " + ioe.getMessage());
           }
        }
  }