package eroberer_practice.design_pattern._2_structural.chapter_13_proxy;

public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        if (doControlSomething()) {
            subject.request();
        }

        doSomethingAfterInvoking();
    }

    private boolean doControlSomething() {
        System.out.println("Proxy class control!");
        return true;
    }

    private void doSomethingAfterInvoking() {
        System.out.println("After real subject was invoked");
    }
}
