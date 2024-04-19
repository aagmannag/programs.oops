// wrapping of data amd methords into single unit is called Encapsulation.
// declare class variable as private.
// declare class methord as a public. Ex- class
// Encapsulation = data hiding + data abstraction.
public class _20_Encapsulation {
    private int value;// data hiding

    public void setValue(int x){ // data abstraction
        value = x;
    }
    public int getValur(){
        return value;
    }
}
class twinty{
    public static void main(String[] args) {
        _20_Encapsulation r = new _20_Encapsulation();
        r.setValue(100);
        System.out.println(r.getValur());
    }
}