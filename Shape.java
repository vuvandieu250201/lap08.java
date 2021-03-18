package dahinh;

public class Shape /*hinh dang*/ {
  private String color;
  //constructor
  public Shape(String color){
     this.color = color;
  }
  public String toString(){
    return "Shape[color="+ color +"]";
  }
  public double getArea(){
    System.err.println("Shape unknown ! Cannot compute area!");
    return 0;
  }
}
