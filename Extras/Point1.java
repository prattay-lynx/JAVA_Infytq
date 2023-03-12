import java.lang.Math;
class Point {
    //Implement your code here
    private double xCoordinate;
    private double yCoordinate;
    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    public double calculateDistance()
    {
        double distance;
        distance = Math.sqrt(Math.pow((xCoordinate-0.0),2.0) + Math.pow((yCoordinate-0.0),2.0));
        return Math.round(distance*100.0)/100.0;
    }
    public double calculateDistance(Point point)
    {
        double distance;
        distance = Math.sqrt(Math.pow((xCoordinate-point.xCoordinate),2.0) + Math.pow((yCoordinate-point.yCoordinate),2.0));
        return Math.round(distance*100.0)/100.0;
    }
    public double getxCoordinate() {
        return xCoordinate;
    }
    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }
    public double getyCoordinate() {
        return yCoordinate;
    }
    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}


class Point1 {

	public static void main(String[] args) {
		Point point1 = new Point(3.5, 1.5);
        Point point2 = new Point(6, 4);
                                
        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));
        
        //Create more objects for testing your code                

	}
}