package MyObject;

public class MainClass {

	public static void main(String[] args) {
	
//MyObjectClass obj= new MyObjectClass();
//Employee emp=obj.function();
//System.out.println(obj.function());
		
		Shape  shape= new Shape();
		
		MainClass obj= new MainClass();
	    Shape obj1=obj.shapeS();
	    System.out.println(obj1);
				

	}
	
	//bean ya pojo
	Color colorMethod() {				
		Color c= new Color();
		c.setColorId(23);
		c.setColorName("Red");
		return c;
	}
	
	//bean or pojo class
	Shape shapeS() {
//		Shape p= new Shape();
		MainClass c= new MainClass();
		Color cc=c.colorMethod();
		
		Shape shape = new Shape();
		shape.setShapeId(23);
		shape.setShapeName("Triangle");
		
		//Dependency Injection/ inversion ofd control
		//
		shape.setColor(cc);
		
		return shape;
	}

}
