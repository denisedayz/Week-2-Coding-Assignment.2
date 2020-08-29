
public class Loops {
	
	public static void main(String[] args) {
	
	System.out.println("Even numbers from 0-100:");
	int evenNumber = 0;
	while (evenNumber <= 100) {
		System.out.println(evenNumber);
		evenNumber+=2;
	}
	System.out.println("Every third number going backwards from 100-0:");
	int numberBackwards = 100;
	while (numberBackwards >=0) {
		System.out.println(numberBackwards);
		numberBackwards-=3;
	}
	System.out.println("Every other number from 1-100:");
	for (int n = 1; n<=100; n+=2) {
		System.out.println(n);
	}
	System.out.println("Every number from 0-100, div by 3 = Hello, div by 5 = World, div by 3 & 5 = Hello World:");
	for (int number=0; number<=100; number++) {
		if(number%3==0 && number%5==0) {
			System.out.println("Hello World");
		}	else if(number%3==0) {
			System.out.println("Hello");
		}	else if(number%5==0) {
			System.out.println("World");
		}	else System.out.println(number); {
		
	}
	}
	}}
	
	
	
