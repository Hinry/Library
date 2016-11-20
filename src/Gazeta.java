/**
 * Created by mrhri on 20.11.2016.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Gazeta implements Comparable<Gazeta> {
    String name;
    String date;
    static List<Gazeta> col = new ArrayList();
    static BufferedReader buf;
    static Scanner sc;

    public Gazeta(String name, String date) throws IOException {
        this.name = name;
        this.date = date;
    }

    public static void Gaz() throws IOException {
        boolean ans = true;
        System.out.println("Сколько газет Вы хотите положить?");
        int count = sc.nextInt();

        for(String[] gaz = new String[count]; ans; ans = false) {
            for(int i = 0; i < gaz.length; ++i) {
                System.out.println("Введите даные газеты №" + (i + 1));
                System.out.println("Введите название гезеты:");
                String n = buf.readLine();
                gaz[i] = n;
                System.out.println("Введите дату выпуска гзеты в формате год.месяц(числами):");
                String d = buf.readLine();
                gaz[i] = d;
                col.add(new Gazeta(n, d));
                if(i == count - 1) {
                    break;
                }

                System.out.println("Добавить еще одну газету?\n1. Да\n2. Нет");
                String quest = buf.readLine();
                byte var8 = -1;
                switch(quest.hashCode()) {
                    case 49:
                        if(quest.equals("1")) {
                            var8 = 0;
                        }
                        break;
                    case 50:
                        if(quest.equals("2")) {
                            var8 = 1;
                        }
                }

                switch(var8) {
                    case 0:
                        ans = true;
                        break;
                    case 1:
                        ans = false;
                }

                if(!ans) {
                    break;
                }
            }
        }

    }

    public static void InfoCol() {
        Collections.sort(col, Gazeta::compareTo);
        int size = col.size();

        for(int i = 0; i < size; ++i) {
            System.out.println(((Gazeta)col.get(i)).toString());
        }

    }

    public int compareTo(Gazeta obj) {
        int val = this.name.compareTo(obj.name);
        if(val != 0) {
            return val;
        } else {
            val = this.date.compareTo(obj.date);
            return val;
        }
    }

    public String toString() {
        return "\"" + this.name + "\" Дата: " + this.date + " ;";
    }

    public static void main(String[] args) throws IOException {
        Gaz();
        InfoCol();
    }

    static {
        buf = new BufferedReader(new InputStreamReader(System.in));
        sc = new Scanner(System.in);
    }
}
