package eroberer_practice.design_pattern._2_structural.chapter_13_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JavaProxySubject implements InvocationHandler {

    private Object target;

    public JavaProxySubject(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (doControlSomething()) {
            method.invoke(target, args);
        }

        doSomethingAfterInvoking();

        return null;
    }


    private boolean doControlSomething() {
        System.out.println("Java Proxy class control!");
        return true;
    }

    private void doSomethingAfterInvoking() {
        System.out.println("After real subject was invoked");
    }
}
