import java.util.*;
class Subarray{
    void Generate(int[] arr,int n,int index,int[] sub)
    {
        
        if(index==n)
        {
            System.out.print("[");
            for(int i=0;i<n;i++)
            {
                if(sub[i]==1)
                {
                    System.out.printf("%d ",arr[i]);
                }
            }
            System.out.print("]");

        }
        else
        {
            sub[index]=1;
            Generate(arr,n,index+1,sub);
            sub[index]=0;
            Generate(arr,n,index+1,sub);
        }
        
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3};
        int n=arr.length;
        int[] sub=new int[n];
        Subarray obj=new Subarray();
        obj.Generate(arr,n,0,sub);
    }
    
}