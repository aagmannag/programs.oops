// interface variables are public , static and final.
interface coustomerRaj {
    int amt = 5; // public + static +final
    void purchase(); // public + abstract
}
class sellerSanju implements coustomerRaj{
    @Override
    public void purchase(){
//        amt = 7; // error - cannot assign a value to final variable amt
        System.out.println("Raj needs "+amt+" kg rice");
    }
}
class Ceck{
    public static void main(String[] args) {
        coustomerRaj c = new sellerSanju();
        c.purchase();
        System.out.println(coustomerRaj.amt); // static variable
    }
}
