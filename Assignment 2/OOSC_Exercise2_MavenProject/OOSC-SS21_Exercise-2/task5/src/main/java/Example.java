/*
 * Task 5
 *
 * Write the source code according to your UML class diagram of implementation inheritance
 * */

public class Example {
    public static void main(String[] args) {
        SophomoreStu std1 = new SophomoreStu();
        std1.Thesis();
        std1.GermanCourse();

        NewSophomore std2 = new NewSophomore();
        std2.Thesis();
//        std2.GermanCourse(); Do not have unwanted methods
    }
}
