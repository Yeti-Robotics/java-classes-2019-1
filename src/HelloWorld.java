public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*
        int - integer
        double - decimal
        float - decimal (small, bad)
        boolean - true or false
        char - 'a' or '1' or '!' not 'hi'
        String - "hkncvlanlaen ckla"
         */
        System.out.println(35);
        double decimalNumber = 3.14;
        System.out.println(decimalNumber);
        int intNumber = 40;
        float floatNumber = 4.5f;
        boolean booleanVariable = true;
        char character = 'f';
        String phrase = "This is a String variable";
        System.out.println(intNumber);
        System.out.println(floatNumber);
        System.out.println(booleanVariable);
        System.out.println(character);
        System.out.println(phrase);


        System.out.println(3 / 2.0);

        int[] integerArray = {0, 1, 2, 3};
        System.out.println(integerArray[0]);
        int[] emptyArray = new int[5];
        System.out.println(emptyArray[2]);

        for (int i = 0; i < integerArray.length; i++) {
            System.out.println(integerArray[i]);
        }
    }
}
