package Project;

public class Cuboid extends Rectangle {/*
 remember super is used to modify Rectangle, should typed after subclass's constructor.
 */

  private double height = 0;


  public Cuboid(double height, double width, double length){
    super(width, length);
    this.height = height;


  }

  public double getHeight(){

    return height;
  }

  public double getVolume(){

    return height * super.getLength() * super.getWidth();
  }

  public static void main(String[] args) {

    Cuboid swimPool = new Cuboid(2,3,4);
    System.out.println(swimPool.getLength());
    System.out.println(swimPool.getHeight());
    System.out.println(swimPool.getVolume());
    System.out.println(swimPool.getArea());
  }
}
