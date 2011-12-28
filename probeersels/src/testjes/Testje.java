package testjes;

import java.util.ArrayList;
import java.util.Arrays;


public class Testje  {
static String p = "hoi";


private float fn;


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
System.out.println(0.00001*MyMath.arsinh(0.00001));




	}




}
