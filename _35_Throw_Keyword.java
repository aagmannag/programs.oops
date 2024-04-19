// throw Keyword is used to throw the user defined or costomized exeption object to the JVM explicitly for that purpose we use throw Keyword.
class throwDemo{
    public static void main(String[] args) {
//        System.out.println(10/0);
        throw new ArithmeticException(("/ by Zero"));
    }
}