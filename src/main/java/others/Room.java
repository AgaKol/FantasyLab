package others;
import java.sql.Array;
import java.util.Random;

import java.util.ArrayList;

public class Room {

   private ArrayList<Exit> exits;


   public Room() {
      this.exits = new ArrayList<>();
   }

   public void generateExits() {
      Exit[] exits2 = {Exit.EAST, Exit.NORTH, Exit.SOUTH, Exit.WEST};

      int counter = (int)Math.floor(Math.random()*(4-1+1)+1);
      int randomI = (int)Math.floor(Math.random()*(3-1+1)+1);

      while (counter > 0) {
         exits.add(exits2[randomI]);
         randomI -= 1;
      }
   }

   public void exitChosen() {
      Room nextRoom = new Room();
      generateExits();
   }
}
