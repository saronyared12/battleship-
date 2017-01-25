public class Ship{
  
  //properties
  private int x1;
  private int y1;
  private int x2;
  private int y2;
  
  //constructor - loaded 
  public Ship(int newX1, int newY1, int newX2, int newY2){
    x1 = newX1;
    y1 = newY1;
    x2 = newX2;
    y2 = newY2;
    
  }
  
  //getters and setters
  public int getX1(){
    return x1;
  }
  
  public void setX1(int newX1){
    x1 = newX1;
  }
  
  public int getY1(){
     return y1;
  }
  
  public void setY1(int newY1){
    
    y1 = newY1;
  }
  
  public int getX2(){
      return x2;
    
  }
  public void setX2(int newX2){
   
    x2 = newX2;
  }
  
  public int getY2(){
   
    return y2;
  }
  
  public void setY2(int newY2){
    y2 = newY2;
  }
  
  //toString method - output for your object
  public String toString(){
    return "(" + x1 + ", " + y1 + ")  (" + x2 + ", " + y2 + ")";
  }
  
}