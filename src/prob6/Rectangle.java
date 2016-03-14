package prob6;

public class Rectangle extends Shape implements Resizable{
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	double getAtrea() {
		return width*height;
	}

	@Override
	double getPerimeter() {
		return 2*(width+height);
	}
	
	@Override
	public void resize(double s) {
		width = s*width;
		height = s*height;
	}

}
