public class _3_default_constructor {
    // which does not have any parameter

    int a ; String b; boolean c;
//    _3_default_constructor() // default constructor
//    {
//        a = 100; b = "Aagman"; c = true;
//    }

    //    _3_default_constructor() // default constructor
    //    {
    //        a = 100; b = "Aagman"; c = true;
    //    }
    void Disp(){
        System.out.println(a+" "+b+" "+c);
    }
}
class be {
    public static void main(String[] args) {
        _3_default_constructor r = new _3_default_constructor();
        r.Disp();
    }
}
