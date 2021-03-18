package dahinh;
  //hinh chu nhat
public class Rectangle  extends Shape {
  private int length, width;
  //constructor// public
  public Rectangle(String color, int length, int width) {
    super(color);
    this.length = length;
    this.width = width;
  }
  @Override
  public String toString(){
    return "Rectangle[ length=" + length +","+ width + "," +super.toString() +"]";
  }
  public double getArea(){
    return length*width;
  }
}
