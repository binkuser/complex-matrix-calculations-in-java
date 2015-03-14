# Introduction #

Add your content here.

```
public static void main(String[] args) {
		ComplexMatrixEnhanced mm = new ComplexMatrixEnhanced("input.txt");
		System.out.println("the complex input matrix read from file input.txt (first column " +
							"is complex vector, other columns represent " +
							"complex coefficients):\n");
		mm.printComplexMatrixEnhanced();
		System.out.println("\nthe complex solution vector written to file output.txt:\n");
		Complex[] sv = mm.getSolutionVector();
		ComplexMatrixEnhanced.printComplexVector(sv);
		ComplexMatrixEnhanced.exportVectorToFile(sv);
		
}

```

http://code.google.com/p/complex-matrix-calculations-in-java/w/edit#whb
# Details #

Add your content here.  Format your content with:
  * Text in **bold** or _italic_
  * Headings, paragraphs, and lists
  * Automatic links to other wiki pages