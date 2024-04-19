// we can't make object in abstract class but we can make refference variable.
// a class which contain the abstract keyword in its declaration is called abstract class.

// we can not make object.
//abstract class _22_abstract_class {
//}
//class la{
//    public static void main(String[] args) {
//        _22_abstract_class r = new _22_abstract_class(); // error - _22_abstract_class is abstract; cannot be instantiated.
//    }
//}

// but we make reference
//abstract class _22_abstract_class {
//}
//class Dog extends _22_abstract_class{
//
//}
//class la{
//    public static void main(String[] args) {
//        _22_abstract_class r = new Dog();
//    }
//}

// it may or may not contain abstract methords.
// it can have abstract and non abstract methord.
// to use an abstract class , you have to inherite it from sub classes.

// abstract program
abstract  class animal{
    animal(){
        System.out.println("All animals ....!");
    }
    public abstract void sound();
}
class dog extends animal{
    dog(){
        super();
    }
    public void sound(){
        System.out.println("Dog is Barking");
    }
}
class lion extends animal{
    lion() {
        super();
    }
    public void sound(){
        System.out.println("Lion is Roar");
    }
}
class tes{
    public static void main(String[] args) {
        dog d = new dog();
        lion l = new lion();
        d.sound(); l.sound();
    }
}