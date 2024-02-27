

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        String nim,option;
        String  user,pass;
        Scanner scan = new Scanner(System.in);

        //input
        while (true){
            System.out.println("===== Library System =====");
            System.out.println("1. login as student");
            System.out.println("2. login as admin");
            System.out.println("3. exit");
            System.out.print("chosee option (1/2/3):");
            option = scan.nextLine();

            // proses dan output
            switch (option) {
                case "1":
                    System.out.print("Enter your NIM : ");
                    nim = scan.nextLine();
                    if (nim.length() != 15) {
                        System.out.println("user not found");
                    } else {
                        System.out.println("succesed login as student");
                    }
                    break;
                case "2":
                    System.out.print("Enter your username (admin): ");
                    user = scan.nextLine();
                    System.out.print("Enter your password (admin): ");
                    pass = scan.nextLine();
                    if (user.equals("admin") && pass.equals("admin")) {
                        System.out.println("Successed login as admin");
                    }else {
                        System.out.println("Admin not found");
                    }
                    break;
                case "3":
                    System.out.print("Thank you");
                    System.exit(0); // program berakhir
                default:
                    System.out.println("invalid option");
            }
        }
    }}