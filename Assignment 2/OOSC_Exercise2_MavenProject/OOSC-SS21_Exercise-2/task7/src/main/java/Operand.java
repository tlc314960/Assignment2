public class Operand implements MyNode{
    private int value = 0;

    public Operand(int n){
        value = n;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
