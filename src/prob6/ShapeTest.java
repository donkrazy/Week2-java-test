package prob6;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		Shape o1 = new Rectangle(5, 6);
		Shape o2 = new RectTriangle(6, 2);
		ArrayList<Shape> list = new ArrayList<Shape>();
		list.add(o1);
		list.add(o2);
		for(int i=0; i<list.size(); i++){
			Shape shape = list.get(i);
			System.out.println("area: " + shape.getAtrea());
			System.out.println("perimeter: " + shape.getPerimeter());
			if(shape instanceof Resizable){
				((Resizable) shape).resize(0.5);
				System.out.println("new area: " + shape.getAtrea());
				System.out.println("new perimeter: " + list.get(i).getPerimeter());
			}
		}
	}

}
