// refers to the objects of super class.
// it is use when you want to call super class veriable, methord, constructor through sub class object.
// super and sub class variable and methord both are same then it is use.
// to aviod the confusion between super and sub class variables and methords that have same name we use super.
//super calls veriable, methord, constructor.


// variable

//public class _15_Super_keyword {
//    int a=10;
//}
//class fifteen extends _15_Super_keyword{
//    int a=20;
//    void show(){
//        System.out.println(a);
//        System.out.println(super.a);
//    }
//}
//
//class est{
//    public static void main(String[] args) {
//        fifteen r = new fifteen();
//        r.show();
//    }
//}


// Methords

//public class _15_Super_keyword {
//    void show()
//    {
//        System.out.println("Hell");
//    }
//}
//class fifteen extends _15_Super_keyword{
//    void show(){
//        super.show();
//        System.out.println("Hello");
//    }
//}
//
//class est{
//    public static void main(String[] args) {
//        fifteen r = new fifteen();
//        r.show();
//    }
//}


// Constructor

public class _15_Super_keyword {
    _15_Super_keyword(int a)
    {
        System.out.println("Hell");
    }
}
class fifteen extends _15_Super_keyword{
    fifteen(){
        // super(); compiler will call automatically. when you not use super class. when it is difault constructor.
        super(100); // parametrised constructor compelsory to right.
        System.out.println("Hello");
    }
}

class est{
    public static void main(String[] args) {
        fifteen r = new fifteen();
    }
}