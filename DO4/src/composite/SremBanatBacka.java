package composite;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import mvc.Shape;

public class SremBanatBacka extends Shape{
	
	List<Shape> sbb = new ArrayList<Shape>();
	
	public void add(Shape s) {
		sbb.add(s);
	}
	
	public void remove(Shape s) {
		sbb.remove(s);
	}

	@Override
	public void draw(Graphics g) {
		ListIterator<Shape> it = sbb.listIterator();
		while(it.hasNext()) {
			it.next().draw(g);
		}
		
	}

}
