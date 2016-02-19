
public class driver {

	public static void main(String[] args) {
		
		people genericPeople = new people();//create object
		
		System.out.println(genericPeople.getName());
		System.out.println(genericPeople.getfavColor());
		System.out.println(" ");
		
		
		girl dawn = new girl("Dawn", "Red", "Wine");//create people object
		
		System.out.println(dawn.getName());
		System.out.println(dawn.getfavColor());
		System.out.println(dawn.getfavDrink());
	//	System.out.println(dawn.cook());
		System.out.println(" ");
		
		
		boy troy = new boy("Troy", "Blue", "Beer");
		
		System.out.println(troy.getName());
		System.out.println(troy.getfavColor());
		System.out.println(troy.getfavDrink());
			

		people bess = new girl("Bess", "Purple","soda");
		acceptPeople(bess);
						
}
	public static void acceptPeople(people randPeople)
	{
		System.out.println();
		System.out.println(randPeople.getName());
		System.out.println(randPeople.getfavColor());
		System.out.println();
		
		randPeople.cook();//Poly
	
		System.out.println();
		String[][]array2 = {{"Dawn - ", "Troy - ", "Bess - "},{" wine - red ", " beer - blue ", "soda - purple"}};
		
		
		System.out.println(array2[0][0] + array2[1][0]);
		System.out.println(array2[0][1] + array2[1][1]);
		System.out.println(array2[0][2] + array2[1][2]);
		
		
		
//		try{
//			System.out.println("Please enter a number");
//			int userInput = scanner.nextInt();]
//			System.out.println("userInput/0");
//		   }
//		catch(Exception e){
//			System.out.println("Error");
//		   }
		
	}
}

