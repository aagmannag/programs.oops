// when we doesn't want to handle the exception and try to send the exception to the JVM. JVM or other Methord.
//class throwsDemo{
//    public static void main(String[] args) throws  InterruptedException{
//        for (int i = 1; i <= 10; i++){
//            System.out.println(i);
//            Thread.sleep(1000); // error -  must be caught or declared to be thrown
//        }
//    }
//}

// doing by try and catch
class throwsDemo{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}