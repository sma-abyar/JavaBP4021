package exc06.prb02;

public class IntArray {

    int[] array;
    IntArray(int length) {
        array = new int[length];
    }
    public int get(int i){
        if (i>=0 && i<array.length){
            return array[i];
        }else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public void put(int i, int n){
        array[i] = n;
    }
    public int length(){
        return array.length;
    }
    public int[] toArray(){
        int[] nArray = new int[array.length];
        System.arraycopy(array, 0, nArray, 0, array.length);
        return nArray;
    }

    @Override
    public String toString(){
        String s = "[";
        for(int i=0; i<array.length; i++){
            s += array[i];
            if (i!= array.length-1){
                s += ", ";
            }
        }
        s += "]";
        return s;
    }
    @Override
    public boolean equals(Object obj){
        IntArray myArr = (IntArray) obj;
        boolean isEq = array.length == myArr.length();
        if (isEq){
            for (int i = 0; i<array.length; i++){
                if(myArr.get(i) != array[i]){
                    isEq = false;
                    break;
                }
            }
        }
        return isEq;
    }

}
