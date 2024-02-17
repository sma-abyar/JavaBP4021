package exc06.prb02;

class IntArrayHelper{
    static void sortInPlace(IntArray a) {
        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j < a.length(); j++) {
                int tmp = 0;
                if (a.get(i) > a.get(j)) {
                    tmp = a.get(i);
                    a.put(i,a.get(j));
                    a.put(j,tmp);
                }
            }
        }
    }
    static boolean isSorted(IntArray a){
        boolean isSorted = true;
        for (int i=0; i<a.length()-1;i++){
            if (a.get(i)>a.get(i+1)){
                isSorted = false;
            }
        }
        return isSorted;
    }
    static Integer findInSorted(IntArray a, int val){
        int left = 0;
        int right = a.length()-1;
        while (left<=right){
            int mid = left + (right -left)/2;
            if (a.get(mid) == val){
                return mid;
            }if(a.get(mid)<val){
                left = mid+1;
            }if (a.get(mid)>val){
                right = mid-1;
            }
        }
        return null;
    }

}
