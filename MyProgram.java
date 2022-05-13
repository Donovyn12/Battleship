import java.util.Scanner;
public class MyProgram
{
    
    public static void main(String[] args)
    {
            //Create printing object
        Printing say = new Printing();
            //Place player ships
        say.printPlayerPlaceShips();
            //Place computer ships
        say.placeCompShips();
            //Start game, don't stop until winner is declared
        say.combatTurn();
        
        
    }
}