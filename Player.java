//import java.util.List;
public class Player{

  private boolean win; 
  private Ship ship;
  
  public Player(){
   
  }
  public Player(boolean newWin){
   
    win = newWin;
    
    int x1 = getRandomNumber(5,0);
    int y1 = getRandomNumber(10,0);
    int x2 = getRandomNumber(5,0);
    int y2 = getRandomNumber(10,0);
    
    ship= new Ship( x1,y1,x2,y2);
   
  }
  
  
  public int getRandomNumber( int max, int min){
    
  //for x the range formula is (max - min) + 1
   
    int rangeX = (max - min) + 1;
    
return (int) (Math.random() * rangeX) + min;
    
   
   
  }
   
  
  public boolean getWin(){
    return win;
  }
  public void setWin(boolean newWin){
    win = newWin;
  }
  public Ship getShips(){
    return ship;
  }
  public void setShips(Ship newShips){
    ship = newShips;
  }
 
  public String toString(){
    return win + " " + ship. toString(); 
  }

}
