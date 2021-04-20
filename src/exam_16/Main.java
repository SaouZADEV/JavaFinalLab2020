package exam_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void readScoreGrading(String a) throws Exception {
		try {
		      File myObj = new File(a);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        int i =Integer.parseInt(data);
		        if(i ==-99) {
		        	throw new Exception("Missing value");
		        }else {
		        	if (i>= 80) {
		        		System.out.println("A");
		        	}
		        	else if(i>=70) {
		        		System.out.println("B");
		        	}
		        	else if(i>=50) {
		        		System.out.println("C");
		        	}
		        	else
		        		System.out.println("D");
		        	
		        }
		        	
		      }
		      myReader.close();
		    } catch (NullPointerException ex) {
		      System.out.println("Have some a missing value");
		      throw ex;
		    } 
		}

	public static void main(String[] args) throws Exception {
			readScoreGrading("score.txt");
	  }
}