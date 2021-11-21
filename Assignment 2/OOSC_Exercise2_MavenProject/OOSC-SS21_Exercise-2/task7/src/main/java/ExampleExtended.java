/*
 * Task 7
 *
 * Write the extension of your arithmetic expressions calculator to support the modulo operator: %
 * */

public class ExampleExtended {
    public static void main(String[] args) {
        String str = "((2*(5+10))-9)/3%3";

        Operator a = new Plus(new Operand(5),new Operand(10));
        Operator b = new Multiply(new Operand(2),a);
        Operator c = new Minus(b,new Operand(9));
        Operator d = new Divided(c,new Operand(3));
        Operator e = new Modulo(d,new Operand(3));
        System.out.println(str + '=' +  e.getValue());

    }
}
