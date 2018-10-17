package cap08;

public class Rectangle {
	private float length;
	private float width;
	
	public Rectangle() {
		this.length = 0.0f;
		this.width = 0.0f;
	}

	public float calcPerimeter() {
		return ( this.getLength() + this.getWidth() ) * 2;
	}
	
	public float calcArea() {
		return ( this.getLength() * this.getWidth() );
	}
	
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = 0.0f;
		
		if(length > 0.0f && length < 20.0f)
			this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = 0.0f;
		
		if(width > 0.0f && width < 20.0f)
			this.width = width;
	}
	
	
}
