// parent class
class Animal {
	
	//parent property
	String name ;
	String color;
	String food;
	String natureOfLiving;
	int noOfLegs;
	
}
//first child class
class Carnivorous extends Animal{
	//child property 
	String strength;
	String Hunting; 
	
	void display(){
		System.out.println(name + " " + color + " "+ food +" "+ natureOfLiving +" "+ noOfLegs); //parent property
		System.out.println(strength + " "+ Hunting); //child property
	}
	
}
//second child class
class Herbivores extends Animal {
	//child property
	String grazing;
	String hunt;
	
	
	void display(){
		System.out.println(name + " " + color + " "+ food +" "+ natureOfLiving +" "+ noOfLegs); //parent property
		System.out.println(grazing + " "+ hunt); //child property
	}
}

// main class
class inhertianceEg1{

	//entry point
	public static void main(String args[]){
		//Creating object of Canrnivorous class
		Carnivorous c = new Carnivorous();
		//Assigning values
		c.name = "Lion";
		c.color = "Yellow";
		c.food = "meat";
		c.natureOfLiving = "wild";
		c.noOfLegs = 4;
		c.Hunting = "Attack";
		c.strength = "High";
		c.display(); //calling method

		//Creating object of herbivorous class
		Herbivores h = new Herbivores();
		//Assigning values
		h.name = "Deer";
		h.color = "Brown";
		h.food = "Grass";
		h.natureOfLiving = "wild";
		h.noOfLegs = 4;
		h.grazing = "grass";
		h.hunt = "No";

		h.display(); //calling method
	}
}