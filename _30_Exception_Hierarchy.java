// ThroWable class is a super class and they have 2 sub classes 1- Exception , 2- error.
// Exception 1- runtimeException 2- IOException 3- SQLException 4- InterruptedException 5- classNotFoundException.
// Error 1- StackOverFlowError 2- outofMemoryError  3- IOError  4- LinkagError

//NullPointerException
class NPE
{
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.toUpperCase()); //NullPointerException
        }
        catch (NullPointerException n){
            System.out.println("null can't be casted");
        }
    }
}