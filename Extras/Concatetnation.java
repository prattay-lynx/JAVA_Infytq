
public class Concatetnation {
    public static void main(String[] args) {
        int n = 9,sum=0,num=0,ld=0,j=0; 
        String listAssume [] = new String[] {"6","1","2","5","1","4","8","9","9","1"};
        int len = listAssume.length;
        int arr[]=new int[len];
        for(int i = 0;i<len;i++)
        {
            arr[i]=Integer.parseInt(listAssume[i]);
        }
        j =0;
            while(arr[j]!=5)
            {
                sum+=arr[j];
                j++;
            }
            while(arr[j]!=8)
            {
                num+=arr[j];
                num=num*10;
                j++;
            }
            num+=arr[j];
            j++;
            while(j<len)
            {
                sum+=arr[j];
                j++;
            }
        System.out.println("Output:"+(num+sum));
        }
    }

