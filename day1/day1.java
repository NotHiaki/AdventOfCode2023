import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class day1 {
  public static void main(String[] args) {
    day1 program = new day1();
    program.problem1();
  }

  public int problem1() {
    List<String> lines = readLines();

    char start = '0', end = '0';
    int res = 0;

    for (String line : lines) {
      for(int i = 0; i <= line.length() - 1; i++) {
        char charactere = line.charAt(i);

        if(Character.isDigit(charactere)) {
          start = charactere;
          break;
        }
      }

      for(int i = line.length() - 1; i >= 0; i--) {
        char charactere = line.charAt(i);

        if(Character.isDigit(charactere)) {
          end = charactere;
          break;
        }
      }

      res += Integer.parseInt("" + start + end);
    }

    System.out.println(res);
    return res;
  }

  public List<String> readLines() {
    String filePath = "input.txt";

    List<String> lines = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = reader.readLine()) != null) {
        lines.add(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return lines;
  }
}