package testjes;


public class Inductance  {

/**
 * <b>Calculates mutual inductance between filaments</b>
 * <br>
 * <i>Based on Grover, Chapter 6, p. 45, formula 28</i>
 * @param length1  double: length in centimeter of one filament
 * @param length2 double : length in centimeter of other filament
 * @param spacing double : axial distance between filaments in centimeter
 * @param overlap double : distance between extremity of lenght1 from length2 in centimeter,<br>
 * if completely parallel spacing = -length1
 * @return mm double: mutual inductance in  micro Henry
 */
public static double calculateFilamentMutualInductance(double length1, double length2, double spacing, double overlap)
{

	double mm = 0.0;
	double a = length1 + length2 + overlap;
	double b = length1 + overlap;
	double g = length2 + overlap;
	double D = spacing;
	double d = overlap;
	
	if (D == 0.0) //check for distance 0 (same axis)
	{
		D = 1.0E-64;
		}
	
	mm = 0.001*(
			
			a*MyMath.arsinh(a/D)
			-
			b*MyMath.arsinh(b/D)
			-
			g*MyMath.arsinh(g/D)
			+
			d*MyMath.arsinh(d/D)
			
			-
			Math.sqrt(a*a + D*D)
			+
			Math.sqrt(b*b + D*D)
			+
			Math.sqrt(g*g + D*D)
			-
			Math.sqrt(d*d + D*D)
	
		);
	
	
	return mm;
}
/**
 *@return mm Double: mutual inductance in  micro Henry
 */
public static double calculateRealConductorMutualInductance()
{
	
	
	double mm = 0.0;
	return mm ;
}


/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


System.out.println(calculateFilamentMutualInductance(1.0, 1.0,  0.0000001, -1.0));

System.out.println(calculateRealConductorMutualInductance());
	}

}
