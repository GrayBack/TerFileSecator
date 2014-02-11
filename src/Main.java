		import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
		
		public class Main {		
			public static void main(String[] args) throws IOException {
					    
				String fichierDonnee = "donnes_de_test.txt";
			    String fichierObservation = "observation.txt";
			    String fichierTest = "test.txt";
	
			    PrintWriter out  = new PrintWriter(new FileWriter(fichierObservation));
			    PrintWriter out2  = new PrintWriter(new FileWriter(fichierTest));
					    
			    int count = 0;
			      
			    try{
			      BufferedReader in  = new BufferedReader(new FileReader(fichierDonnee));
			      String line;
			      while ((line = in.readLine()) != null) {
			    	  if(count == 1 || count == 2 || count == 3){
					   		out.println(line.trim());
					    	}
			    	  else{
					   		out2.println(line.trim());
			    	  }
					       	count++;
					       	count = count%5;
					       	System.out.println(count);
			      }
					      in.close();
					      out.close();
					      out2.close();
					    }
					    catch(Exception e){
					      e.printStackTrace();
					    }					      
		   }
		}
