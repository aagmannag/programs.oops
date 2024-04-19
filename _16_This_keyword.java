// refers to the current object inside a methord or constructor.
//public class _16_This_keyword {
//    void show(){
//        System.out.println(this);
//    }
//    public static void main(String[] args) {
//        _16_This_keyword r = new _16_This_keyword();
//        System.out.println(r);
//        r.show();
//    }
//}

// defines the instance variable as this. and when local and instance variable are same.
//public class _16_This_keyword {
//    int a;
//    _16_This_keyword(int a){
//        this.a=a;
//    }
//    void show(){
//        System.out.println(a);
//    }
//    public static void main(String[] args) {
//        _16_This_keyword r = new _16_This_keyword(100);
//        r.show();
//    }
//}

//it is also used when we want to call the default constructor of own class.
//public class _16_This_keyword {
//    _16_This_keyword(){
//        System.out.println("hello");
//    }
//    _16_This_keyword(int a){
//        this(); // calls default constructor.
//        System.out.println(a);
//    }
//    void show(){
//    }
//    public static void main(String[] args) {
//        _16_This_keyword r = new _16_This_keyword(100);
//    }
//}


// it also calls parametrized constructor of its own class.
public class _16_This_keyword {
    _16_This_keyword(){
        this(10);
    }
    _16_This_keyword(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        _16_This_keyword r = new _16_This_keyword();
    }
}