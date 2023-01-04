
class Car{
	
	void make()
	
	{
	System.out.println("There are more than 100 manfactureres of cars today in the market");	
		
	}
}
class Mahindra extends Car{
	void type()
	{
		System.out.println("Mahindra is one of the leading automobile company in India");
	}
	
}

class Xuv_700 extends Mahindra{
	void model()
	{
		
	
	System.out.println("XUV700 is the first auto self drive car launched in India");
	
	}
	
	
}

public class Multi_level_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xuv_700 Xuv = new Xuv_700();
		Xuv.make();
		Xuv.type();
		Xuv.model();
	}

}