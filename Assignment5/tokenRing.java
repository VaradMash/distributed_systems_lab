import java.util.Scanner;

class TokenRing {
    public static void main(String[] args) throws Throwable{    
        System.out.println("Enter the number of processes: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int token = 0;
        int ch = 1;
        int sender, reciever;
        String message;
        boolean message_pass = false;
        System.out.println("Initializing ring");
        for(int i = 0; i < n; i++) {
            System.out.println(" " + i);                        
        }
        System.out.println("Enter sender : ");
        sender = sc.nextInt();
        System.out.println("Enter reciever : ");
        reciever = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter message : ");
        message = sc.nextLine();
        for(token = 0; token < n; token++) {
            System.out.println("Token at process " + token);
            if(token == sender) {
                System.out.println("Sender found");
                System.out.println("Attaching message");  
                message_pass = true;              
            } else if (token == reciever) {
                System.out.println("Token arrived at reciever");
                System.out.println("Message " + message + " recieved");
                message_pass = false;                
            }
            if(message_pass) {
                System.out.println(token + " passing message " + message + " to " + (token + 1)%n);
            }
        }
    }
}