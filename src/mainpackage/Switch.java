package mainpackage;


import java.util.Scanner;

public class Switch  {
   static Scanner sacn1 = new Scanner(System.in);
//  static   int e = sacn1.nextInt();
   static String[] name = new String[5];





    public static void main(String[] args) {
        System.out.println("add task" + " " + " press            1 ");
        System.out.println("view task" + " " + " press           2 ");
        System.out.println("delete task" + " " + " press         3 ");
        System.out.println("mark task completed" + " " + " press 4 ");
        System.out.println("exit from  display " + " " + " press 5 ");
        System.out.println();

        Switch s=new Switch();
do {
    Scanner scan=new Scanner(System.in);
    System.out.println("Select above option");
    int num= scan.nextInt();
        switch (num) {
            case 1: {
                System.out.println("you have selected" +" " + num);

                s.addTask();
                System.out.println();
                s.print();
                break;
            }

            case 2:
                System.out.println("you have selected" +" " + num);
                s.viewTask();
                System.out.println();
                s.print();
                break;

            case 3:
                System.out.println("you have selected" +" " + num);
                s.markAaCompletedTask();
                System.out.println();
                s.print();



            case 4:
                System.out.println("you have selected" +" " + num);
                s.removeTask();
                System.out.println();
                s.print();




            case 5:
                System.out.println("you have selected" +" " + num);
                s.exit();
                System.out.println();
                s.print();
                break;

            default:
                System.out.println("invalied input");

        }}while (true);
    }

    public void print() {

        System.out.println("add task" + " " + " press 1 ");
        System.out.println("view task" + " " + " press 2 ");
        System.out.println("delete task" + " " + " press 3 ");
        System.out.println("mark task completed" + " " + " press 4 ");
        System.out.println("exit from  display " + " " + " press 5 ");
        System.out.println();
    }



    public  void addTask() {

        System.out.println("Enter first tsk");


        for(int i=0;i<name.length;i++) {
            System.out.println("enter"+i+" task "  );
           name[i]= sacn1.nextLine();
           break;

        }
    }
    public void viewTask() {
        System.out.println("view  task");
        for(int i=0;i<name.length;i++) {

            System.out.println("view " + i  + "task " +name[i] );
        }
    }
    public void removeTask() {
        System.out.println("remove task by index no");
        System.out.println("enter index no");
        int i=sacn1.nextInt();
        System.out.println("type remove");
        name[i]=sacn1.next();

    }
    public void markAaCompletedTask() {
        System.out.println("mark task by index no");
        System.out.println("enter index no");
        int i=sacn1.nextInt();
        System.out.println("type mark");
        name[i]=sacn1.next();


    }
    public void exit() {
        System.out.println("thank you use again");

    }


}
