class Recur{
    
    public static int findReverse(int num, int temp){
        int ld;
	    //Implement your code here and change the return value accordingly
        if(num==0) return temp;
        else{
            ld=num%10;
            temp=temp*10+ld;
        }
        return (findReverse(num/10, temp)) ;
	}
	
	public static void main(String args[]){
	    int num = 12325;
        int reverseNum = findReverse(num,0);
        if(num == reverseNum)
            System.out.println(num +" is a palindrome!");
        else
            System.out.println(num +" is not a palindrome!");
	}
}