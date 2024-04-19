public class _1_class_object {
    int a = 1 ; String b = "Aagman";

    void show(){
        System.out.println(a+" "+b);
    }
}
class Test
{
    public static void main(String[] args) {
//        first way of making object
//        _1_class_object r = new _1_class_object();

//        imp _1_classs_object is class name , r is object reference ,
//        new dynamic memory allocate , _1_class_object() is a constructor

//        second way of making object
        _1_class_object r;
        r = new _1_class_object();
        r.show();
    }
}
