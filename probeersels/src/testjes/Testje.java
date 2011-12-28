package testjes;

import java.util.ArrayList;


public class Testje  {
static String p = "hoi";
/**
Based on Grover, Chapter 6, p. 45, formula 28
@param length1 Double : length in centimeter of one filament
@param length2 Double : length in centimeter of other filament
@param spacing Double : axial distance between filaments in centimeter
@param overlap Double : distance between extremity of lenght1 from length2 in centimeter,<br>
if completely parallel spacing = -length1
@return mm Double: mutual inductance in  micro Henry
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
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<ArrayList<String>> a = new ArrayList<ArrayList<String>>();
ArrayList<String> b = new ArrayList<String>();
ArrayList<String> c = new ArrayList<String>();
b.add("aap");
b.add("noot");
c.add("mies");
c.add("teun");
a.add(b);
a.add(c);
System.out.println(a.toString());
System.out.println(a.get(1).toString());
System.out.println(a.get(1).get(0).toString());
a.get(1).set(0, "klaas");
System.out.println(a.toString());
System.out.println(a.get(1).get(1).equals("teun"));
System.out.println(a.get(1).contains("teun"));
System.out.println(a.contains(b));
System.out.println(Runtime.getRuntime().availableProcessors());
System.out.println(0.00001*MyMath.arsinh(1.0));
System.out.println(0.00001*MyMath.arsinh_alternative(0.9999));
System.out.println(calculateFilamentMutualInductance(1.0, 1.0,  0.0000001, -1.0));
	}

}
