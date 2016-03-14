package prob6;

public class RectTriangle extends Shape {
	double width;
	double height;

	public RectTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	double getAtrea() {
		return width*height/2;
	}

	@Override
	double getPerimeter() {
		return width+height+Math.sqrt(width*width+height*height);
	}
	

}
