package ch07;

public class Triangle {
	float bottom;
	float height;
	
	public float getArea() {
		return bottom * height /2;
	}
	
	public void setBottom(float b) {
		bottom = b;
	}
	public void setHeight(float h) {
		height = h;
	}

	public float getBottom() {
		return bottom;
	}

	public float getHeight() {
		return height;
	}
}
