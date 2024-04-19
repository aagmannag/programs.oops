// a methord which contain abstract modifier at the time of declaration is called abstract methord.
// 1-used in abstract class.
// // 2-it dosen't contain any body "{ } " and always ends with " ; ".
// 3-abstract methord must be overriden in sub classes otherwise it will also become a abstract class.
// 4-whenever the action is common but implementation are different then we should use abstract.
//abstract class _23_abstract_methord{
//    public abstract void developer();
//}
//class HTML extends _23_abstract_methord{
//    @Override
//    public void developer(){
//        System.out.println("Tim Berners Lee");
//    }
//}
//class java extends _23_abstract_methord{
//    @Override
//    public void developer(){
//        System.out.println("James Gosling");
//    }
//}
//class main{
//    public static void main(String[] args) {
//        HTML h = new HTML(); // we make abstract class reference.
//        h.developer();
//        java j = new java(); // we make abstract class reference.
//        j.developer();
//    }
//}


//abstract class _23_abstract_methord{
//    public abstract void developer();
//    public abstract void rank();
//}
//class HTML extends _23_abstract_methord{
//    @Override
//    public void developer(){
//        System.out.println("Tim Berners Lee");
//    }
//    @Override
//    public void rank(){
//        System.out.println("3rd");
//    }
//}
//abstract class java extends _23_abstract_methord{ // we wright abstract because of we not override rank class
//    @Override
//    public void developer(){
//        System.out.println("James Gosling");
//    }
//}
//class main{
//    public static void main(String[] args) {
//        HTML h = new HTML(); // we make abstract class reference.
//        h.developer(); h.rank();
//    }
//}


abstract class _23_abstract_methord{
    public abstract void developer();
    public abstract void rank();
}
 abstract class HTML extends _23_abstract_methord{
    @Override
    public void developer(){
        System.out.println("Tim Berners Lee");
    }
    @Override
    public void rank(){
        System.out.println("3rd");
    }
}
class java extends HTML{ // we wright abstract because of we not override rank class
    @Override
    public void rank(){
        System.out.println("2nd");
    }
}
class main{
    public static void main(String[] args) {
        HTML h = new java(); // we make abstract class reference.
        h.developer(); h.rank();
    }
}