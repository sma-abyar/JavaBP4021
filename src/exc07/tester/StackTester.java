package exc07.tester;

import exc07.testable.Stack;

public class StackTester {
    public boolean testStack(Stack stack) {
        boolean a = testPopAndPush(stack);
        boolean b = testException(stack);
        return a && b;

    }
    public boolean testPopAndPush(Stack stack){
        //TODO
        return false;
    }
    public boolean testException(Stack stack){
        //TODO
        return false;
    }
}