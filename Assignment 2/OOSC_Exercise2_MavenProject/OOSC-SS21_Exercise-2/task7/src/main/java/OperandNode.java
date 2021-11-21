public class OperandNode extends Node{
    public OperandNode(String value) {
        super(value);
    }

    @Override
    public double compute() {
        return Double.parseDouble(getValue());
    }
}
