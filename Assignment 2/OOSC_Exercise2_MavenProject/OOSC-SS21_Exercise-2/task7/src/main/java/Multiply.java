public class Multiply extends Operator{


    public Multiply(MyNode l, MyNode r) {
        super(l, r);
    }

    @Override
    public int getValue() {
        return getL().getValue() * getR().getValue();
    }
}
