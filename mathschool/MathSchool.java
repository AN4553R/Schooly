package mathschool;
import java.util.*;
import java.io.*;
public class MathSchool {
static Scanner input =new Scanner(System.in);
    public static void main(String[] args) 
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Hello in Math School Applecation @_@");
        System.out.println
(" __   __  _______  _______  __   __    _______  _______  _______    _______  _______  __   __  _______  _______  ___     \n" +
 "|  |_|  ||   _   ||       ||  | |  |  |   _   ||       ||       |  |       ||       ||  | |  ||       ||       ||   |    \n" +
 "|       ||  |_|  ||_     _||  |_|  |  |  |_|  ||    _  ||    _  |  |  _____||       ||  |_|  ||   _   ||   _   ||   |    \n" +
 "|       ||       |  |   |  |       |  |       ||   |_| ||   |_| |  | |_____ |       ||       ||  | |  ||  | |  ||   |    \n" +
 "|       ||       |  |   |  |       |  |       ||    ___||    ___|  |_____  ||      _||       ||  |_|  ||  |_|  ||   |___ \n" +
 "| ||_|| ||   _   |  |   |  |   _   |  |   _   ||   |    |   |       _____| ||     |_ |   _   ||       ||       ||       |\n" +
 "|_|   |_||__| |__|  |___|  |__| |__|  |__| |__||___|    |___|      |_______||_______||__| |__||_______||_______||_______|\n" +
 "");
        ShowMenu();
    }
public static void ShowMenu()
{
                System.out.println("Choose a shape to get excersises , or 0 to Exit...");
                System.out.println("1- Circle");
		System.out.println("2- Rectangle");
		System.out.println("3- Triangle");
		System.out.println("4- Cylinder");
		System.out.println("5- Cube");
                System.out.println("6- Use File");
		System.out.println("0 to exit");
		try {
                    int in=input.nextInt();
                    System.out.println("Your input: "+in);
		    switch(in){
                        case 1: Circle(); break;
                        case 2: Rectangle(); break;
                        case 3: Triangle(); break;
                        case 4: Cylinder(); break;
                        case 5: Cube(); break;
                        case 6:Fill();break;
                        case 0:{System.out.println("ـــــــــــــــــــــــــــــــ\n"
                                                 + " Thanks , for your time ..! :) \n"
                                                 + "ـــــــــــــــــــــــــــــــ\n"); System.exit(0);}
                        default: {System.out.println("Please enter a valid choice"); ShowMenu();}
		   }
                }
                catch(Exception ex)
                {
                    System.out.println("\n\nEnter a correct choise ,,\n\n");
                    input=new Scanner(System.in);ShowMenu();
                }
                
	}

   public static void Circle()
    {
        double radius=(int)(Math.random()*10000)/100.0;
        Shape c=new Circle(radius);
        System.out.println(c.toString());
        System.out.println("Choose Excercise, or press 0 to return main menu..");
                System.out.println("1- Circle's Area");
		System.out.println("2- Circle's Perimeter");
                int test =input.nextInt();
                int choise = -1;
        switch(test)
        {
            case 1:choise =1;break;
            case 2 : choise =2;break;
           case 0:ShowMenu();
		default: {System.out.println("Please enter a valid choice"); Circle();}
        }
        if(choise ==1)
            {
                System.out.println("Calculate the area of the circle with radius= "+radius+" or press -1 to return main menu");
                double user=input.nextDouble();
                if(user==-1)
                ShowMenu();
               
                double area=c.getArea();
                if(Math.abs(user-area)>0.01)
                {
                  System.out.println("Wrong answer ..! ,your answer = "+user+",, the true answer = "+area);
                  System.out.println("review the area law again ...");
                  Circle();
                }
                else {System.out.println("\nWelldone ..! \n");Circle();}
            }
        else
        {
          System.out.println("Calculate the perimeter of the circle with radius= "+radius+" or press -1 to return main menu");
                double user=input.nextDouble();
                if(user==-1)
                ShowMenu();
                double per=c.getPerimeter();
                if(Math.abs(user-per)>0.01)
                {
                  System.out.println("Wrong answer ..! ,your answer = "+user+",, the true answer = "+per);
                  System.out.println("review the perimeter law again ...");
                  Circle();
                }
                else {System.out.println("\nWelldone ..! \n");Circle();}   
        }
    }

    private static void Rectangle()
    {
        double s1=(int)(Math.random()*10000)/100.0;
        double s2=(int)(Math.random()*10000)/100.0;
        Shape rect=new Rectangle(s1,s2);
        System.out.println(rect.toString());
        System.out.println("Choose Excercise, or press 0 to return main menu..");
                System.out.println("1- Rectangle's Area");
		System.out.println("2- Rectangle's Perimeter");
                int test =input.nextInt();
                int choise = -1;
        switch(test)
        {
            case 1:choise =1;break;
            case 2 : choise =2;break;
           case 0:ShowMenu();
		default: {System.out.println("Please enter a valid choice"); Rectangle();}
        }
        if(choise ==1)
            {
                System.out.println("Calculate the area of the rectangle with sides s1= "+s1+", s2= "+s2+" or press -1 to return main menu");
                double user=input.nextDouble();
                if(user==-1)
                ShowMenu();
           
                double area=rect.getArea();
                if(Math.abs(user-area)>0.01)
                {
                  System.out.println("\nWrong answer ..! ,your answer = "+user+",, the true answer = "+area);
                  System.out.println("review the area law again ...\n");
                  Rectangle();
                }
                else {System.out.println("\nWelldone ..! \n");Rectangle();}
            }
        else
        {
          System.out.println("Calculate the perimeter of the rectangle with sides s1= "+s1+", s2= "+s2+" or press -1 to return main menu");
                double user=input.nextDouble();
                if(user==-1)
                ShowMenu();
                double per=rect.getPerimeter();
                if(Math.abs(user-per)>0.01)
                {
                  System.out.println("\nWrong answer ..! ,your answer = "+user+",, the true answer = "+per);
                  System.out.println("review the perimeter law again ...\n");
                  Rectangle();
                }
                else {System.out.println("\nWelldone ..! \n");Rectangle();}   
        }
    }
    private static void Triangle() {
        
        double s1=(int)(Math.random()*10000)/100.0;
        double s2=(int)(Math.random()*10000)/100.0;
        double s3=(int)(Math.random()*10000)/100.0;
        while(s1+s2<=s3||s2+s3<=s1||s1+s3<=s2)
        {
         s1=(int)(Math.random()*10000)/100.0;
         s2=(int)(Math.random()*10000)/100.0;
         s3=(int)(Math.random()*10000)/100.0;
        }
        Shape tr=new Triangle(s1,s2,s3);
        System.out.println(tr.toString());
        System.out.println("Choose Excercise, or press 0 to return main menu..");
                System.out.println("1- Triangle's Area");
		System.out.println("2- Triangle's Perimeter");
                int test =input.nextInt();
                int choise = -1;
        switch(test)
        {
            case 1:choise =1;break;
            case 2 : choise =2;break;
            case 0:ShowMenu();
	    default: {System.out.println("Please enter a valid choice"); Triangle();}
        }
        if(choise ==1)
            {
                System.out.println("Calculate the area of the Triangle with sides s1= "+s1+" ,s2="+s2+" ,s3="+s3+" or press -1 to return main menu");
                double user=input.nextDouble();
                if(user==-1)
                ShowMenu();           
                double area=tr.getArea();
                if(Math.abs(user-area)>0.01)
                {
                  System.out.println("Wrong answer ..! ,your answer = "+user+",, the true answer = "+area);
                  System.out.println("review the area law again ...\n");
                  Triangle();
                }
                else {System.out.println("\nWelldone ..! \n");Triangle();}
            }
        else
        {
          System.out.println("Calculate the perimeter of the circle with sides s1= "+s1+" ,s2="+s2+" ,s3="+s3+" or press -1 to return main menu");
                double user=input.nextDouble();
                if(user==-1)
                ShowMenu();
                double per=tr.getPerimeter();
                if(Math.abs(user-per)>0.01)
                {
                  System.out.println("\nWrong answer ..! ,your answer = "+user+",, the true answer = "+per);
                  System.out.println("review the perimeter law again ...\n");
                  Triangle();
                }
                else {System.out.println("\nWelldone ..! \n");Triangle();}   
        }
    }

    private static void Cube() {
       double s=(int)(Math.random()*10000)/100.0;
        Cube cub=new Cube(s);
        System.out.println(cub.toString());
        System.out.println("Choose Excercise, or press 0 to return main menu..");
                System.out.println("1- Cube's Area");
		System.out.println("2- Cube's Volume");
                int test =input.nextInt();
                int choise = -1;
        switch(test)
        {
            case 1:choise =1;break;
            case 2 : choise =2;break;
            case 0:ShowMenu();
	    default: {System.out.println("\nPlease enter a valid choice\n"); Cube();}
        }
        if(choise ==1)
            {
                System.out.println("Calculate the area of the Cube with side = "+s+" ,or press -1 to return main menu");
                double user=input.nextDouble();
                if(user==-1)
                ShowMenu();
        
                double area=cub.getArea();
                if(Math.abs(user-area)>0.01)
                {
                  System.out.println("\nWrong answer ..! ,your answer = "+user+",, the true answer = "+area);
                  System.out.println("review the area law again ...\n");
                  Cube();
                }
                else {System.out.println("\nWelldone ..! \n");Cube();}
            }
        else
        {
          System.out.println("Calculate the Volume of the Cube with side = "+s+" ,or press -1 to return main menu");
                double user=input.nextDouble();
                if(user==-1)
                ShowMenu();
                double vol=cub.getVolume();
                if(Math.abs(user-vol)>0.01)
                {
                  System.out.println("\nWrong answer ..! ,your answer = "+user+",, the true answer = "+vol);
                  System.out.println("review the perimeter law again ...\n");
                  Cube();
                }
                else {System.out.println("\nWelldone ..! \n");Cube();}   
        }
    }

    private static void Cylinder() {
        double radius=(int)(Math.random()*10000)/100.0;
        double height=(int)(Math.random()*10000)/100.0;
        Cylinder cndr=new Cylinder(radius,height);
        System.out.println(cndr.toString());
        System.out.println("Choose Excercise, or press 0 to return main menu..");
                System.out.println("1- Cylinder's Area");
		System.out.println("2- Cylinder's Volume");
                int test =input.nextInt();
                int choise = -1;
        switch(test)
        {
            case 1:choise =1;break;
            case 2: choise =2;break;
           case 0:ShowMenu();
		default: {System.out.println("Please enter a valid choice"); Circle();}
        }
        if(choise ==1)
            {
                System.out.println("Calculate the area of the cylinder with radius= "+radius+" and height= "+height+" ,or press -1 to return main menu");
                double user=input.nextDouble();
                if(user==-1)
                ShowMenu();
               
                double sidearea=cndr.getArea();
                if(Math.abs(user-sidearea)>0.01)
                {
                  System.out.println("\nWrong answer ..! ,your answer = "+user+",, the true answer = "+sidearea);
                  System.out.println("review the area law again ...\n");
                  Cylinder();
                }
                else {System.out.println("\nWelldone ..! \n");Cylinder();}
            }
        else
        {
                System.out.println("Calculate the volume of the cylinder with radius= "+radius+" and height= "+height+" ,or press -1 to return main menu");
                double user=input.nextDouble();
                if(user==-1)
                ShowMenu();
                double per=cndr.getVolume();
                if(Math.abs(user-per)>0.01)
                {
                  System.out.println("\nWrong answer ..! ,your answer = "+user+",, the true answer = "+per);
                  System.out.println("review the perimeter law again ...\n");
                  Circle();
                }
                else {System.out.println("\nWelldone ..! \n");Circle();}   
        }
        
    }

     private static void Fill() {
       try
       {
           Scanner cin=new Scanner(new File("input.txt"));
    
           Shape[]shapes=new Shape[5];
           shapes[0]=new Rectangle(cin.nextDouble(),cin.nextDouble());
           shapes[1]=new Circle(cin.nextDouble());
           shapes[2]=new Triangle(cin.nextDouble(),cin.nextDouble(),cin.nextDouble());
           shapes[3]=new Cube(cin.nextDouble());
           shapes[4]=new Cylinder(cin.nextDouble(),cin.nextDouble());
           Arrays.sort(shapes);
           PrintWriter prnt=new PrintWriter("output.txt");
           for(int i=0;i<5;i++)
           {
               prnt.println(shapes[i].getShapeName()+ "  "+shapes[i].getArea());
           }
           prnt.close();
           
           AfterFile();
       }
       catch(FileNotFoundException ex)
       {
           System.out.println("\nFile Not Found ...!");
       }
    }
     private static void AfterFile()
     {
          System.out.println("\nCongrats :)"+"\nPress 1 to return main menu , or 0 to exit");
         int x=input.nextInt();
          switch(x)
           {
               case 1:ShowMenu();
               case 0:{System.out.println("ـــــــــــــــــــــــــــــــ\n"
                                        + " Thanks , for your time ..! :) \n"
                                        + "ـــــــــــــــــــــــــــــــ\n"); System.exit(0);}
               default:{System.out.println("\nEnter a correct choice\n");AfterFile();}
           }
     }
   }