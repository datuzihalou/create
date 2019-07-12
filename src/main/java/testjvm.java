import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

public class testjvm extends Thread {
    public static void main(String[] args) {

        testjvm mt1 = new testjvm("Thread a");
        testjvm mt2 = new testjvm("Thread b");

        mt1.setName("My-Thread-1 ");
        mt2.setName("My-Thread-2 ");

        mt1.start();
        mt2.start();
    }

    public testjvm(String name) {
    }

    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

