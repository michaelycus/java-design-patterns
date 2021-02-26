package factorypattern;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class EnemyShipTesting {
    public static void main(String[] args) {
        
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        
        EnemyShip theEnemy = null;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("What type ship? (U / R / B)");
        
        if (userInput.hasNextLine()) {
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }
        
        if (theEnemy != null) {
            doStuffEnemy(theEnemy);
        } else {
            System.out.println("Enter a U, R, or B next time");
        }
        
        // BAD WAY...
        
//        EnemyShip theEnemy = null;
//        
//        Scanner userInput = new Scanner(System.in);
//        String enemyShipOption = "";
//        
//        System.out.println("What type of ship? (U / R)");
//        
//        if (userInput.hasNextLine()) {
//            enemyShipOption = userInput.nextLine();
//        }
//        if (enemyShipOption.equals("U")) {
//            theEnemy = new UFOEnemyShip();
//        } else if (enemyShipOption.equals("R")) {
//            theEnemy = new RocketEnemyShip();
//        }
//        doStuffEnemy(theEnemy);
    }
    
    public static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
