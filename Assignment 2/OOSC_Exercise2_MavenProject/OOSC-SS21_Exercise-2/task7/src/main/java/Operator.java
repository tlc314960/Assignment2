public abstract class Operator implements MyNode{
    private MyNode r;
    private MyNode l;

    public Operator(MyNode l, MyNode r){
        setL(l);
        setR(r);
    }

    public abstract int getValue();

    public MyNode getR() {
        return r;
    }

    public void setR(MyNode r) {
        this.r = r;
    }

    public MyNode getL() {
        return l;
    }

    public void setL(MyNode l) {
        this.l = l;
    }
}
