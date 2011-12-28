package testjes;

public class MyMath {
	/**
     * precision
     */
    public final static double EPSILON = 1E-16;

    /**
     * exponential function
     * @param x Argument
     * @return function value e^x
     */
    public static double exp(final double x) {
        int n = 0;
        double an = 1;
        double sn = 1;
        while(Math.abs(an/sn) > EPSILON) {
            an *= x/(n + 1);
            sn += an;
            n++;
        }
        return sn;
    }
    /**
     * Area Sinus Hyperbolicus: inverse hyperbolic sinus.
     * @param x Argument
     * @return arsinh(x)
     */
    public static double arsinh_alternative(final double x) {
        if(x >= 1  ||  x <= -1) //precision can be set, but only applicable for x between -1 and 1
            throw new IllegalArgumentException("arsinh undefined for" + x);
        int n = 1;
        double an = x;
        double sn = x;
        while(Math.abs(an) > EPSILON*Math.abs(sn)) {
            final int nn = 2*n;
            an *= -x*x*(nn - 1)*(nn - 1)/nn/(nn + 1);
            sn += an;
            n++;
        }
        return sn;
    }
    
    public static double arsinh(final double x) {
    	//precision can´t be set, but applicable for full range of x
    	double sn;
        if(x <= -Math.sqrt(1+x*x))
            throw new IllegalArgumentException("arsinh undefined for" + x);
       sn = Math.log(x + Math.sqrt(x*x + 1));
        
        return sn;
    }
    
    
}
