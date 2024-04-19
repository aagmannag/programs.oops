// 1 super class and multipal sub class . sub class conect directly with super class .
public class _14_Hierarchical_inheritance {
    void input(){
        System.out.println("Enter your name: ");
    }
}
class fourteen extends _14_Hierarchical_inheritance
{
    void show(){
        System.out.println("My Name is Aagman");
    }
}
class fourt extends _14_Hierarchical_inheritance{
    void Disp(){
        System.out.println("My Name is Ashutosh");
    }
}
class Demo{
    public static void main(String[] args) {
        fourteen r = new fourteen();
        fourt r2 = new fourt();
        r.input();r.show();
        r2.input(); r2.Disp();
    }
}
