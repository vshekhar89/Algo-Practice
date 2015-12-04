

	/**
	 * Find power of a number.
	 * 
	 * Complexity: O (log (base 2) power) 
	 */
	public final class power {

	    private power() { }

	    /**
	     * Finds the power of the input number.
	     * @param x     the number whose power needs to be found
	     * @param pow   the power  
	     * @return      the value of the number raised to the power.
	     */
	    public static double pow(double x, int pow) {
	        if (x == 0) return 1;
	        return pow > 0 ? getPositivePower(x, pow) : 1 / getPositivePower(x,  -pow);
	    }

	    private static double getPositivePower(double x, int pow) {
	            assert x != 0;
	        if (pow == 0) return 1;

	        int currentPow = 1;
	        double value = x; 
	        while (currentPow <= pow/2) {
	            value = value * value;
	            currentPow = currentPow * 2;
	        }

	        return value * getPositivePower(x, pow - currentPow);
	    }

	    public static void main(String[] args) {    
	        System.out.println("Expected 6.25, Actual: " + power.pow(2.5, 2));
	        System.out.println("Expected 16, Actual: " + power.pow(2, 7));
	        System.out.println("Expected 0.25, Actual: " + power.pow(2, -2));
	        System.out.println("Expected -27, Actual: " + power.pow(-3, 3));
	    }
	}

