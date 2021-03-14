package week2;
import java.awt.*;
import java.applet.*;
public class Circle {
	protected Color color;
	protected int diameter;
	public Circle(int diameter, Color color) {
		this.diameter = diameter;
//		this.setColor(color);
	}
	public Circle(int diameter) {
		this.diameter = diameter;
//		this.setColor(Color.blue);
	}
}
