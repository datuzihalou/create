import com.sun.org.apache.xalan.internal.utils.XMLSecurityPropertyManager;

import java.util.Comparator;
import java.util.PriorityQueue;

public class propertyQueue {
    public static void main(String[] args) {
        int k =5;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue(k);

        int [] a = new int[]{1,2,3,4,5,6,134,56,234,6,3456};
        for(int b:a){
            if(priorityQueue.size()<k){
                priorityQueue.offer(b);
            }else{
                if(priorityQueue.peek()<b){
                    priorityQueue.poll();
                    priorityQueue.offer(b);
                }
            }
        }

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }



}
