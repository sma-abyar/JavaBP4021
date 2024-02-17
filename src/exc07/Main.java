package exc07;
import exc07.testable.MyList;
import exc07.tester.ListTester;

public class Main {
    public static void main(String[] args) {
        MyList mlist = new MyList();
        ListTester test = new ListTester();
        System.out.println(test.testAddAndGet(mlist));
        System.out.println(test.testEmptyList(mlist));
    }
}
