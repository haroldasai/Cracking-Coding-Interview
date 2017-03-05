import java.util.*;
/**
 *
 * @author Harold
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a string.");
        Scanner scan = new Scanner(System.in);
        char[] chararr = scan.next().toCharArray();
        boolean unique = true;
        for(int i = 0; i < chararr.length; i++) {
            for(int j = 0; j < i; j++) {
                if( chararr[i] == chararr[j]) {
                    unique = false;
                }
            }
        }
        System.out.println(unique);
    }
}
