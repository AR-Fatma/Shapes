public class Circle implements Shape{
	private double centerx;
	private double centery;
	private double radius;

	public Circle (double centerx, double centery,double radius){
		this.centerx= centerx;
		this.centery= centery;
		this.radius= radius;
	}
	public double getArea(){
		return Math.PI*radius*radius;
	}
	public double getPerimeter(){
		return 2*Math.PI*radius;
	}
	public void setParameters(double...parameters){
		if (parameters.length==3){
			centerx= parameters[0];
			centery= parameters[1];
			radius= parameters[2];
		}
	}
	public void move(double offsetX, double offsetY){
		centerx+=offsetX;
		centery+=offsetY;
	}
	 public double getCenterx() {
        return centerx;
    }

    public double getCentery() {
        return centery;
    }
}