import java.util.*;

public class Game {
    public static void main(){
         int MAURICIO_LIFE = 133;
         int BRANK_LIFE = 120;
        
        Magician mauricio = new Magician("mauricio", MAURICIO_LIFE);
        Monster brank = new Monster("brank", BRANK_LIFE);
        ArrayList<Character> chars = new ArrayList<Character>();
        
        int time = 0;
        while(true){
            Character turn, target;
            displayLife(mauricio, MAURICIO_LIFE);
            displayLife(brank, BRANK_LIFE);
            if(time % 2==0){
                brank.fight(mauricio);
                if(!mauricio.isAlive()){
                    System.out.println("\n ->"+brank.name+"  gano la batalla! \n");
                    break;
                }
            } else {
                mauricio.fight(brank);
                if(!brank.isAlive()){
                    System.out.println("\n -> "+mauricio.name+"  gano la batalla!");
                    break;
                }
            }
            time++;
            System.out.println("------------- Time "+time+".000.000 --------------");
        }
    }
    static public void displayLife(Character character, int totalLife){
        int actualLife = character.life;
        double percentTotalLife = ((double)actualLife/totalLife)*100;
        System.out.print(character.name+": "); 
        for (int i = 0; i < 100; i+=10){
            if(i<percentTotalLife){
                 System.out.print("*");   
            }  
        }
        
        System.out.print("\n"); 
    }
}