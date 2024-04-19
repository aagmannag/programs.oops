// in java , it is possible to write a constructor as a private but according to the rule we con't access private
// member outside of class
class _6_private_constructor
{
    int a; double b; String c;
    private _6_private_constructor()
    {
        a = 10; b = 30.14; c = "Aagman";
        System.out.println(a+" "+b+" "+c);
    }

    public static void main(String[] args) {
        _6_private_constructor r = new _6_private_constructor();
    }
}
// class six
//{
//    public static void main(String[] args) {
//        _6_private_constructor r = new _6_private_constructor(); // this will not work.
//    }
//}
