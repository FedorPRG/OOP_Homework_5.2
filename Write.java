import java.io.FileWriter;
import java.util.ArrayList;

public class Write {
  public static void WriteTaskFormat1(String text, ArrayList<Phonebook> ListTask) throws Exception {
    FileWriter w = new FileWriter(text, false);
    for (Phonebook Task : ListTask) {
      w.write(Task.getFullName() + "\n");
    }
    w.flush();
    w.close();
  }
  public static void WriteTaskFormat2(String text, ArrayList<Phonebook> ListTask) throws Exception {
    FileWriter w = new FileWriter(text, false);
    for (Phonebook Task : ListTask) {
      w.write(Task.getId() + "\n");
      w.write(Task.getName() + "\n");
      w.write(Task.getNumber() + "\n");
    }
    w.flush();
    w.close();
  }


}
