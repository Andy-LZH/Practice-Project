package Project;

public class Rectangle {// should not contain main method - error 1


private double length = 0;
private double width = 0;

public Rectangle(double length, double width){
  this.length = length;
  this.width = width;


  }
  public double getWidth(){
  return width;
  }

  public double getLength(){
  return length;
  }

  public double getArea(){
  return width * length;
  }




  }

