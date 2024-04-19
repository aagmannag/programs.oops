// exists at the time of compilation . name same and different parameters .
// ex - Mehord overloading
// Mehord overloading whenever a class contains more than one methord with same name and different types of parameters called Mehord overloading.
public class _18_Compile_time_polymorphism {
    void add(){
        int a=10,b=20,c;
        c=a+b;
        System.out.println(c);
    }
    void add(int x,int y){
        int c;
        c=x+y;
        System.out.println(c);
    }
    void add(int x,double y){
        double c;
        c=x+y;
        System.out.println(c);
    }

    public static void main(String[] args) {
        _18_Compile_time_polymorphism r = new _18_Compile_time_polymorphism();
        r.add();
        r.add(100,200);
        r.add(50,45.32);
    }
}
