/*  1.When the array is created and initialized?
    Answer: At the run time using JVM.
    2.When we want to print an Object?
    Answer:
    3.What is Hashcode?
    Answer: It is method of java.lang.object.
            Object class contains 11 methods. And are overloaded methods.
            It returns one Integer value. And it gives hashcode of the object.
            Which means it is divided by 16 and the reminder says that object stays in that row inside a Hashtable in JVM(heap area).
    4.When you want to print a reference, what it prints ?
    Answer: It prints: (Classname@Hashcode) in Hexadecimal number system.
            '[' single bracket means it's a 1D array, else for 2D array it will print '[['.
    5."javadoc Example.java" is used to display the documentation of "Example.java" file.
    "index.html" is used to take to the documentation of code...
    6.Different ways of taking input values from the user:
        1)By using Scanner Class
        2)By using args
        3)By using BufferReader
        4)By using JOptionpane
        5)From the Console
*/
public class Example {
    public static void main(String[] args) {
        System.out.println(args.length);
        System.out.println(args);
        System.out.println(args[0]);
        Example ob=new Example();
        System.out.println(ob);
        System.out.println(ob.hashCode());
        Example ob1=new Example();
        System.out.println(ob1);
        System.out.println(ob1.hashCode());
    }
}
