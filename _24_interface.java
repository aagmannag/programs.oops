// collection of abstract methord.
// keyword implements.
// 1- interface methord are by default public and abstract.
// 2- interface variable are by default public static and final.
// 3- interface methord must be overriden inside the implementing classes.
// 4- interface nothing but deals between client and developer.

import java.util.Scanner;

interface  _24_interface {
    void input(); // public + abstract
    void output(); // public + abstract
}
class Raju implements _24_interface {
    String name; double sal;
    public void input()
    {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter username: ");
        name = r.nextLine();

        System.out.println("Enter Salary: ");
        sal = r.nextDouble();
    }
    public void output(){
        System.out.println(name+" "+sal);
    }

    public static void main(String[] args) {
        _24_interface c = new Raju();
        c.input();c.output();
    }
}

