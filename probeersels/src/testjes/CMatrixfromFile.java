package testjes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JOptionPane;

import flanagan.complex.Complex;
import flanagan.complex.ComplexMatrix;


/**
 * @author Gérard Binkhorst
 *
 */
public class CMatrixfromFile {
	
	private String[][] matrix;
	private	ComplexMatrix cmatrix;
	private int cmcollength;
	private int cmrowlength;
	
	public	CMatrixfromFile (String file) {
		//build a string with the contents of a file and determine te number of future columns
		BufferedReader inFile;
		String data = "";
		String line;

		try {
			cmcollength = 1;
			int cl = 1;
			inFile = new BufferedReader(new FileReader(file));
			while ((line = inFile.readLine()) != null) {
				data = data + line + "\n";
				cl = line.split(" ").length;
				if(cl > cmcollength) {
				cmcollength = cl;
				}
			 }
			
		inFile.close();
		
		//build a matrix of string elements from the original string 
		String[] rows = data.split("\n");	    
		cmrowlength = rows.length;
		//cmcollength = rows[0].split(" ").length;
		matrix = new String[cmrowlength][];
			    
		//build a ComplexMatrix from the matrix of string elements
		cmatrix = new ComplexMatrix(cmrowlength, cmcollength); 	    
		int r = 0;
		for (String row : rows) {   	
			matrix[r++] = row.split(" ");
			//convert array elements to complex values and update the complex matrix with these
			int x = 0;
			    for(String element : matrix[r-1]) {
			    cmatrix.setElement(r-1, x++, Complex.parseComplex(element));
			        }
			        
			    }	
		}
		catch (IOException e) {
			 JOptionPane.showMessageDialog(null, "File error: " + e.toString());
		}
		
	}
	
public ComplexMatrix returnComplexMatrix() {
	return cmatrix;
}

public String[][] returnInputMatrix() {
	return matrix;
}

public void printInputMatrix() {
	System.out.println(Arrays.deepToString(matrix));
}

public int getCols() {	
return cmcollength ;
}

public int getRows() {	
	return cmrowlength ;
	}

public void printComplexMatrix() {
	System.out.println(Arrays.deepToString(cmatrix.getArray()));
}


	}
