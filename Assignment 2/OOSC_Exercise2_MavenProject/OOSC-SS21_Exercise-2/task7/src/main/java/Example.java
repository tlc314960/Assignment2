/*
 * Task 7
 *
 * Write the source code according to your UML class diagram of arithmetic expressions calculator
 * */

public class Example {
    public static void main(String[] args) {
        String str = "((2*(5+10))-9)/3%3";
        Node root = ExpressionTree.build(str);
        System.out.println(ExpressionTree.compute(root));
        ExpressionTree.inShow(root);
    }
}
