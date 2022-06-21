import java.util.Scanner;

/**
 * @author Choudhury Subham on 14-06-2022
 */
public class Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit){
            case "Apple":
                System.out.println("Kashmiri product");
                break;
            case "banana":
                System.out.println("AndraPradesh product");
                break;
            case "Mango":
                System.out.println("Seems to be the king of Fruits");
                break;
        }
    }
}
