package program;

import java.util.Scanner;

/**
 * @author Choudhury Subham on 13-06-2022
 */
public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ans=0;
        while (true){
            System.out.println("Enter the operator:");
            char op = sc.next().trim().charAt(0);
            if (op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                System.out.println("Enter Two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if (op=='+'){
                    ans =num1+num2;
                }
                if (op=='-'){
                    ans =num1-num2;
                }
                if (op=='*'){
                    ans =num1*num2;
                }
                if (op=='/'){
                    ans =num1/num2;
                }
                if (op=='%'){
                    ans =num1%num2;
                }
            }else if(op=='x'||op=='X'){
                System.out.println("Exit");
                break;
            }else {
                System.out.println("Invalid Input");
            }
            System.out.println(ans);
        }

    }
}
