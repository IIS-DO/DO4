package command;

import mvc.DrawingModel;
import mvc.Point;

public class CmdPointRemove implements Command{
	private Point point;
	private DrawingModel model;
	
	public CmdPointRemove(Point point, DrawingModel model) {
		this.point = point;
		this.model = model;
	}
	
	@Override
	public void execute() {
		model.remove(point);
		
	}
	@Override
	public void unexecute() {
		model.add(point);
		
	}
}
