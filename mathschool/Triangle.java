package mathschool;

public class Triangle extends Shape {
    private double s1,s2,s3;
    public Triangle(double s1,double s2,double s3)
    {
        this .s1=s1; this.s2=s2; this.s3=s3;
    }
    @Override
    public double getArea()
    {
        double mid=getPerimeter()/2;
        return Math.sqrt(mid*(mid-s1)*(mid-s2)*(mid-s3));
    }
    @Override
    public double getPerimeter()
    {
        return (s1+s2+s3);
    }
     @Override
        public String toString()
        {
            arealaw="Triangle Area Law = the sqare root of(s*(s-side1)*(s-side2)*(s-side30, where s=perimeter/2))  ";
            perimeterlaw="Triangle perimeter Law = side1+side2+side3";
            return arealaw+" ^^^ "+this.perimeterlaw;
        }
        @Override
        public String getShapeName()
        {
            return "Triangle :";
        }
}
