package MyObject;

public class Shape {
	private int shapeId;
	private String shapeName;
	private Color color;
	public int getShapeId() {
		return shapeId;
	}
	public void setShapeId(int shapeId) {
		this.shapeId = shapeId;
	}
	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Shape [shapeId=" + shapeId + ", shapeName=" + shapeName + ", color=" + color + "]";
	}

}
