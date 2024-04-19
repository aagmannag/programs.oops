//exists at the time of execution of program.
// ex - methord overriding.
// whenever we writing methord in super and sub classes in such a way that methord name and parameter must be same called methord overriding.
// rules of methord overriding -
// methord No(compiletion error) yes(overriden or not) No(Call super class methoed) Yes(call sub class methord)
//public class _19_Runtime_Polymorphism {
//    void draw(){
//        System.out.println("Can't say shape Type");
//    }
//}
//class square extends _19_Runtime_Polymorphism{
//    @Override
//    void draw(){
//        System.out.println("square shape"); // output
//    }
//}
//class Deo{
//    public static void main(String[] args) {
//        _19_Runtime_Polymorphism r = new square();
//        r.draw();
//    }
//}

//public class _19_Runtime_Polymorphism {
//    void draw(){
//        System.out.println("Can't say shape Type"); // output
//    }
//}
//class square extends _19_Runtime_Polymorphism{
//    void draw(){
//        System.out.println("square shape");
//    }
//}
//class Deo{
//    public static void main(String[] args) {
//        _19_Runtime_Polymorphism r = new square();
//        r.draw();
//    }
//}

public class _19_Runtime_Polymorphism {
    void draw(){
        System.out.println("Can't say shape Type");
    }
}
class square extends _19_Runtime_Polymorphism{
    @Override
    void draw(){
        super.draw();
        System.out.println("square shape");
    }
}
class Deo{
    public static void main(String[] args) {
        _19_Runtime_Polymorphism r = new square();
        r.draw();
    }
}