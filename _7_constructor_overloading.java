// when we have more than 1 constructor in class then it is constructor overloading
//public class _7_constructor_overloading {
////    we can change no of parameter ya to another parameter
//    int a; double b; String c;
//    _7_constructor_overloading(){
//        a = 100; b = 45.14; c = "Aagman";
//    }
//    _7_constructor_overloading(int x){
//        a = x;
//    }
////    _7_constructor_overloading(int x, float y){
////    }
//    _7_constructor_overloading(double y,String z){
//        b = y; c = z;
//    }
//}
//class seven{
//    public static void main(String[] args) {
//        _7_constructor_overloading r = new _7_constructor_overloading();
//        _7_constructor_overloading r2 = new _7_constructor_overloading(10);
//        _7_constructor_overloading r3 = new _7_constructor_overloading(18.14,"Aagman");
//        System.out.println(r.a+" "+r.b+" "+r.c);
//        System.out.println(r2.a);
//        System.out.println(r3.b+" "+r3.c);
//    }
//}

public class _7_constructor_overloading {
    //    we can change no of parameter ya to another parameter
    int a; double b; String c;
    private _7_constructor_overloading()
    {
        a = 10; b = 95.14; c = "AAG";
    }
//    _7_constructor_overloading(){
//        a = 100; b = 45.14; c = "Aagman";
//    }
    _7_constructor_overloading(int x){
        a = x;
    }
    _7_constructor_overloading(double y,String z){
        b = y; c = z;
    }
    public static void main(String[] args) {
        _7_constructor_overloading r = new _7_constructor_overloading();
        _7_constructor_overloading r2 = new _7_constructor_overloading(10);
        _7_constructor_overloading r3 = new _7_constructor_overloading(18.14,"Aagman");
        System.out.println(r.a+" "+r.b+" "+r.c);
        System.out.println(r2.a);
        System.out.println(r3.b+" "+r3.c);
    }
}

