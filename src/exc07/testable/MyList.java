package exc07.testable;

public class MyList implements List{
    int[] ints = new int[0];
    @Override
    public void add(int i, int v) {
        int[] newInts = new int[ints.length + 1];
        for (int j = 0 ; j < i; j++) {
            newInts[j] = ints[j];
        }
        newInts[i] = v;
        for (int j = i+1 ; j < ints.length + 1 ; j++) {
            newInts[j] = ints[j-1];
        }
        ints = newInts;
    }
    @Override
    public int get(int i) {
        return ints[i];
    }
    @Override
    public void emptyList() {
        ints = new int[0];
    }
}
