public abstract class Node {
    protected Node lNode = null;
    protected Node rNode = null;
    protected String value = "";

    public Node(String value) {
        this.value = value;
    }

    public abstract double compute();

    public Node getlNode() {
        return lNode;
    }

    public Node getrNode() {
        return rNode;
    }

    public String getValue() {
        return value;
    }

    public void setlNode(Node lNode) {
        this.lNode = lNode;
    }

    public void setrNode(Node rNode) {
        this.rNode = rNode;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
