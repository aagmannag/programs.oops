//public class _4_parametrized_constructor {
//    int x,y;
//    _4_parametrized_constructor(int a, int b) //parameterized
//    {
//        x=a; y=b;
//    }
//    void show() {
//        System.out.println(x + " " + y);
//    }
//}
//class B {
//    public static void main(String[] args) {
//        _4_parametrized_constructor r = new _4_parametrized_constructor(100,200);
//        r.show();
//    }
//}

public class _4_parametrized_constructor {
    int x,y;
    _4_parametrized_constructor(int a, int b) //parameterized
    {
        x=a; y=b;
    }
    // we can make more parameterized constructor like this
    // but datatype will be change
    _4_parametrized_constructor(int a, String b) //parameterized
    {
        System.out.println(a+" "+b);
    }
    void show() {
        System.out.println(x + " " + y);
    }
}
class four {
    public static void main(String[] args) {
        _4_parametrized_constructor r = new _4_parametrized_constructor(100,200);
        _4_parametrized_constructor ref = new _4_parametrized_constructor(10,"Aagman");
        r.show();
    }
}
