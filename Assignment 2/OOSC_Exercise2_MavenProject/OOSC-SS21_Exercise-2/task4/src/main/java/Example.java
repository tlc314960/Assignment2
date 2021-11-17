/*
* Task 4
*
* Write the source code according to your UML class diagram of view inheritance
* */

public class Example {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.info();
        std1.setYear(new Sophomore());
        std1.info();
        Student std2 = new SSE();
        std2.info();
        std2.setYear(new Freshman());
        std2.info();
    }
}
