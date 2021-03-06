package exercise.chap10;

import interfaces.Innerable;

/**
 * Chap 10 inner classes exercise 6
 * Create an interface with at lease one method, in its own
 * package. -- interfaces.Innerable
 * <p>
 * Create a class in a separate package.
 * Add a protected inner class
 * that implements the interface. -- innerclass.Outer
 * <p>
 * In a third package, inherit from your class and
 * inside a method, return an object of the protected inner class, upcasting to
 * the interface during the return. -- exercise.chap10.Exercise6
 *
 * @author Leo
 * @since 2016/10/19
 */
public class Exercise6 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.createInner().innerPrint();
    }
}

class Outer2 extends innerclass.Outer {
    public Innerable createInner() {
        return this.new Inner();
    }
}
