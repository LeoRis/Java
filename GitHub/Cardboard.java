package GitHub;

import java.util.Date;

public class Cardboard implements Cloneable {
	private String _name;
	private Date _date;
	private Drawing _drawing;
	
	public Cardboard() {}
	public Cardboard(String name, Date date, Drawing drawing) {
		_name = name;
		_date = date;
		_drawing = drawing;
	}
	
	@Override
	
	public Object clone() throws CloneNotSupportedException{
		Cardboard cloned = (Cardboard)super.clone();
		cloned._name = _name;
		cloned._date = (Date)_date.clone();
		cloned._drawing = (Drawing)_drawing.clone();
		return cloned;
	}
	
	public void setName(String name) {
		_name = name;
	}
	
	public String getName() {
		return this._name;
	}
	
	public void setDate(Date date) {
		_date = date;
	}
	
	public Date getDate() {
		return this._date;
	}
	
	public void setDrawing(Drawing drawing) {
		_drawing = drawing;
	}
	
	public Drawing getDrawing() {
		return this._drawing;
	}
	
	public String toString() {
		return "Name: " + this._name + " Date: " + this._date + " Drawing: " + this._drawing; 
	}
	
}
