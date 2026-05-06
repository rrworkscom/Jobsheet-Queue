import java.util.Scanner;

public class StudentCourseMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentCourseQueue stdcq = new StudentCourseQueue(10);

        int choice;
        do {
            System.out.println("\n=== KRS Approval Menu ===");
            System.out.println("1. Enqueue Student");
            System.out.println("2. Process 2 Students");
            System.out.println("3. Show All Students");
            System.out.println("4. Show First 2 Students");
            System.out.println("5. Show Last Student");
            System.out.println("6. Queue Info");
            System.out.println("7. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Study Program: ");
                    String sp = sc.nextLine();
                    System.out.print("Class: ");
                    String cls = sc.nextLine();
                    Student s = new Student(nim, name, sp, cls);
                    stdcq.enqueue(s);
                    break;
                case 2:
                    stdcq.dequeue2();
                    break;
                case 3:
                    stdcq.printAll();
                    break;
                case 4:
                    stdcq.peek2Front();
                    break;
                case 5:
                    stdcq.viewRear();
                    break;
                case 6:
                    stdcq.info();
                    break;
                case 7:
                    stdcq.clear();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid!");
            }

        } while (choice != 0);
    }
}

