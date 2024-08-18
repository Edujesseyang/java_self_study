public class dataTypeConvert {
    public static void main(final String[] args){
        final double test = 124.432;
        final int result = double_int(test);
        System.out.println("Testing(int): " + test + '\n');
        System.out.println("Result(double): " + result + '\n');


        final char a ='a', b = 'b', c = 'c';
        final String abc = charsConcat(a, b, c);
        System.out.println("To concat chars in to a string: \nChars: " + a + ", " + b + ", " + c);
        System.out.println("The result string is : " + abc);

    }

    public static int double_int(final double input){
        return (int) input;
    }

    public static String charsConcat(final char a, final char b, final char c){
        return "" + a + b + c;
    }

    // Auto data type convert: byte,short, char --> int --> long --> float --> double
}
