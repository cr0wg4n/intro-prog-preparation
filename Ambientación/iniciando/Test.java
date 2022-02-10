import java.util.*;
import static java.lang.Math.*;
public class Test{
    public static void main(){
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Tester("name", "code", 29, 'D'));
        employees.add(new Tester("name_2", "code", 22, 'D'));
        Programmer programmer = new Programmer("name_3", "code", 21, 'D');
        programmer.imCrazzy();
        employees.add(programmer);
        for (Employee employeee: employees){            
            employeee.doWork();
        }
        System.out.println(""+PI);
        Programmer.imCrazzy();
        System.out.println(programmer.getName());
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        
    }
}