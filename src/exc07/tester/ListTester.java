package exc07.tester;

import exc07.testable.List;

import java.util.Objects;

public class ListTester {
    public boolean testList(List list) {
        boolean a = testAddAndGet(list);
        boolean b = testException(list);
        boolean c = testEmptyList(list);
        return a && b && c;
    }
    public boolean testAddAndGet(List list){
        int a = 5;
        list.add(0,a);
        if (list.get(0) == a){
            return true;
        }else {
            return false;
        }
    }
    public boolean testException(List list){
        //TODO
        return false;
    }
    public boolean testEmptyList(List list) {
//        List newlist = new List();
        list.emptyList();
        if (list.equals(null)){
            return true;
        }else {
            return false;
        }
    }
}