/*
 * Task 6
 *
 * Write the source code according to your UML class diagram of functional variation inheritance
 * */

public class Example {
    public static void main(String[] args){
        Adder add = new DirectAdder();

        System.out.println(add.addTowNums(2,3));

        add = new DummyAdder();

        System.out.println(add.addTowNums(2,3));
    }

}
