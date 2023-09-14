public class Square implements Shape{
	private double centerx;
	private double centery;
	private double sidelength;

	public Square (double centerx, double centery,double sidelength){
		this.centerx= centerx;
		this.centery= centery;
		this.sidelength= sidelength;
	}
	public double getArea(){
		return sidelength*sidelength;
	}
	public double getPerimeter(){
		return 4*sidelength;
	}
	public void setParameters(double...parameters){
		if (parameters.length==3){
			centerx= parameters[0];
			centery= parameters[1];
			sidelength= parameters[2];
		}
	}
	public void move (double offsetX,double offsetY){
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