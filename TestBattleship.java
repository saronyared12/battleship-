public class TestBattleship{
  
  public static void main(String[] args){
    Player player = new Player(false);
    
    Battleship board = new Battleship();
    
     System.out.println(player);
  board.printBoard();
    
   
    
      int x1 = player.getShips().getX1(); 
      int y1 = player.getShips().getY1();
      int x2 = player.getShips().getX2();
      int y2 = player.getShips().getY2();
    
    board.placeShip(x1, y1);
    board.placeShip(x2, y2);
    board.printBoard();
        
        board.printBoard();
   
  }
}