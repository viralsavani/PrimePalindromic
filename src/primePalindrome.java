
public class primePalindrome {

	public static void main(String[] args) {

		//		boolean primeFlag;
		//		for(int i = 2; i < 12; i++){
		//			primeFlag = true;
		//			for(int j = 2; j < i; j++){				
		//				if(i%j == 0){
		//					primeFlag = false;
		//				}
		//			}
		//			System.out.println("Number Prime?"+i+"->"+primeFlag);
		//		}

		//		int lastTwo = 12%100;
		//		int last = 12%10;
		//		int firstTwo = 12/10;
		//		System.out.println("12"+"\t"+lastTwo%10+"\t"+last+"\t"+firstTwo);
		//		
		//		int i = 12221/10;
		//		int j = 12221%10;
		//		System.out.println(i+"\t"+j+"\t"+j);


		int maxPrimePalindrome = 0;
		for(int j = 0; j < 1000; j++){
			int jtemp = j;
			int last = 0;
			int number = 0;
			while(jtemp>0){
				last = jtemp%10;
				number = number *10 + last;
				jtemp = jtemp / 10;
			}
			if(number == j){
				boolean primeFlag = true;					
				for(int counter = 2; counter < number; counter++){				
					if(number%counter == 0){
						primeFlag = false;
					}
				}
				if(primeFlag == true){
					if(number>maxPrimePalindrome){
						maxPrimePalindrome = number;
					}
				}
			}
		}
		System.out.println(maxPrimePalindrome); //Maximum number which is palindrome as well as prime under 1000.
		
		//		int j = 11;
		//		
		//		int jtemp = j;
		//		while(jtemp>0){
		//			last = jtemp%10;
		//			number = number *10 + last;
		//			jtemp = jtemp / 10;
		//			System.out.println(jtemp+"\t"+last+"\t"+"\t"+number);
		//		}
		//		if(number == j){
		//			System.out.println("PALINDROM");
		//		}
		//		else{
		//			System.out.println("NOT PALINDROM");
		//		}
	}

}
