// multiple inheritance using interface
// because interface contains only abstract methord , which impliments is provided by the sub classes.
// we can not use this class c extends a,b . we can use class c implements a,b.

//class A{
//    void show(){
//        System.out.println("This is class A");
//    }
//}
//class B{
//    void show(){
//        System.out.println("This is class B");
//    }
//}
//class Multiple extends A,B // error
//{
//    public static void main(String[] args) {
//        Multiple m = new Multiple();
//        m.show();
//    }
//}


//interface A{
//    void show();
//}
//interface B{
//    void show();
//}
//class Multiple implements A,B // error
//{
//    public void show(){ // default is week than public thats why we use public.
//        System.out.println("Interface A & B");
//    }
//    public static void main(String[] args) {
//        Multiple m = new Multiple();
//        m.show();
//    }
//}


interface A{
    void Show();
}
interface B{
    void Disp();
}
class Multiple implements A,B
{
    public void Show(){ // default is week than public thats why we use public .
        System.out.println("Interface A ");
    }
    public void Disp(){ // default is week than public thats why we use public .
        System.out.println("Interface B");
    }
    public static void main(String[] args) {
        Multiple m = new Multiple();
        m.Show(); m.Disp();
    }
}