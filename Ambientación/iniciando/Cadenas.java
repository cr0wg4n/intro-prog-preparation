public class Cadenas {
    public static void main(){
        String nombre = "Mauricio matias conde";
        String nombre_2 = new String("Juancito pinto");
        String demo;
        boolean flag;
        flag = nombre.equals("Maussricio matias conde");
        System.out.println(flag);
        demo = nombre.substring(0,8);
        System.out.println(demo);
        demo = nombre.toLowerCase();
        System.out.println(demo);
        demo = nombre.toUpperCase();
        System.out.println(demo);
        System.out.println(demo.charAt(1));
        System.out.println(demo.indexOf("C"));
        demo = "";
        System.out.println(demo.isEmpty());
        demo.length();
        System.out.println(nombre_2.split(" ")[1]);
        System.out.println(nombre_2.replaceAll("i","c"));
        String dot = "   a  ";
        System.out.println(dot.trim());
    }
}