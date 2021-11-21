public class Minus extends Operator{


    public Minus(MyNode l, MyNode r) {
        super(l, r);
    }

    @Override
    public int getValue() {
        return getL().getValue() - getR().getValue();
    }
}
