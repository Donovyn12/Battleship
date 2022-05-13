import java.util.Scanner;
public class Printing {
    
    private Scanner input = new Scanner(System.in);
    private Computer comp = new Computer();
        
        
    public void combatTurn(){
            //Big while loop, runs until someone wins
        while(comp.checkPlayerWin() == false && comp.checkCompWin() == false){
                //Get Coordinates for player shooting
            System.out.println("Enter the row you would like to shoot at.");
            int row = input.nextInt();
            System.out.println("Enter the column you would like to shoot at.");
            int col = input.nextInt();
                //Check if player shot is valid
            boolean missileLaunched = comp.playerShoot(row, col);
                //retry if coordinates don't fit the board
            while(missileLaunched == false){
                System.out.println("That is an invalid coordinate. Please try again.");
                System.out.println("Enter the row you would like to shoot at.");
                row = input.nextInt();
                System.out.println("Enter the column you would like to shoot at.");
                col = input.nextInt();
                missileLaunched = comp.playerShoot(row, col);
            }
                //Show the player's shooting board
            System.out.println("YOUR SHOTS");
            comp.printPlayerShootBoard();
                //Boolean for while loop
            boolean check = false;
                //Computer Shoots
            while(check == false){
                check = comp.compShoot();
            }
                //Print Player's ship board with computer's shots
            System.out.println("YOUR SHIPS");
            comp.printPlayerShipBoard();
        }
    }
    
    public void printPlayerPlaceShips(){
            //create variables
        int ships = comp.getPlayerShipNum();
        int count = 1;
        int size = 0;
            //continue until 5 ships have been placed
        while(ships != 5){
                //print player ship board
            comp.printPlayerShipBoard();
                //Change size of ship based on how many ships have been placed
            if(count == 1){
                size = 2;
                System.out.println("You are placing a boat that takes 2 spaces.");
            }
            else if(count == 2 || count == 3){
                size = 3;
                System.out.println("You are placing a boat that takes 3 spaces.");
            }
            else if(count == 4){
                size = 4;
                System.out.println("You are placing a boat that takes 4 spaces.");
            }
            else{
                size = 5;
                System.out.println("You are placing a boat that takes 5 spaces.");
            }
                //get coordinates for ship placement
            System.out.println("which row (1-10)");
            int row = input.nextInt();
            System.out.println("which col (1-10)");
            int col = input.nextInt();
            input.nextLine();
            System.out.println("which direction (down, up, right, left)");
            String dir = input.nextLine();
            System.out.println();
                //Place Ship, increase variables
            if(comp.placePlayerShip(row, col, dir, size) == true){
                ships += 1;
                count += 1;
            }
            
            
            
        }
            //print board with ships
        comp.printPlayerShipBoard();
    }
    
    public void placeCompShips(){
            //Number of ships
        int ships = comp.getCompShipNum();
            //Determine Size of current ship by number of ships placed
        int count = 1;
            //Set size of current ship
        int size = 0;
            
            //Continue until all ships are placed
        while(ships != 5){
                //Set ship size by number of ships
            if(count == 1){
                size = 2;
            }
            else if(count == 2 || count == 3){
                size = 3;
            }
            else if(count == 4){
                size = 4;
            }
            else{
                size = 5;
            }
            
                //Place Ship
            if(comp.placeCompShip(size) == true){
                    //Increase number of ships
                ships += 1;
                count += 1;
            }
        }
    }
    
}