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
  public int getx1(){
    return x1;
  }
  
  public void setx1(int newx1){
    x1 = newx1;
  }
  
  public int gety1(){
     return y1;
  }
  
  public void sety1(int newy1){
    
    y1 = newy1;
  }
  
  public int getx2(){
      return x2;
    
  }
  public void setx2(int newx2){
   
    x2 = newx2;
  }
  
  public int gety2(){
   
    return y2;
  }                                                             
  
  public void sety2(int newy2){
    y2 = newy2;
  }
  
  //toString method - output for your object
  public String toString(){
    return "(" + x1 + ", " + y1 + ")  (" + x2 + ", " + y2 + ")";
  }
  
}