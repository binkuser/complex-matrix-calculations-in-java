package testjes;

import java.util.Arrays;

import flanagan.complex.Complex;
import flanagan.complex.ComplexMatrix;

/**
 * @author Gérard Binkhorst
 * @version 0.1
 * @since 2011-11-25
 */
public class ComplexMatrixEnhanced extends ComplexMatrix {

	/**
	 * A {@link ComplexMatrix} which may be filled with the contents of a local text file containing complex elements.
	 * @param file {@link String}
	 */
	public ComplexMatrixEnhanced(String file) {	
		super(cmat(file).getRows(), cmat(file).getCols());
		this.setTwoDarray(cmat(file).returnComplexMatrix().getArray());		
	}

	/**
	 * Constructor of the upper class which can be applied when an empty ComplexMatrixEnhanced should be created and no local text file is specified.
	 * @param col {@link integer} number of columns
	 * @param row {@link integer} number of rows
	 */
	public ComplexMatrixEnhanced(int col, int row) {	
		super(col, row);		
	}
	
	private static CMatrixfromFile cmat(String intfile) {
		return new CMatrixfromFile(intfile);
	}

	/**
	 * Prints the contents of a {@link ComnplexMatrixEnhanced} in a readable format to the console.
	 */
	public void printComplexMatrixEnhanced() {
		System.out.println(Arrays.deepToString(this.getArray()));
	}
	
	/**
	 * Prints the contents of a {@link ComnplexMatrix} in a readable format to the console.
	 * @param z {@link ComplexMatrix}
	 */
	public static void printComplexMatrix(ComplexMatrix z) {
		System.out.println(Arrays.deepToString(z.getArray()));
	}
	
	public int getMaxColnumber() {
		int  c= this.getNcol();
		return c-1;
	}
	
	public int getMaxRownumber() {
		int  c= this.getNrow();
		return c-1;
	}
	
	public Complex[] getColumn(int colnum) {		
		int z=this.getMaxRownumber()+1;
		Complex[] m = new Complex[z];	
		for (int l= 0; l<z; l++){
		m[l] = this.getElementCopy(l, colnum);
	}
		return m;
	}
	public Complex[] getSolutionVector() {
		Complex[] x = this.getSubMatrix(0,1,this.getMaxRownumber(),this.getMaxColnumber()).solveLinearSet(this.getColumn(0));
		return x;
	}
	
	public static void printComplexVector(Complex[] v) {
		System.out.println(Arrays.deepToString(v));
	}
	
	public static void main(String[] args) {
		ComplexMatrixEnhanced mm = new ComplexMatrixEnhanced("input.txt");
		mm.printComplexMatrixEnhanced();
		ComplexMatrixEnhanced.printComplexVector(mm.getSolutionVector());
		
}
}
