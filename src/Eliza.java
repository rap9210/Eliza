import java.util.Scanner;
public class Eliza {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ElizaChats online. I will" +
                " record your personal information for no reason.");
        System.out.println("So, what's your name?:");
        String name = input.nextLine();
        System.out.println("Nice to meet you "+name+", how's your day been?");
        String response_1 = input.nextLine();
        System.out.println("Thank you "+name+",\n["+response_1+"]\nhas been recorded" +
                " successfully into your permanent psychological \nprofile. Have a nice" +
                " rest of your day. :^)");

    }
}
