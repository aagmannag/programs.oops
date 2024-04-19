// when ever we pass object reference to the constructor then it is called copy constructor.
public class _5_copy_constructor {
    int a; String b;
    _5_copy_constructor ()
    {
        a=10; b="Aagman";
        System.out.println(a+" "+b);
    }
    _5_copy_constructor(_5_copy_constructor ref)
    {
        a = ref.a;
        b = ref.b;
        System.out.println(a+" "+b);
    }
}
class five
{
    public static void main(String[] args) {
        _5_copy_constructor r = new _5_copy_constructor();
        _5_copy_constructor r2 = new _5_copy_constructor(r);
    }
}
