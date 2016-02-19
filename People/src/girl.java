
public class girl extends people{
	
	public String favDrink = "Wine";
	public void playWith(){
		
		System.out.println("Yeah " + favDrink);
	}
	
	public void cook(){
		System.out.println(this.getName() + " hates to cook ");
	}
	
	public String getfavDrink(){
		return this.favDrink;
	}
	
	public girl(){
		
	}
	
	public girl(String name,String favColor, String favDrink){
		super(name, favColor);
		this.favDrink = favDrink;
		
	}
	
	
	

}
