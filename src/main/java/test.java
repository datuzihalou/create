

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicInteger;


public class test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class pxy = Class.forName("testProxyImpl");
        Method method = pxy.getDeclaredMethod("say",String.class);
        testProxy testProxy = (testProxy) pxy.newInstance();
        proxy proxy = new proxy(testProxy);
        testProxy testProxy1 = (testProxy) Proxy.newProxyInstance(testProxy.getClass().getClassLoader(),testProxy.getClass().getInterfaces(),proxy);
        testProxy1.say("");
        testProxy1.smile();
        method.invoke(testProxy,"quniama");
        AtomicInteger a = new AtomicInteger();
    }

}
