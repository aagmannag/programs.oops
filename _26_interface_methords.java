interface Client
{
    void weddesign(); // public + abstract
    void webdevelope(); // public + abstract
}
abstract class RajTech implements Client
{
    @Override
    public void weddesign() {
        System.out.println("Green, top menu, three dot button");
    }
}
class RahulTech extends RajTech
{
    @Override
    public void webdevelope() {
        System.out.println("HTML,CSS, JS");
    }
}
class Check{
    public static void main(String[] args) {
        RahulTech r = new RahulTech();
        r.weddesign();
        r.webdevelope();
    }
}