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

public class Journal implements Comparable<Journal> {
    String name;
    String theme;
    String date;
    static List<Journal> colJournal = new ArrayList();
    static BufferedReader buf;
    static Scanner sc;

    public Journal(String name, String theme, String date) {
        this.name = name;
        this.theme = theme;
        this.date = date;
    }

    static void Jour() throws IOException {
        boolean ans = true;
        System.out.println("Сколько журналов Вы хотите положить?");
        int count = sc.nextInt();

        for(String[] journal = new String[count]; ans; ans = false) {
            for(int i = 0; i < journal.length; ++i) {
                System.out.println("Введите даные журнала №" + (i + 1));
                System.out.println("Введите название журнала:");
                String n = buf.readLine();
                journal[i] = n;
                System.out.println("Введите тематику журнала:");
                String t = buf.readLine();
                journal[i] = t;
                System.out.println("Введите дату выпуска журнала в формате год.месяц(числами):");
                String d = buf.readLine();
                journal[i] = d;
                colJournal.add(new Journal(n, t, d));
                if(i == count - 1) {
                    break;
                }

                System.out.println("Добавить еще один журнал?\n1. Да\n2. Нет");
                String quest = buf.readLine();
                byte var9 = -1;
                switch(quest.hashCode()) {
                    case 49:
                        if(quest.equals("1")) {
                            var9 = 0;
                        }
                        break;
                    case 50:
                        if(quest.equals("2")) {
                            var9 = 1;
                        }
                }

                switch(var9) {
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
        Collections.sort(colJournal, Journal::compareTo);
        int size = colJournal.size();

        for(int i = 0; i < size; ++i) {
            System.out.println(((Journal)colJournal.get(i)).toString());
        }

    }

    public int compareTo(Journal obj) {
        int val = this.theme.compareTo(obj.theme);
        if(val != 0) {
            return val;
        } else {
            val = this.date.compareTo(obj.date);
            return val;
        }
    }

    public String toString() {
        return "Тематика: " + this.theme + " / Дата: " + this.date + " / \"" + this.name + "\"";
    }

    public static void main(String[] args) throws IOException {
        Jour();
        InfoCol();
    }

    static {
        buf = new BufferedReader(new InputStreamReader(System.in));
        sc = new Scanner(System.in);
    }
}
