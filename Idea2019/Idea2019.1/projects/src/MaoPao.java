import java.util.*;

public class MaoPao {
    public static void main(String[] args){
        System.out.println("请输入五个整数");
        Scanner in = new Scanner(System.in);
        int []a = new int[5];
        for(int i=0;i<5;i++){
            a[i] = in.nextInt();
        }
        MaoPao mp = new MaoPao();
        mp.sort(a);
        System.out.println("通过冒泡排序后由大到小的顺序是：");
        for(int i=0;i<5;i++){
            System.out.print(a[i]);
        }
    }
        //sort（arr[]）是对数组的冒泡排序方法。其中，对n个数的冒泡排序，共进行n-1次排序，分别获得最大，次大，次次大的数。
        // 用第一层for循环控制这个排序次数，第二层for循环控制每次循环的交换次数，每次循环的交换次数为n-i；i为第i次
        //每次比较都是从数组的第一个数开始进行比较
    public void sort(int a[]){
        for(int i=0;i<4;i++){
            int m=0;
            for(int j=0;j<4-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    m=a[j];a[j]=a[j+1];a[j+1]=m;
                }
            }
        }
    }
}
