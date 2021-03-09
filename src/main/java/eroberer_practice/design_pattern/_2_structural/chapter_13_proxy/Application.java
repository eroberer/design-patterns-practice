package eroberer_practice.design_pattern._2_structural.chapter_13_proxy;

import java.lang.reflect.Proxy;

public class Application {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        subject.request();

        // Default Proxy
        Subject proxySubject = new ProxySubject(subject);
        proxySubject.request();

        // Java Proxy
        Subject javaProxySubject = (Subject) Proxy.newProxyInstance(
                Subject.class.getClassLoader(),
                RealSubject.class.getInterfaces(),
                new JavaProxySubject(subject));

        javaProxySubject.request();
    }
}
