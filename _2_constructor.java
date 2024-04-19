public class _2_constructor {

//    1 the main purpos of constructor is initialize the object
//    2 every java class has a constructor
//    3 automatically call at the time of object creation
//    4 never contain any return type including void

    int a ; String name;
    /*_2_constructor()
    {
        a = 0; name = null;
    }*/
    void show(){
        System.out.println(a+" "+name);
    }
}
class b
{
    public static void main(String[] args) {
        _2_constructor ref = new _2_constructor();
        ref.show();
    }
}

//types of constructor

// 1 private
// 2 default
// 3 parametrized
// 4 copy