
public class TestOld
{
   public static void main(String args[]){
        /* 
            Tipos de datos   
        */
        byte var_byte = 127; // 8 bits con signo
        short var_short = 32767; // 16 bits con signo
        int var_int = 2147483647;
        long var_long = 0x7fff_ffff_ffff_ffffL;
        float var_float = 10.1f;
        double var_double = 20.2d;
        boolean var_boolean = true;
        char var_char = 'd'; // unicode char
        String var_string = new String("Mauricio Matias");
        String var_string_2 = "otra forma de definir un string";
        float var_conversion = ((12 * 2 + 3.0f) * (2.1f - 1.2f));
        // en Java si no se especifica f o d al final por defecto un 
        // decimal se trata como un double
        System.out.println(var_conversion);
        double weird_res = 3.5f +4.9f;
        System.out.println(weird_res);
        float r = 1.223f;
        // esperado 20.20 .... obtenido 20.19999999999996
        doublePresicion();
        // 0.30000000000000004
        System.out.println(0.1+0.2);
                            // con modulo el resultado siempre sera un positivo
        double res = 2.2%1.2;
        double a = var_int;
        System.out.println(a);
        
        
        
        double d = 100.04; 
         
        //casting de tipo
        long l = (long)d;
         
        //casting de tipo
        int i = (int)l; 
        System.out.println("Valor Double "+d);
         
        //parte fraccionaria perdida
        System.out.println("Valor Long "+l); 
         
        //parte fraccionaria perdida
        System.out.println("Valor Int "+i); 
        byte _a = 40;
        byte _b = 50;
        byte _c = 112;
        // si no se castea, el valor del float al final sera de un entero sin parte decimal
        double _d = (double) _a * _b / _c;
        
        System.out.println(_d); 
        Integer n_1 = new Integer(1);
    }
    
    public static void doublePresicion() {
        double total = 0.2;
        for (int i = 0; i < 100; i++) {
            total += 0.2;
        }
        System.out.println("total = " + total);
    }
}