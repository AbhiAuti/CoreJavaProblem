package ProblemSolving;

public class Function {
	
	
	public static void biggest(int a,int b,int c) {
		
		int max=a ;
		if(max<b) {
			max=b;
		}
		
		if(max<c) {
			max=c;
		}
		
		System.out.println(max);
		
	}
	
	public static void factorial(int num) {
		int res =1;	
		while(num!=1) {
			res*=num;
			num--;		
		}	
		System.out.println(res);
	}
	
	public static void isprime(int num) {
		boolean isprime=true;
		if(num<=1) {
			isprime=false;
		}else {
			for(int i =2;i*i<=num;i++) {                                     //If a number num is divisible by i, then:Either i is less than or equal to √num  

				if(num%i==0) { 
					isprime=false;
				}
			}
		}
		
		if(isprime) {
			System.out.println("a prime number");
		}else {
			System.out.println("not a prime");
		}
		
	}
	
	public static void reverse(int num) {
		int temp =num;
		int digit=0;
		int res=0;
		while(temp!=0) {
			digit=temp%10;
			res=res*10+digit;
			temp=temp/10;
		}
		System.out.println(res);
	}
	
	
	public static int noOfVowel(String str) {
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}
			
		}
		return count;
	}

	public static boolean ispalin(String str) {
		String res ="";
		for(int i=str.length()-1;i>=0;i--) {
			res =res+str.charAt(i);
		}
		if(res.equals(str)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
//		biggest(10,50,30);
//		factorial(6);
//		isprime(7);
//		reverse(123);	
//		String str="abhseou";
//		System.out.println(noOfVowel(str));

//		String	str ="abba";
//		System.out.println(ispalin(str));
		

		
		
	}

}
