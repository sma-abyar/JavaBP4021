package exc06.prb02;

public class Main {
    public static void main(String[] args) {
        /*IntArray b = new IntArray(2);
        b.get(1);
        b.put(0,1);
        ResizableIntArray c = new ResizableIntArray(5);
        c.append(3);
        int[] a = b.toArray();
        c.extend(a);
        System.out.println(c);
        System.out.println(IntArrayHelper.isSorted(c));
        IntArrayHelper.sortInPlace(c);
        System.out.println(c);
        System.out.println(IntArrayHelper.isSorted(c));*/
        int n = 10000000;
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = i+1;
        }
        ResizableIntArray ria = new ResizableIntArray(3);
        ria.changeSize(100);
        ria.changeSize(-10);
        System.out.println(ria.length());

    }
}
