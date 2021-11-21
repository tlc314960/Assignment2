/*
 * Task 7
 *
 * Write the source code according to your UML class diagram of arithmetic expressions calculator
 * */

public class Example {
    public static void main(String[] args) {
        String str = "((2*(5+10))-9)/3";

        Operator a = new Plus(new Operand(5),new Operand(10));
        Operator b = new Multiply(new Operand(2),a);
        Operator c = new Minus(b,new Operand(9));
        Operator d = new Divided(c,new Operand(3));
        System.out.println(str + '=' +  d.getValue());

    }
}
