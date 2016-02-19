
public class people {
private String name = "Clancy";
private String favColor = "Pink";


protected void changeName(String newName){
	this.name = newName;
}
protected String getName(){
	return this.name;
}

protected String getfavColor(){
	//System.out.println(favColor + " is a nice color ");
	return this.favColor;
}
public void cook(){
	System.out.println(this.name + " likes to cook ");///override method
}

public people(){
	
}

public people(String name,String favColor){
	this.changeName(name);
	this.favColor = favColor;
	
}

}
