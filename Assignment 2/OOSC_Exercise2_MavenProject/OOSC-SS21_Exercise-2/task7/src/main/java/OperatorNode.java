public class OperatorNode extends Node{
    public OperatorNode(String value) {
        super(value);
    }

    @Override
    public double compute() {
        return compute(this);
    }

    private double compute(Node currentNode) {
        double res = 0;
        switch (currentNode.getValue()) {
            case "+":
                res = currentNode.lNode.compute() + currentNode.rNode.compute();
                break;
            case "-":
                res = currentNode.lNode.compute() - currentNode.rNode.compute();
                break;
            case "*":
                res = currentNode.lNode.compute() * currentNode.rNode.compute();
                break;
            case "/":
                res = currentNode.lNode.compute() / currentNode.rNode.compute();
                break;
            case "%":
                res = currentNode.lNode.compute() % currentNode.rNode.compute();
                break;
        }
        return res;
    }
}
