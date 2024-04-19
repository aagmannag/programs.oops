//class lp{
//    public static  void Wait() throws InterruptedException {
//        for (int i = 1; i <= 10;i++)
//        {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException{
//        Wait();
//        System.out.println("main methord ended");
//    }
//}

class lp{
    public static  void Wait() throws InterruptedException {
        for (int i = 1; i <= 10;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    // best approch to handle Exception with try catch because it has 100% girenty to terminate normally.
    public static void main(String[] args) {
        try {
            Wait();
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println("Exception Handled...!");
        }
        System.out.println("main methord ended");
    }
}