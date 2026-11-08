package Array;

import java.util.Scanner;

public class Crud {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] ids = new int[10];
        String[] names = new String[10];

        int size = 0;

        int option = 0;

        do {
            System.out.println("1.Create");
            System.out.println("2.Showe");
            System.out.println("3.update");
            System.out.print("4.Delete");
            System.out.print("Choose one Option");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter Size You want to Add:");
                    size = input.nextInt();
                    for (int i = 0; i < size; i++) {
                        System.out.println("Stdent" + i);
                        System.out.print("Enter Id:");
                        ids[i] = input.nextInt();
                        input.nextLine();
                        System.out.println("Enter name:");
                        names[i] = input.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("================OUTPUT==============");
                    for (int j = 0; j < size; j++) {
                        System.out.println("ID:" + ids[j]);
                        System.out.println("Name:" + names[j]);
                    }
                    break;
                case 3:
                int search_id;
                System.out.println("Enter id you want to update");
                search_id = input.nextInt();
                input.nextLine();
                boolean isFound = false;
                for (int i = 0; i<size; i++) {
                    if (search_id == ids[i]) {
                        System.out.println("Enter New Name:");
                        names[i] = input.nextLine();
                        isFound = true;
                    }
                }
                if(!isFound){
                    System.out.println("Invalid option! Please choose between 1 and 4.");
                    break;
                }
                break;
                case 4:
                int search;
                boolean isfound = false;
                System.out.println("Enter id you want to delete");
                search = input.nextInt();
                for(int i =0 ;i<size; i++){
                    if (search == ids[i]) {
                        for(int j =i; j<size-1; j++){
                            ids[j] = ids[j+1];
                            names[j] = names[j+1];
                        }
                        size --;
                        isfound = true;
                        System.out.println("Delete Successfully");
                    }
                }
                if(!isfound){
                    System.out.println("Id Not yet");
                }
                break;
                default:
                break;
            }
        } while (option != 5);
        input.close();
    }

}
