public class Modulo extends Operator{
    public Modulo(MyNode l, MyNode r) {
        super(l, r);
    }

    @Override
    public int getValue() {
        return getL().getValue() % getR().getValue();
    }
}
