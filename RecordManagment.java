import java.util.ArrayList;
class Record{
    int year;
    String name;
    // ArrayList<Record> arr = new ArrayList<>();
    ArrayList<Record> arr = new ArrayList<>();
    void addrecord( Record r) throws Exception {
        if (r.year < 1996 || r.year > 2023) {

            throw new Exception("invalid year");
        } else {
            arr.add(r);
        } }
    void printrecord(){
        for(Record r:arr){
            System.out.println(r);
        }
    } }


public class RecordManagment{
    public static void main(String[] args) throws Exception
    {
        Record r = new Record();
        r.name="ibad";
        r.year=1995;
        r.addrecord(r);
    }
}
