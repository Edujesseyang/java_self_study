
public class method {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        theMethod(); // executes prototype method;
        theMethod("Hello, ");  // executes overloaded method with parameter;
        System.out.println(theMethod1()); // executes prototype method1;
        System.out.println(theMethod1("Hello, "));  // executes overloaded method1 with parameter;

        int x = 100;
        int y = 150;
        System.out.println("sum is: " + sum(x, y));
        System.out.println("sum is: " + sum(x));
        System.out.println("sum is: " + sum());
    }

    // define method: 
    /**
     * @param None
     * @return None
     */
    public static void theMethod() {
        System.out.println("I just got executed!");
    }

    /**
     * @param something
     * @return none overload
     */
    public static void theMethod(String something) {
        System.err.println("I just got executed!" + something);
    }

    /**
     * @param none
     * @return String
     */
    public static String theMethod1() {
        return "I just got executed!";
    }

    /**
     * @param something
     * @return String overload
     */
    public static String theMethod1(String something) {
        return "I just got executed!" + something;
    }

    // There is no way to use default params in java
    // public static int sum(int a = 0, int b = 0){
    //     return a + b;  
    // }
    // use overload to achieve the similar function
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a) {
        return sum(a, 0);
    }

    public static int sum() {
        return sum(0, 0);
    }
}
