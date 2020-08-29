
public class Booleans {

	public static void main(String[] args) {
		
	boolean isHotOutside = true;
	boolean isWeekday = false;
	boolean hasMoneyInPocket = true;
	
	double costOfMilk = 2.99;
	double moneyInWallet = 8.00;
	int thirstLevel = 7;
	
	boolean shouldBuyIceCream = hasMoneyInPocket && isHotOutside;
	if(shouldBuyIceCream == true)
		System.out.println("It's hot outside and I have money in my pocket, so I'm getting me some ice cream!");
	
	boolean willGoSwimming = isHotOutside && !isWeekday;
	if (willGoSwimming == true)
		System.out.println("It's hot outside and it's the weekend, so I'm going swimming!");
	
	boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
	if (isAGoodDay == true)
		System.out.println("It's hot outside, I've got money in my pocket, and it's the weekend, so it's a VERY good day!");

	boolean willBuyMilk = (isHotOutside && thirstLevel>=3) && (moneyInWallet >= (2*costOfMilk));
	if (willBuyMilk == true)
		System.out.println("It's hot outside, I'm really thirsty, and my pockets are full, so I'm going to buy some milk.");
	
	
			

	
	}
	
	}


