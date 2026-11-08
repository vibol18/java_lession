package Array;

import java.util.Scanner;

public class create {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // String[] fruit = new String[5];
        // fruit[0] = "Apple";
        // fruit[1] = "Banana";
        // fruit[2] = "Coconut";
        // fruit[3] = "Cherry";
        // fruit[4] = "Hell world";
        // for (String f : fruit) {
        // System.err.println(f);
        // }
        int[] ids = new int[10];
        String[] names = new String[10];
        int size = 0;
        int option = 0;
        do {
            System.out.println("1.Create");
            System.out.println("2.Show");
            System.out.println("3.update");
            System.out.println("4.Delete");
            System.out.println("5.Search Name");
            System.out.print("Choose one Option");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter Size You want to Add:");
                    size = input.nextInt();
                    for (int i = 0; i < size; i++) {
                        System.out.print("Enter Id:");
                        ids[i] = input.nextInt();
                        input.nextLine();
                        System.out.println("Enter name:");
                        names[i] = input.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("-------------OUTPUT----------------");
                    for (int j = 0; j < size; j++) {
                        System.out.println("ID:" + ids[j]);
                        System.out.println("Name:" + names[j]);
                    }
                    break;
                case 3:
                break;
                case 4:
                boolean is_found = false;
                System.out.println("Enter Id to Delete");
                int search_id = input.nextInt();
                input.nextLine();
                for(int i =0; i<size;i++){
                    if(search_id == ids[i]){
                        for(int j = i; i<size-1;i++){
                            ids[j] = ids[j+1];
                            names[j] = names[j+1];
                        }
                        size --;
                        is_found = true;
                        System.out.println("Delete Successfully");
                    }
                }
                if(!is_found){
                    System.out.println("Cannot find");
                }
                break;
                case 5:
                input.nextLine();
                String search_name;
                System.out.println("Ener Name To searcch");
                search_name = input.nextLine();
                boolean search_found = false;
                for (int i = 0; i<size; i++) {
                    if(names[i].toLowerCase().contains(search_name.toLowerCase())){
                        search_found = true;
                        System.out.println("=============================[After Search]=================");
                        System.out.println("Name is" + names[i]);
                        System.out.println("Id Found is"+ ids[i]);
                    }
                }
                if(!search_found){
                    System.out.println("Not found");
                }
                break;
                default:
                    break;
            }
        } while (option != 7);
    }
}
