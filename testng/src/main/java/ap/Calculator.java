public class Calculator {
	
    private final String name;

    /**
     * Creates a calculator with a given name. The name must be a string with a length between 2 and 5.
     *
     * @param name the name of the created calculator
     *
     * @throws IllegalArgumentException if the name is null, or its length is greater than 5
     *          or smaller than 2.
     **/
    public Calculator(String name) {
        // ...
    }
    
    /**
     * Sums two integers and returns the result of the sum. Null integers are considered
     * as 0.
     *
     * @param a the first integer to add
     * @param b the second integer to add
     *
     * @returns the result of this operation.
     **/
    public Integer sum(Integer a, Integer b) {
        // ...
    }

    /**
     * Divides two integers and returns the result of the division. Null integers are considered
     * as 0.
     *
     * @param a the first integer
     * @param b the second integer
     *
     * @returns the result of the division.
     * @throws IllegalArgumentException if b is 0.
      **/
    public Integer divide(Integer a, Integer b) {
        // ...
    }

    /**
     * @returns the name of this calculator
     **/
    public String getName() {
        // ...
    }
}