package SubArrayPractice;

import java.util.Scanner;
public class SATask11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int kth=sc.nextInt();
        String maxsubarr="";
        int maxcount=0;
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                int pro=1;
                String s="";
                int count=0;
                for(int k=i;k<=j;k++){
                    pro*=arr[k];
                    if (pro>kth){
                        break;   
                    }
                    s+=arr[k]+" ";
                    count++;
                }
                if(pro<=kth&&count>maxcount){
                    maxcount=count;
                    maxsubarr=s;
                }
            }
        }
        System.out.println(maxsubarr);
        System.out.println("length:"+maxcount);
        sc.close();
    }
}