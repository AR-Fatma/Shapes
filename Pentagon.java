public class Pentagon implements Shape{
	private double centerx;
	private double centery;
	private double sidelength;

	public Pentagon (double centerx, double centery,double sidelength){
		this.centerx= centerx;
		this.centery= centery;
		this.sidelength= sidelength;
	}
	public double getArea(){
		return (Math.sqrt(25+10*Math.sqrt(5))/4)*sidelength*sidelength;
	}
	public double getPerimeter(){
		return 5*sidelength;
	}
	public void setParameters(double... parameters) {
		if (parameters.length == 1) {
			centerx = parameters[0];
			sidelength = (2 * Math.PI * parameters[0]) / 5;
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