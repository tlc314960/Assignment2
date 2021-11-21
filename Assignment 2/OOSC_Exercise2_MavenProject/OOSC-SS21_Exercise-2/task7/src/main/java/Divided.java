public class Divided extends Operator{

    public Divided(MyNode l, MyNode r) {
        super(l, r);
    }

    @Override
    public int getValue() {
        return getL().getValue() / getR().getValue();
    }
}
