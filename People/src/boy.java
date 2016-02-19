
public class boy extends people{
	
	public String favDrink = "Beer";
	public void playWith(){
		System.out.println("Yeah " + favDrink);
	}

	public void cook(){
		System.out.println(this.getName() + " orders pizza alot!! ");
	}
	
	public String getfavDrink(){
		return this.favDrink;
	}

	public boy(){
		
	}

	public boy(String name,String favColor, String favDrink){
		super(name, favColor);
		this.favDrink = favDrink;
		
	}
	

}





