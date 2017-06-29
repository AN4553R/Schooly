package mathschool;

public abstract class Shape implements Comparable
{
        String arealaw;
	String perimeterlaw;
	public abstract double getArea();
	public abstract double getPerimeter();
        public abstract String getShapeName();
        public int compareTo(Object arg)
        {
            if(getArea()>((Shape)arg).getArea())
                return 1;
            else if(getArea()<((Shape)arg).getArea())
                return -1;
            else return 0;
        }
}