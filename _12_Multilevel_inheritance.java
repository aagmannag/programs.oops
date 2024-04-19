// 1 super class and multipal sub class line by line.
public class _12_Multilevel_inheritance {  // super
    int a,b,c;
    void add(){
        a=10;b=20;
        c= a+b;
        System.out.println("Sum of two no.: "+c);
    }
    void sub(){
        a=200; b=100;
        c= a-b;
        System.out.println("Sub of two no.: "+c);
    }
}
class twelve extends _12_Multilevel_inheritance{ // sub 1
    void multi() {
        a = 200;
        b = 100;
        c = a * b;
        System.out.println("Multiplication of two no.: " + c);
    }
    void div() {
        a = 200;
        b = 100;
        c = a / b;
        System.out.println("Division of two no.: " + c);
    }
}

class twelve2 extends twelve { // sub2
    void rem() {
        a = 200;
        b = 100;
        c = a % b;
        System.out.println("reminder of two no.: " + c);
    }
}
class test{
    public static void main(String[] args) {
        twelve2 r = new twelve2();
        r.add();
        r.sub();
        r.multi();
        r.div();
        r.rem();
    }
}