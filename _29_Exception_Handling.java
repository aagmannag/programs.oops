// an exception is unexpected , unwanted & abnormal situation that occured at runtime called exception.
// Ex - 1- powercutException, 2- filenotfoundException, 3- illException etc.
// we should have an alternate source through which we can handle the exception.
// following techniques to work with exception:- 1- try, 2- catch, 3- throw, 4- throws, 5- finally.
// predefined code then use try and catch.
// userdefined then throws and throws.
// we handle exception because normal flow of the program is maintained.
class tst{
    public static void main(String[] args) {
        System.out.println("hello");
        int a=10, b=0, c;
        try{
            c=a/b; // c=10/0
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
//            System.out.println(e);
            System.out.println("Can not divided by 0");
        }
        System.out.println("main methord ended");
    }
}