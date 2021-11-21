/*
 * Task 6
 *
 * Write the source code according to your UML class diagram of functional variation inheritance
 * */

public class Example {
    public static void main(String[] args){
        Addier add = new DirectAddier();

        System.out.println(add.addTowNums(2,3));

        add = new DummyAddier();

        System.out.println(add.addTowNums(2,3));
    }

}
