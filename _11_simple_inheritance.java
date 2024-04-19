// which contain only 1 super class and 1 sub class.
public class _11_simple_inheritance { //super class
//    int roll,marks;
    protected int roll,marks; // protected only made for inheritance
    String name;
    void input(){ // private member only accessable in same class.
        System.out.println("Enter roll name & marks:");
    }
}
class ankit extends _11_simple_inheritance{ // sub class
    void disp(){
        roll=1; name = "Aagman"; marks=99;
        System.out.println(roll+" "+name+" "+marks);
    }

    public static void main(String[] args) {
        ankit r = new ankit();
        r.input();
        r.disp();
    }
}
