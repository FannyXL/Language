package exercise.chap12;

import static net.mindview.util.Print.print;

/**
 * Create a class with a main() that throws an object of class Exception
 * inside a try block. Give the constructor for Exception a String argument. Catch the
 * exception inside a catch clause and print the String argument. Add a finally clause and
 * print a message to prove you were there.
 *
 * @author Leo
 * @since 2016/11/3
 */
public class Exercise1 {
    public static void main(String[] args) {
        try {
            ExceptionClass1.main(args);
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            print("finally");
        }
    }
}

class ExceptionClass1 {
    public static void main(String[] args) throws Exception {
        throw new Exception("exercise1");
    }
}
