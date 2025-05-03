import java.util.*;
class Subarray2{
    void iteration(int[] arr,int n)
    {
       
        for(int i=0;i<Math.pow(2, n);i++)
        {
            System.out.print("[");
            for(int j=0;j<n;j++)
            {
                if((i & (1<<j))!=0)
                {
                    System.out.printf("%d ",arr[j]);
                }
            }
            System.out.print("]");
        }
        ;
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3};
        int n=arr.length;
        Subarray2 obj=new Subarray2();
        obj.iteration(arr,n);
    }
}