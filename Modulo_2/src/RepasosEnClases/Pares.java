package RepasosEnClases;

import java.util.ArrayList;

public class Pares {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) % 2 == 0) {
        list.remove(i);
        i--;
      }
    }

    System.out.println(list);
  }
}
