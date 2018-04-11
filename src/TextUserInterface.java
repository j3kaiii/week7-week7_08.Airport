
import java.util.Scanner;

/**
 *
 * @author j3kaiii
 */
public class TextUserInterface {
    private Scanner reader;
    private Airport airport;

    TextUserInterface(Scanner reader, Airport airport) {
        this.reader = reader;
        this.airport = airport;
    }
    
    public void start() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        
        while (true) {
            menu();
            
            String choise = reader.nextLine();
            
            if (choise.equals("x")) break;
            else if (choise.equals("1")) addPlane();
            else if (choise.equals("2")) addFlight();
        }
        
    }

    private void menu() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
    }

    private void addPlane() {
    }

    private void addFlight() {
    }
    
}
