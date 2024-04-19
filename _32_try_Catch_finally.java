// Finally block is a runtime block and the main purpose of finally blockk to handle the resources.
//class handling{
//    public static void main(String[] args) {
//        try{
//            System.out.println("hello"); //p
//            int a=20,b=2,c;
//            c=a/b;
//            System.out.println(c); //p
//            System.out.println("hell"); //p
//        }
//        catch (ArithmeticException e){
//            System.out.println("can't divide by 0");
//        }
//        finally {
//            System.out.println("help"); //p
//        }
//        System.out.println("Don");//p
//    }
//}

//class handling{
//    public static void main(String[] args) {
//        try{
//            System.out.println("hello");//p
//            int a=20,b=0,c;
//            c=a/b;
//            System.out.println(c);
//            System.out.println("hell");
//        }
//        catch (ArithmeticException e){
//            System.out.println("can't divide by 0"); //p
//        }
//        finally {
//            System.out.println("help");//p
//        }
//        System.out.println("Don");//p
//    }
//}

//class handling{
//    public static void main(String[] args) {
//        try{
//            System.out.println("hello"); //p
//            int a=20,b=0,c;
//            c=a/b;
//            System.out.println(c);
//            System.out.println("hell");
//        }
//        catch (NullPointerException e){
//            System.out.println("can't divide by 0");
//        }
//        finally {
//            System.out.println("help");//p
//        }
//        System.out.println("Don");
//    }
//}

//class handling{
//    public static void main(String[] args) {
//        try{
//            System.out.println("hello"); //p
//            int a=20,b=0,c;
//            c=a/b;
//            System.out.println(c);
//            System.out.println("hell");
//        }
//        catch (ArithmeticException e){
//            int x=20,y=0,z;
//            z=x/y;
//            System.out.println(z);
//            System.out.println("can't divide by 0");
//        }
//        finally {
//            System.out.println("help");//p
//        }
//        System.out.println("Don");
//    }
//}

class handling{
    public static void main(String[] args) {
        try{
            System.out.println("hello"); //p
            int a=20,b=0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("hell");
        }
        catch (ArithmeticException e){
            int x=20,y=0,z;
            z=x/y;
            System.out.println(z);
            System.out.println("can't divide by 0");
        }
        finally {
            int p=20,q=0,r;
            r=p/q;
            System.out.println(r);
            System.out.println("help");
        }
        System.out.println("Don");
    }
}