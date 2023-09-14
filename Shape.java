public interface Shape{
	double getArea();
	double getPerimeter();
	void setParameters(double...parameters);
	void move (double offsetX,double offsetY);
	double getCenterx();
    double getCentery();
}