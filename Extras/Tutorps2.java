import java.util.Scanner;

public class Tutorps2{
    public static void step(int a[],int b[],int mini,int n)
    {
        int count[]=new int[n],flag=0,sp=0;
    // for(int i=0;i<n;i++)
    //    System.out.println(count[i]);
        for(int i=0;i<n;i++)
        {
            if(a[i]<mini) mini=a[i];
        }

        for(int i=0;i<n;i++)
        {
            if(a[i]-b[i]<mini) 
            {
                sp=-1;
            }
            else
            {
                while(a[i]>mini && a[i]>=b[i])
                {
                    a[i]-=b[i];
                    sp=0;
                    count[i]++;
                }
    // System.out.println(count[i]);
            }
        }
        for(int i=0;i<n-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                sp=-1;
            }
        }
        if(sp==0)
        {
            for(int i=0;i<n;i++)
            {
                flag+=count[i];
            }
            System.out.println(flag);
        }
        else System.out.println(sp);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int s=sc.nextInt();
        int mini = Integer.MAX_VALUE;
        int [] a = new int[n];
        int [] b = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt(); //first line
        }

        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt(); //second line
        }

        step(a,b,mini,n);

    }
}

// import java.util.Scanner;
// class Tutorps2 {
//     public static void main(String args[] ) throws Exception {
 
//         Scanner cn = new Scanner(System.in);
 
//         int n = cn.nextInt();
 
//         int[] arr1 = new int[n];
//         int[] arr2 = new int[n];
 
//         int count = 0;
 
//         for(int i=0;i<n;i++){
//             arr1[i] = cn.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             arr2[i] = cn.nextInt();
//         }
 
//         int min = arr1[0];
//         for (int i = 0; i < n; i++) {
//             if (min > arr1[i])
//                 min = arr1[i]-arr2[i];
//         }
 
//         for(int j=0;j<n;j++){
//             if(arr1[j]>min){
//                 if(arr2[j]==0){
//                     count = -1;
//                     break;
//                 }
//                 while(arr1[j]>min){
//                     arr1[j] -= arr2[j];
//                     count++;
//                 }
//                 if(arr1[j]!=min){
//                     count = -1;
//                     break;
//                 }
//             }
//         }
 
//         System.out.println(count);
 
//     }
 
// }