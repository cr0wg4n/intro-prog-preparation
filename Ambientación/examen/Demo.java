import java.util.ArrayList;
import java.util.HashMap;


public class Demo {
    
    enum Figura{
        CUADRADO,
        RECTANGULO
    }      
    public static void main(){
         int MAURICIO_LIFE = 133;
         int BRANK_LIFE = 120;
        
        Magician mauricio = new Magician("mauricio", MAURICIO_LIFE);
        Monster brank = new Monster("brank", BRANK_LIFE);
        ArrayList<Character> chars = new ArrayList<Character>();
        chars.clear();
        chars.add(mauricio);
        chars.add(brank);
        System.out.println(chars.remove(1));
        
        HashMap<String, Character> hashChars= new HashMap<String, Character>();
        hashChars.clear();
        hashChars.put("mauricio", mauricio);
        hashChars.put("brank", brank);
        hashChars.remove("brank");
        System.out.println(hashChars);
        System.out.println(chars);
        
        // numero de digitos en un numero 
        
        int nDigits = (int)(Math.log10(100) + 1);
        System.out.println(nDigits);
        
        double a = Math.pow(10, 4);  
        System.out.println("a "+ a);
        // solo enteros y Strings
        switch("asdd") {
            case "asdd":
                System.out.println("dentro");
                break;
            default:
                break;
        }
        
        
        
        try{
            throw new Exception("demo");
        }catch(Exception e){
            System.out.println(e);
        }   
        Figura fig = Figura.RECTANGULO;
        boolean l = fig == Figura.RECTANGULO;
        System.out.println(l);
    }
}