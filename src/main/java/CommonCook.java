

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CommonCook {
        public static void main(String[] args) throws InterruptedException, ExecutionException {
            long startTime = System.currentTimeMillis();
            // 第一步 网购厨具
            Callable onlineShopping=new OnlineShopping();
            FutureTask futureTask=new FutureTask(onlineShopping);
            new Thread(futureTask).start();
           // 保证厨具送到
            // 第二步 去超市购买食材
            Thread.sleep(2000);  // 模拟购买食材时间
            Shicai shicai = new Shicai();
            System.out.println("第二步：食材到位");
            // 第三步 用厨具烹饪食材
            System.out.println("第三步：开始展现厨艺");
            if (!futureTask.isDone()) {  // 联系快递员，询问是否到货
                System.out.println("第三步：厨具还没到，心情好就等着（心情不好就调用cancel方法取消订单）");
                futureTask.cancel(true);
            }
           cook((Chuju) futureTask.get(), shicai);

            System.out.println("总共用时" + (System.currentTimeMillis() - startTime) + "ms");
        }
    // 网购厨具线程
    static class OnlineShopping implements Callable {

        private Chuju chuju;


        public Object call() {
            System.out.println("第一步：下单");
            System.out.println("第一步：等待送货");
            try {
                Thread.sleep(5000);  // 模拟送货时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("第一步：快递送到");
            chuju = new Chuju();
            return chuju;
        }
    }

    // 厨具类
    static class Chuju {}

    // 食材类
    static class Shicai {}
    //  用厨具烹饪食材
    static void cook(Chuju chuju, Shicai shicai) {}
}
