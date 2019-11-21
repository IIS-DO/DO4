package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Line;
import mvc.Point;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10, Color.RED);
		DrawingModel model = new DrawingModel();
		
		CmdPointAdd c1 = new CmdPointAdd(p1, model);
		c1.execute();
		
		System.out.println(model.getShapes().size());
		
		c1.unexecute();
		
		System.out.println(model.getShapes().size());
		
		Point p2 = new Point(20, 20, Color.BLUE);
		
		CmdPointUpdate c2 = new CmdPointUpdate(p1, p2);
		c2.execute();
		
		System.out.println(p1);
		System.out.println(p2);
		
		c2.unexecute();
		
		Line lin1 = new Line(p1, p2, Color.RED);
		Line lin2 = new Line(p2, p1, Color.RED);
		
		CmdLineUpdate c3 = new CmdLineUpdate(lin1, lin2);
		
		c3.execute();
		
		System.out.println(lin1);
		System.out.println(lin2);
		
		p1.setX(30);
		
		c3.unexecute();
		
		System.out.println(lin1);
		System.out.println(lin2);
		

	}

}
