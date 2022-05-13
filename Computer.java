public class Computer {
    
        //Create Variables
    private int compships;
    private int playerHits;
    private int compHits;
        //Number of Ships created
    private int playerships;
        //player board for ships
    private String[][] playerShipBoard = {
        {"   ", "1 ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 "},
        {"1  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"2  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"3  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"4  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"5  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"6  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"7  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"8  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"9  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"10 ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "}
    };
        //Player board for shots
    private String[][] playerShootBoard = {
        {"   ", "1 ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 "},
        {"1  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"2  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"3  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"4  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"5  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"6  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"7  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"8  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"9  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"10 ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "}
    };
        //computer board for shots
    private String[][] compShootBoard = {
        {"   ", "1 ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 "},
        {"1  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"2  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"3  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"4  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"5  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"6  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"7  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"8  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"9  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"10 ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "}
    };
        //computer board for ships
    private String[][] compShipBoard = {
        {"   ", "1 ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 "},
        {"1  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"2  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"3  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"4  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"5  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"6  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"7  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"8  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"9  ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "},
        {"10 ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- ", "- "}
    };
    
        //check player shot against computer is valid
    public boolean checkPlayerShotValid(int row, int col){
        if(row > 0 && col > 0 && row < 11 && col < 11 && playerShootBoard[row][col].equals("- ")){
            return true;
        }
        return false;
    }
    
        //check computer shot against player is valid
    public boolean checkCompShotValid(int row, int col){
        if(row > 0 && col > 0 && row < 11 && col < 11 && compShootBoard[row][col].equals("- ")){
            return true;
        }
        return false;
    }
    
        //Player shot at computer & show on board
    public boolean playerShoot(int row, int col){
        if(checkPlayerShotValid(row, col) == true){
            if(compShipBoard[row][col].equals("Z ")){
                playerHits += 1;
                playerShootBoard[row][col] = "X ";
                return true;
            }
            else{
                playerShootBoard[row][col] = "O ";
                return true;
            }
        }
        else{
            return false;
        }
    }
    
        //Player shot at computer show on board
    public boolean compShoot(){
            //Create random numbers for coordinates
        int row = (int)(Math.random()*10 + 1);
        int col = (int)(Math.random()*10 + 1);
            //Check Shot is valid
        if(checkCompShotValid(row, col) == true){
                //Change Boards to show shot (hit/miss) 
            if(playerShipBoard[row][col].equals("Z ")){
                compHits += 1;
                compShootBoard[row][col] = "X ";
                playerShipBoard[row][col] = "X ";
                return true;
            }
            else{
                compShootBoard[row][col] = "O ";
                playerShipBoard[row][col] = "O ";
                return true;
            }
        }
        else{
            return false;
        }
    }
    
        //check if player wins
    public boolean checkPlayerWin(){
        if(playerHits >= 17){
            return true;
        }
        else{
            return false;
        }
    }
    
        //check if computer wins
    public boolean checkCompWin(){
        if(compHits >= 17){
            return true;
        }
        else{
            return false;
        }
    }
    
        //Print Computer Shooting board
    public void printCompShootBoard(){
        for(String[] col: compShootBoard){
            for(String row: col){
                System.out.print(row);
            }
            System.out.println();
        }
    }
    
        //Print Player Shooting Board
    public void printPlayerShootBoard(){
        for(String[] col: playerShootBoard){
            for(String row: col){
                System.out.print(row);
            }
            System.out.println();
        }
    }
    
        //print computer ship board
    public void printCompShipBoard(){
        for(String[] col: compShipBoard){
            for(String row: col){
                System.out.print(row);
            }
            System.out.println();
        }
    }
    
        //check if ship can be placed on Computer Board
    public boolean checkCompShipPlace(int row, int col, String direction, int shipspaces){
            //Create Variable to return at end
        boolean check = true;
            //Check if coordinates are in the grid
        if(row >= 10 || col >= 10 || row <= 1 || col <= 1){
            check = false;
        }
        else{
                //Check if first coordinate is empty
            if(compShipBoard[row][col].equals("- ")){
                    //Determine direction
                if(direction.equals("up")){
                    for(int i = 1; i < shipspaces; i++){
                            //Check each spot on boat if empty and on grid
                        if((row - i) <= 10 && (row - i) >= 1 && compShipBoard[row - i][col].equals("- ")){
                            check = true;
                        }
                        else{
                            check = false;
                            break;
                        }
                    }
                }
                else if(direction.equals("down")){
                    for(int i = 1; i < shipspaces; i++){
                        if((row + i) <= 10 && (row + i) >= 1 && compShipBoard[row + i][col].equals("- ")){
                            check = true;
                        }
                        else{
                            check = false;
                            break;
                        }
                    }
                }
                else if(direction.equals("right")){
                   for(int i = 1; i < shipspaces; i++){

                        if((col + i) <= 10 && (col + i) >= 1 && compShipBoard[row][col + i].equals("- ")){
                            check = true;
                        }
                        else{
                            check = false;
                            break;
                        }
                    } 
                }
                else if(direction.equals("left")){
                    for(int i = 1; i < shipspaces; i++){
                        if((col - i) <= 10 && (col - i) >= 1 && compShipBoard[row][col - i].equals("- ")){
                            check = true;
                        }
                        else{
                            check = false;
                            break;
                        }
                    }
                }    
            }
            else{
                check = false;
            }
            
        }
        return check;
    }
    
        //place Ship on Computer board
    public boolean placeCompShip(int shipSpaces){
            //Create random variables for placement and direction
        int row = (int)(Math.random()*10 + 1);
        int col = (int)(Math.random()*10 + 1);
        int dir = (int)(Math.random()*4 + 2);
        String direction = "";
            //Set string direction by random number
        if(dir == 1){
            direction = "up";
        }
        else if(dir == 2){
            direction = "down";
        }
        else if(dir == 3){
            direction = "left";
        }
        else{
            direction = "right";
        }
            //check if ship can be placed
        boolean check = checkCompShipPlace(row, col, direction, shipSpaces);
        if(check){
                //Place ship
            for(int i = 0; i < shipSpaces; i++){
                if(direction.equals("up")){
                    compShipBoard[row - i][col] = "Z ";
                }
                else if(direction.equals("down")){
                    compShipBoard[row + i][col] = "Z ";
                }
                else if(direction.equals("right")){
                    compShipBoard[row][col + i] = "Z ";
                }
                else{
                    compShipBoard[row][col - i] = "Z ";
                }
            }
                //Change number of computer ships
            compships += 1;
            return true;
        }
        else{
            return false;
        }
    }
    
        //print player ship board
    public void printPlayerShipBoard(){
        for(String[] col: playerShipBoard){
            for(String row: col){
                System.out.print(row);
            }
            System.out.println();
        }
    }
    
        //check if ship can be placed on Player Board
    public boolean checkShipPlace(int row, int col, String direction, int shipspaces){
            //if space = empty
        if(playerShipBoard[row][col].equals("Z ")){
            return false;
        }
            //Check if coordinates fit on board
        if(row < 11 && col < 11 && row > 0 && col > 0){
                //Check each spot by direction to make sure its still on the board and not overlapping
            if(direction.equals("up")){
                for(int i = 1; i < shipspaces; i++){
                    if(playerShipBoard[row - i][col].equals("Z ") || (row - 1) > 11 || (row - 1) < 0){
                        return false;
                    }
                }
            }
            else if(direction.equals("down")){
                for(int i = 1; i < shipspaces; i++){
                    if(playerShipBoard[row + i][col].equals("Z ") || (row + 1) > 11 || (row + 1) < 0){
                        return false;
                    }
                }
            }
            else if(direction.equals("right")){
               for(int i = 1; i < shipspaces; i++){
                    if(playerShipBoard[row][col + i].equals("Z ") || (col + 1) > 11 || (col + 1) < 0){
                        return false;
                    }
                } 
            }
            else if(direction.equals("left")){
                for(int i = 1; i < shipspaces; i++){
                    if(playerShipBoard[row][col - i].equals("Z ") || (col - 1) > 11 || (col - 1) < 0){
                        return false;
                    }
                }
            }
            
        }
        return true;
    }

        //place Ship on Player board
    public boolean placePlayerShip(int row, int col, String direction, int shipSpaces){
            //check if ship can be placed
        boolean check = checkShipPlace(row, col, direction, shipSpaces);
            //Place ship there
        if(check == true){
            for(int i = 0; i < shipSpaces; i++){
                if(direction.equals("up")){
                    playerShipBoard[row - i][col] = "Z ";
                }
                else if(direction.equals("down")){
                    playerShipBoard[row + i][col] = "Z ";
                }
                else if(direction.equals("right")){
                    playerShipBoard[row][col + i] = "Z ";
                }
                else{
                    playerShipBoard[row][col - i] = "Z ";
                }
            }
                //increase number of player ships
            playerships += 1;
            return true;
        }
        else{
            return false;
        }
    }
    
        //Return number of ships
    public int getPlayerShipNum(){
        return playerships;
    }
    
        //Return number of ships
    public int getCompShipNum(){
        return compships;
    }
}