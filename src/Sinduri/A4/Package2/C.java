package Sinduri.A4.Package2;

import Sinduri.A4.Package1.A;

public class C extends A {
    String name;
    int age;

    public static void main(String[] args) {
        new C().msg1();
        new C().msg2();
        /*Methods, variables, and constructors that are declared private can only be accessed within the declared class itself.*/

//        new C().msg3();

        //Default methods cannot be accessed in other packages.
//        new C().msg4();
    }

}
