
public class Arreglos {
    public static void main(String[] args){
        // unidimencional
        int[] arreglo = {1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < arreglo.length; i++) {
            System.out.println(i);
        }
        int a = arreglo[1];
        int b = arreglo[2];
        System.out.println(a+"  "+b);
        
        String[] demo = new String[2];
        demo[0] = "asd";
        
        char[] demo_1 = {'a'};
        char[] demo_3 = new char[3];
        demo_3[0] = '1';
        demo_3[1] = '1';
        demo_3[2] = '1';
        // multidimensional 
        
        String[][] matrix = {{"1","2"},{"3","f"}};
        
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++) {
                System.out.println("--->"+matrix[i][j]);
            }
        }
        int D = 10;
        switch(D){
            case 0:
                System.out.println("demo");
                break;
            
            case 1:
                break;
            
            default:
                System.out.println("default");
                break;
    
        }   
        boolean argumento = true && false;
        
        if(argumento) {
            System.out.println("si");
        }else{
            System.out.println("no");
        }
        String arg = argumento ? "si":"no";
        
        if(argumento)
            System.out.println("si");
        else
            System.out.println("no");
    	do {
		System.out.println("WHILE"); // Imprime WHILE una vez.
		break;
	} while(true);
	
        boolean large_resolution = true && false || false || false && 1!=0;
        System.out.println(large_resolution);
        System.out.println(3.1 % 2);
        
        }
    }
