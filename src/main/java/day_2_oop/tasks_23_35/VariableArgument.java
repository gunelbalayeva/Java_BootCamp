package day_2_oop.tasks_23_35;

public class VariableArgument {
    public static void main(String[] args) {
        int topla = topla(1, 2, 3, 4, 5, 6);
        System.out.println("toplam: "+topla);
    }

    public static int topla(int... saylar) {
        int toplan = 0;
        for (int say : saylar) {
            //main'de topla() metoduna daxil olan butun integer saylari toplayacaq
            toplan += say;
        }
        return toplan;
    }

    /*
  int... saylar - mutleq 3 noqte olmalidir. Burda biz 1-den cox integer gondereceyimizi bildiririrk.
  Bu bizim ucun integer arrayi kimi isleyir.
   */
    // ------------------------
    public static int topla(int say1, int say2) {
        return say1 + say2;
    }

    public static int topla() {
        return 0;
    }


}
