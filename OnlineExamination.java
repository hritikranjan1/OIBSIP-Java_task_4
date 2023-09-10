import java.util.*;

public class OnlineExamination{
    
    static String name;
    
    public void login(String name, int password){
        this.name = name;
        
        if(password == 1234){
            System.out.println(" User name : " + name);
            System.out.println(" Roll number : 13");
        }
        else{
            System.out.println("Invalid user ... ");
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        OnlineExamination n = new OnlineExamination();
        System.out.println("Login Click 1");
        System.out.println("New User Click 2 ");
        int click = sc.nextInt();
        if(click == 1){
            System.out.println("Enter your name : ");
            String uname = sc.next();
            System.out.println("Enter Password :");
            int pass = sc.nextInt();
            n.login(uname, pass);
        }
        int choice;
        int count = 0;
        int id = 0;
        if(click == 2){
            System.out.println("Enter User Name : ");
            name = sc.next();
            System.out.println("Enter Roll No. : ");
            id = sc.nextInt();
            
        }
        do{
            System.out.println("\t\t WELCOME " + name + " TO ONLINE EXAM ");
            System.out.println("1. Start Exam ");
            System.out.println("2. View Marks ");
            System.out.println("3. Logout");
            System.out.println("Enter Your choice : ");
            int ch = sc.nextInt();
            if(ch == 3){
                System.out.println("Thank you for attempting the Exam ");
                break;
            }
            switch(ch){
                case 1 : {
                    System.out.println("Select Programming Language : ");
                    System.out.println("1. C \n2. Java \n3. C++");
                    System.out.println("Enter Your Choice : ");
                    int sub = sc.nextInt();
                    System.out.println("There are 5 Question in the Examination ");
                    System.out.println("Each Question consist of 4 option you have to choose correct Answer ");
                    if(sub == 2){
                        count = 0;
                        System.out.println("Que 1 Java Is Developed By : ");
                        System.out.println("1. Dennis Ritchie \n2. James Gosling \n3. Steve Jobs \n4. Ken Thompson");
                        System.out.println("Enter Answer : ");
                        choice = sc.nextInt();
                        if(choice == 2){
                            ++count;
                        }
                        System.out.println("Que 2 Java Is  : ");
                        System.out.println("1. Low Level \n2. High Level \n3. Middle Level \n4. Machine Level");
                        System.out.println("Enter Answer : ");
                        choice = sc.nextInt();
                        if(choice == 2){
                            ++count;
                        }
                        System.out.println("Que 3 Java Is : ");
                        System.out.println("1. Platform Independent \n2. Platform Dependent \n3.None Of These \n4. Both 1 and 2");
                        System.out.println("Enter Answer : ");
                        choice = sc.nextInt();
                        if(choice == 1){
                            ++count;
                        }
                        System.out.println("Que 4 Number of Primitive data types in Java are ?  : ");
                        System.out.println("1. 6 \n2. 7 \n3. 8 \n4. 9");
                        System.out.println("Enter Answer : ");
                        choice = sc.nextInt();
                        if(choice == 1){
                            ++count;
                        }
                        System.out.println("Que 5 Java Is : ");
                        System.out.println("1.Compiled Language \n2. Interpreted Language \n3. Both \n4. None");
                        System.out.println("Enter Answer : ");
                        choice = sc.nextInt();
                        if(choice == 3){
                            ++count;
                        }
                    }
                    else if(sub == 1){
                        count = 0;
                        System.out.println("Que 1 C Is Developed By : ");
                        System.out.println("1. Dennis Ritchie \n2. James Gosling \n3. Steve Jobs \n4. Ken Thompson");
                        System.out.println("Enter Answer : ");
                        choice = sc.nextInt();
                        if(choice == 1){
                            ++count;
                        }
                        System.out.println("Que 2 C Is  : ");
                        System.out.println("1. Low Level \n2. High Level \n3. Middle Level \n4. Machine Level");
                        System.out.println("Enter Answer : ");
                        choice = sc.nextInt();
                        if(choice == 1){
                            ++count;
                        }
                        System.out.println("Que 3 C Is : ");
                        System.out.println("1. Platform Independent \n2. Platform Dependent \n3.None Of These \n4. Both 1 and 2");
                        System.out.println("Enter Answer : ");
                        choice = sc.nextInt();
                        if(choice == 2){
                            ++count;
                        }
                        System.out.println("Que 4 C is   : ");
                        System.out.println("1. Procedure Oriented  \n2. Object Oriented \n3. Strictly Oriented \n4. None");
                        System.out.println("Enter Answer : ");
                        choice = sc.nextInt();
                        if(choice == 1){
                            ++count;
                        }
                        System.out.println("Que 5 C Is : ");
                        System.out.println("1.Compiled Language \n2. Interpreted Language \n3. Both \n4. None");
                        System.out.println("Enter Answer : ");
                        choice = sc.nextInt();
                        if(choice == 1){
                            ++count;
                        }
                    }
                    else{
                         count = 0;
                        System.out.println("Que 1 C++ Is Developed By : ");
                        System.out.println("1. Dennis Ritchie \n2. James Gosling \n3. Jarne Stroustrup\n4. Ken Thompson");
                        System.out.println("Enter Answer : ");
                        choice = sc.nextInt();
                        if(choice == 3){
                            ++count;
                        }
                        System.out.println("Que 2 C++ Is  : ");
                        System.out.println("1. Low Level \n2. High Level \n3. Middle Level \n4. Machine Level");
                        System.out.println("Enter Answer : ");
                        choice = sc.nextInt();
                        if(choice == 3){
                            ++count;
                        }
                        System.out.println("Que 3 C++ Is : ");
                        System.out.println("1. Platform Independent \n2. Platform Dependent \n3.None Of These \n4. Both 1 and 2");
                        System.out.println("Enter Answer : ");
                        choice = sc.nextInt();
                        if(choice == 2){
                            ++count;
                        }
                        System.out.println("Que 4 C++ is   : ");
                        System.out.println("1. Procedure Oriented  \n2. Object Oriented \n3. Strictly Oriented \n4. None");
                        System.out.println("Enter Answer : ");
                        choice = sc.nextInt();
                        if(choice == 2){
                            ++count;
                        }
                        System.out.println("Que 5 C++ Is : ");
                        System.out.println("1.Compiled Language \n2. Interpreted Language \n3. Both \n4. None");
                        System.out.println("Enter Answer : ");
                        choice = sc.nextInt();
                        if(choice == 1){
                            ++count;
                        }
                    }
                    break;
                }
                case 2 : {
                    System.out.println("Congratulation ! " + name + "You Scored " + count + " Marks  out of 5 " );
                    }
            }
        }
        while(true);
    }
}
