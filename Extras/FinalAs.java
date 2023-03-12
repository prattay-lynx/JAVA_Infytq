class Circle{
    //Implement your code here
    private final double PI = 3.14;
    private double diameter;
    private double circumference;
    private double area;

    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public double getCircumference() {
        return circumference;
    }
    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPI() {
        return PI;
    }
    
    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public void calculateCircumference()
    {
        this.circumference=2*this.PI*(this.diameter/2);
    }
    public void calculateArea()
    {
        this.area=this.PI*Math.pow(diameter/2,2);
    }
    
}

class FinalAs{
      
    public static void main(String[] args) {
            
        Circle circle1 = new Circle(10.2);
        Circle circle2 = new Circle(5.7);

        //Create more objects of Circle class and add to the array given below for testing your code    
        Circle[] circles = {circle1, circle2};
            
        for (Circle circle : circles) {
                  
            circle.calculateCircumference();
            circle.calculateArea();
                  
            System.out.println("Diameter of the circle is "+circle.getDiameter());
            System.out.println("Circumference of the circle is " + Math.round(circle.getCircumference()*100)/100.0);
            System.out.println("Area of the circle is " + Math.round(circle.getArea()*100)/100.0);
            System.out.println();
        }           
    }
}

