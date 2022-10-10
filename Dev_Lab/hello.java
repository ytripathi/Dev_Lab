import java.util.*;

public class hello {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
          String name = sc.nextLine();
          System.out.println("Welcome "+name+" to DevOps Automation" );
        }
    }
}