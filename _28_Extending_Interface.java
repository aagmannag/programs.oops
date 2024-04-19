interface Gill
{
    void add();
}
interface Raj extends Gill
{
    void sub();
}
class Aagman implements Raj{
    @Override
    public void add(){
        int a = 10, b = 20,c;
        c = a+b;
        System.out.println("Addition "+c);
    }
    @Override
    public void sub(){
        int a = 20, b = 10,c;
        c = a-b;
        System.out.println("Subtraction "+c);
    }
}
class M{
    public static void main(String[] args) {
        Raj r = new Aagman();
        r.add();
        r.sub();
    }
}