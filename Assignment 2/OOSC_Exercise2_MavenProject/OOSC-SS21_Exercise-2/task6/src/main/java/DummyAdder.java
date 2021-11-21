public class DummyAdder implements Adder {
    @Override
    public int addTowNums(int i, int i1) {
        for(; i1 > 0; i1--){
            i++;
        }

        return i;
    }
}
