import com.sun.source.doctree.DocTree;
import entites.Departament;
import entites.HourContract;
import entites.Worker;
import entites.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Enter department's name: ");
    String departmentName = sc.nextLine();
    sc.next();
    System.out.println("Enter worker data: ");
    System.out.println("Name: ");
    String workerName = sc.nextLine();
    System.out.println("Level: ");
    String workerLevel = sc.nextLine();
    System.out.println("Base salary: ");
    double baseSalary = sc.nextDouble();

    Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departmentName));

        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("enter contract #" + i + " data:");
            System.out.println("Date (DD/MM/YYYY");
            Date contactDate = sdf.parse(sc.next());
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration (hours):");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contactDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.printf("Enter month");
    }
}
