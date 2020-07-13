package Sinduri.A4.Package1;

public class A {
    /*Variables, methods, and constructors, which are declared protected in a superclass can be accessed only by the subclasses in other package or any class within the package of the protected members' class.*/
    public void msg1() {
        System.out.println("Public A");
    }

    protected void msg2() {
        System.out.println("Protected A");
    }

    //        /*Methods, variables, and constructors that are declared private can only be accessed within the declared class itself.
    //
    //Private access modifier is the most restrictive access level. Class and interfaces cannot be private.
    //
    //Variables that are declared private can be accessed outside the class, if public getter methods are present in the class.
    //
    //Using the private modifier is the main way that an object encapsulates itself and hides data from the outside world.*/
    private void msg3() {
        System.out.println("Private A");
    }

    /*Default access modifier means we do not explicitly declare an access modifier for a class, field, method, etc.

    A variable or method declared without any access control modifier is available to any other class in the same package. */
    void msg4() {
        System.out.println("Default A");
    }

    public static void main(String[] args) {
        new B().msg();
    }

    /*The following rules for inherited methods are enforced −

    Methods declared public in a superclass also must be public in all subclasses.

    Methods declared protected in a superclass must either be protected or public in subclasses; they cannot be private.

    Methods declared private are not inherited at all, so there is no rule for them.*/
}
