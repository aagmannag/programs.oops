// Error Suspecting statement and risky code then we use try .
// to handle the exception which are throws by try block.

// NumberFormatException
class NFE{
    public static void main(String[] args) {
//        String str = "Aagman";
        String str = "123";
        try {
            int a = Integer.parseInt(str);
            System.out.println(a);
            System.out.println("String NumberFormatException");
        }
        catch (NumberFormatException n){
            System.out.println("String "+str+" can't be converted to integer");
        }
//        catch (ArithmeticException n){ // this is not in owr program
//            System.out.println("String "+str+" can't be converted to integer");
//        }
        System.out.println("main methord ended");
    }
}