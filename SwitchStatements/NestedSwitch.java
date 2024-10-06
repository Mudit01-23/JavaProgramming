package com.mj.SwitchStatements;
import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee ID");
        int empID = sc.nextInt();



        switch (empID){
            case 1:
                System.out.println("Mudit Joshi");
                break;

            case 2:
                System.out.println("Kshitij Bhatia ");
                break;

            case 3:

                System.out.println("Enter department name");
                String department = sc.next();
                System.out.println("Employee id: 3");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;

                    case"Management":
                        System.out.println("Management department");
                        break;

                    default:
                        System.out.println("Enter the department properly");
                }
                break;

            default:
                System.out.println("Enter a valid empID ");

        }


    }

}
