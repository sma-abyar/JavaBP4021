package exc06.prb02;

public class ResizableIntArray extends IntArray {
    ResizableIntArray(int length) {
        super(length);
    }
    public void append(int n){
        int[] alter = new int[array.length+1];
        for (int i=0; i< array.length; i++){
            alter[i] = array[i];
        }
        alter[array.length] = n;
        array = alter;
    }
    public void pop(){
        if (array.length != 0){
            int[] alter = new int[array.length-1];
            for (int i=0; i< array.length-1; i++){
                alter[i] = array[i];
            }
            array = alter;
        }else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public void extend(int[] newArray){
        int[] alter = new int[array.length+newArray.length];
        for (int i=0; i< array.length;i++){
            alter[i] = array[i];
        }
        for (int i=0; i< newArray.length;i++){
            alter[array.length+i] = newArray[i];
        }
        array = alter;
    }
    public void changeSize(int n){
        if (array.length+n>=0){
            int[] alter = new int[array.length+n];
            if(n>=0){
                for (int i=0; i< array.length;i++){
                    alter[i] = array[i];
                }
                for (int i=0; i<n; i++){
                    alter[array.length+i] = 0;
                }
            }else {
                for (int i=0; i< array.length+n;i++){
                    alter[i] = array[i];
                }
            }
            array = alter;
        }else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

}
