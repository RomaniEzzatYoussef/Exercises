package chapter10;

/**
 *
 * 21/04/2019   4:02:03 PM
 *  
 * @author Romani Ezzat
 *
 *
 * MyRectangle2D
 *
 */
public class MyRectangle2D 
{
	private double x, y, width, height;

	public MyRectangle2D()
	{
		this(0, 0, 1, 1);
	}
	
	public MyRectangle2D(double x, double y, double width, double height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public double getArea()
	{
		return width * height;
	}
	
	public double getPerimeter()
	{
		return (width * 2) + (height * 2); 
	}
	
	public boolean contains(double x, double y)
	{
		return (width > 0 && 
				height > 0 && 
				x > getX() && 
				x < (getX() + width) && 
				y >= getY() && 
				y < (getY() + height));
	}
	
	public boolean contains(MyRectangle2D r)
	{
		return (width > 0 && 
				height > 0 && 
				r.getX() > x && 
				r.getX() < (x + width) && 
				r.getY() >= y && 
				r.getY() < (y + height));
	}
	
	public boolean overlaps(MyRectangle2D r)
	{
		return 	(x < r.x + r.width) && 
				(x + width > r.x) && 
				(y < r.y + r.height) && 
				(y + height > r.y);
	}
	
	public static MyRectangle2D getRectangle(double[][] points) 
	{
		double minX = Double.MAX_VALUE;
		double maxX = -Double.MAX_VALUE;
		double minY = Double.MAX_VALUE;
		double maxY = -Double.MAX_VALUE;
		
		for (int i = 0; i < points.length; i++) 
		{
		    double x = points[i][0];
		    double y = points[i][1];
		    minX = Math.min(minX, x);
		    maxX = Math.max(maxX, x);
		    minY = Math.min(minY, y);
		    maxY = Math.max(maxY, y);    
		}

		double width = maxX - minX;
		double height = maxY - minY;
		
		double centerX = ((maxX + minX) / 2); 
		double centerY = ((maxY + minY) / 2);
		
		return new MyRectangle2D(centerX, centerY, width, height);
	}

	
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}
	
}
