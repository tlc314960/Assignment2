public class Plus extends Operator {


    public Plus(MyNode l, MyNode r) {
        super(l, r);
    }

    @Override
    public int getValue() {
        return getR().getValue() + getL().getValue();
    }
}
