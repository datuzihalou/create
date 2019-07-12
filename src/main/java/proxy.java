import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class proxy implements InvocationHandler {
    public Object object;

    public proxy(Object object) {
        super();
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("say".equals(method.getName())) {
            System.out.println("++++++before " + method.getName() + "++++++");
            Object result = method.invoke(object, "xiagao");
            System.out.println("++++++after " + method.getName() + "++++++");
            return result;
        } else {
            Object result = method.invoke(object, args);
            return result;
        }
    }

}
