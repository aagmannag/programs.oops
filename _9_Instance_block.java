// same as methord but it have no name
// you can not access instance block without any object. it deals with object
// you can make instance block in side the class not inside methord
// 1-it always executed before the constructor .
// 2-we can use variable block only inside the instance block not methord .
// 3-we write time consuming code inside a instance block .
class Instance_block {
    int a,b;
    void show(){ // methord call in last
        a=50;b=60;
        System.out.println(a+" "+b);
    }
    Instance_block(){ // constructor calls second last
        a=30;b=40;
        System.out.println(a+" "+b);
    }
    { // instance  // it calls first
        a=10;b=20;
        System.out.println(a+" "+b);
    }
    static {
        System.out.println("Hello i am first");
    }
}
class l{
    public static void main(String[] args) {
        Instance_block r = new Instance_block();
        r.show();
    }
}
