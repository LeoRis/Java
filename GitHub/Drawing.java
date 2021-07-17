package GitHub;

public class Drawing implements Cloneable {
	private String _geomFigure;
	private String _color;
	private double _height;
	private double _width;
	
	public Drawing() {}
	public Drawing(String figure, String color, double height, double width) {
		_geomFigure = figure;
		_color = color;
		_height = height;
		_width = width;
	}
	
	@Override
	
	public Object clone() {
		try {
			Drawing cloned = (Drawing)super.clone();
			cloned._color = _color;
			cloned._geomFigure = _geomFigure;
			return cloned;
		}catch(CloneNotSupportedException e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void setGeoFigure(String figure) {
		_geomFigure = figure;
	}
	
	public String getGeoFigure() {
		return this._geomFigure;
	}
	
	public void setColor(String color) {
		_color = color;
	}
	
	public String getColor() {
		return this._color;
	}
	
	public void setHeight(double height) {
		_height = height;
	}
	
	public double getHeight() {
		return this._height;
	}
	
	public void setWidth(double width) {
		_width = width;
	}
	
	public double getWidth() {
		return this._width;
	}
	
	@Override
	
	public String toString() {
		return "Drawing { " + "Figure: " + this._geomFigure + " Color: " + this._color + " Height: " + this._height + " Width: " + this._width + " }";
	}
	
}