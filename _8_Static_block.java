// static block is executed first before instance
// static variable only use in static block.
public class _8_Static_block {
    static{
        System.out.println("Static"); // first static
    }
    {
        System.out.println("instance"); // second instance
    }

    public static void main(String[] args) {
        _8_Static_block r = new _8_Static_block();
    }
    _8_Static_block(){
        System.out.println("constructor"); // third default constructor
    }
}
