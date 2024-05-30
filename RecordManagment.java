/*The functionality of this Java program is to prompt the user to input a name and a year, create a record object with these
values, validate the year within a specified range (1996-2023), and add the record to a list if it meets the criteria.*/
import java.util.ArrayList;
import java.util.Scanner;

class Record {
    int year;
    String name;
    ArrayList<Record> arr = new ArrayList<>();

    void addRecord(Record r) throws Exception {
        if (r.year < 1996 || r.year > 2023) {
            throw new Exception("Invalid year");
        } else {
            arr.add(r);
        }
    }

    void printRecord() {
        for (Record r : arr) {
            System.out.println(r);
        }
    }
}

public class RecordManagement {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        Record r = new Record();
        
        System.out.print("Enter the name: ");
        r.name = scanner.nextLine();
        
        System.out.print("Enter the year: ");
        r.year = scanner.nextInt();
        
        r.addRecord(r);
    }
}
