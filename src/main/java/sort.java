import com.google.common.primitives.Ints;

import java.util.List;

public class sort {
    public static int[] pop(int[] array){
        if(array.length==0)
            return array;
        for(int i =0;i<array.length;i++){
            for (int j =1;j<array.length-i-1;j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] =tmp;
                }

            }
        }
        return array;
    }
    public static int[] quick(int [] a){
        for(int i= 0;i<a.length;i++){
            int smallindex = i;
            for(int j = i;j<a.length;j++){
                if(a[smallindex] > a[j]){
                    smallindex = j;
                }
            }
            int tmp = a[smallindex];
            a[smallindex] = a[i];
            a[i] =tmp;
        }
        return a;
    }

    public static int[]  insert(int []array){
        int current = 0;
        for (int i = 0;i<array.length-1;i++){
            current = array[i+1];
            int index = i;
            while (index>=0&&current<array[index]){
                array[index+1]= array[index];
                index --;
            }
            array[index+1] = current;
        }
        return  array;
    }
    public static void  swap(int[] array, int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public  static int[] partition(int[] array, int start, int end){
        int pivot = (int) (start+Math.random()*(end-start+1));
        int smallIndex = start -1;
        swap(array,pivot,end);
        for(int i = start;i<= end;i++){
            if(array[i]<=array[end]){
                smallIndex++;
                if (i>smallIndex)
                    swap(array,i,smallIndex);
            }
        }
        return array;
    }

    public  static int[] shellSort(int[]arr){
        int len = arr.length;
        int temp, gap = len / 2;
        while (gap>0){
            for(int i =gap ;i<len;i++){
                temp = arr[i];
                int preIndex = i - gap;
                while(preIndex >= 0 && arr[preIndex] > temp){
                    arr[preIndex + gap] = arr[preIndex];
                    preIndex -= gap;
                }
                arr[preIndex + gap] = temp;
            }

            gap /= 2;
        }
        return arr;
    }
    public static int[] quickSort(int[] arr,int low,int high){
        int i,j,temp;
        if(low>high){
            return arr;
        }

        i = low;
        j = high;
        temp = arr[low];
        while (i<j){
            while(temp<=arr[j]&&i<j){
                j--;
            }
            while(temp>=arr[i]&&i<j){
                i++;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        arr[low] = arr[i];
        arr[i]=temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
        return arr;
    }

        public static void main(String[] args) {
        int[] a = new int[]{1,4,3,8,6,7,9,2,5,5};
        List<Integer> b = Ints.asList(shellSort(a));
        b.forEach(m->{
            System.out.print(m);
        });

    }
}
