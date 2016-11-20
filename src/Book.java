/**
 * Created by mrhri on 20.11.2016.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Book implements Comparable<Book> {
    String name;
    String genre;
    String author;
    static List<Book> colBook = new ArrayList();
    static String[] GenreArray = new String[]{"Видения", "Драма", "Лирика", "Новелла", "Ода", "Опус", "Очерк", "Повесть", "Пьеса", "Рассказ", "Роман", "Скетч", "Сказка", "Эпопея,", "Эпос", "Эссе", "Комедия", "Трагедия", "Эпическая"};
    static BufferedReader buf;
    static Scanner sc;

    public Book(String name, String genre, String author) {
        this.name = name;
        this.genre = genre;
        this.author = author;
    }

    public static void Boo() throws IOException {
        boolean ans = true;
        System.out.println("Сколько книг Вы хотите положить?");
        int count = sc.nextInt();

        for(String[] boo = new String[count]; ans; ans = false) {
            for(int i = 0; i < boo.length; ++i) {
                System.out.println("Введите даные книги №" + (i + 1));
                System.out.println("Введите название книги:");
                String n = buf.readLine();
                boo[i] = n;
                System.out.println("Укажите жанр книги (введите соответствующее число):");

                for(int d = 0; d < GenreArray.length; ++d) {
                    System.out.println(d + 1 + ". " + GenreArray[d]);
                }

                String var11 = buf.readLine();
                byte auth = -1;
                switch(var11.hashCode()) {
                    case 49:
                        if(var11.equals("1")) {
                            auth = 0;
                        }
                        break;
                    case 50:
                        if(var11.equals("2")) {
                            auth = 1;
                        }
                        break;
                    case 51:
                        if(var11.equals("3")) {
                            auth = 2;
                        }
                        break;
                    case 52:
                        if(var11.equals("4")) {
                            auth = 3;
                        }
                        break;
                    case 53:
                        if(var11.equals("5")) {
                            auth = 4;
                        }
                        break;
                    case 54:
                        if(var11.equals("6")) {
                            auth = 5;
                        }
                        break;
                    case 55:
                        if(var11.equals("7")) {
                            auth = 6;
                        }
                        break;
                    case 56:
                        if(var11.equals("8")) {
                            auth = 7;
                        }
                        break;
                    case 57:
                        if(var11.equals("9")) {
                            auth = 8;
                        }
                        break;
                    case 1567:
                        if(var11.equals("10")) {
                            auth = 9;
                        }
                        break;
                    case 1568:
                        if(var11.equals("11")) {
                            auth = 10;
                        }
                        break;
                    case 1569:
                        if(var11.equals("12")) {
                            auth = 11;
                        }
                        break;
                    case 1570:
                        if(var11.equals("13")) {
                            auth = 12;
                        }
                        break;
                    case 1571:
                        if(var11.equals("14")) {
                            auth = 13;
                        }
                        break;
                    case 1572:
                        if(var11.equals("15")) {
                            auth = 14;
                        }
                        break;
                    case 1573:
                        if(var11.equals("16")) {
                            auth = 15;
                        }
                        break;
                    case 1574:
                        if(var11.equals("17")) {
                            auth = 16;
                        }
                        break;
                    case 1575:
                        if(var11.equals("18")) {
                            auth = 17;
                        }
                        break;
                    case 1576:
                        if(var11.equals("19")) {
                            auth = 18;
                        }
                }

                switch(auth) {
                    case 0:
                        boo[i] = GenreArray[0];
                        break;
                    case 1:
                        boo[i] = GenreArray[1];
                        break;
                    case 2:
                        boo[i] = GenreArray[2];
                        break;
                    case 3:
                        boo[i] = GenreArray[3];
                        break;
                    case 4:
                        boo[i] = GenreArray[4];
                        break;
                    case 5:
                        boo[i] = GenreArray[5];
                        break;
                    case 6:
                        boo[i] = GenreArray[6];
                        break;
                    case 7:
                        boo[i] = GenreArray[7];
                        break;
                    case 8:
                        boo[i] = GenreArray[8];
                        break;
                    case 9:
                        boo[i] = GenreArray[9];
                        break;
                    case 10:
                        boo[i] = GenreArray[10];
                        break;
                    case 11:
                        boo[i] = GenreArray[11];
                        break;
                    case 12:
                        boo[i] = GenreArray[12];
                        break;
                    case 13:
                        boo[i] = GenreArray[13];
                        break;
                    case 14:
                        boo[i] = GenreArray[14];
                        break;
                    case 15:
                        boo[i] = GenreArray[15];
                        break;
                    case 16:
                        boo[i] = GenreArray[16];
                        break;
                    case 17:
                        boo[i] = GenreArray[17];
                        break;
                    case 18:
                        boo[i] = GenreArray[18];
                }

                String genreb = boo[i];
                System.out.println("Введите автора книги:");
                String var12 = buf.readLine();
                boo[i] = var12;
                colBook.add(new Book(n, genreb, var12));
                if(i == count - 1) {
                    break;
                }

                System.out.println("Добавить еще одну книгу?\n1. Да\n2. Нет");
                String quest = buf.readLine();
                byte var10 = -1;
                switch(quest.hashCode()) {
                    case 49:
                        if(quest.equals("1")) {
                            var10 = 0;
                        }
                        break;
                    case 50:
                        if(quest.equals("2")) {
                            var10 = 1;
                        }
                }

                switch(var10) {
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
        Collections.sort(colBook, Book::compareTo);
        int size = colBook.size();

        for(int i = 0; i < size; ++i) {
            System.out.println(((Book)colBook.get(i)).toString());
        }

    }

    public int compareTo(Book obj) {
        int val = this.genre.compareTo(obj.genre);
        if(val != 0) {
            return val;
        } else {
            val = this.author.compareTo(obj.author);
            if(val != 0) {
                return val;
            } else {
                val = this.name.compareTo(obj.name);
                return val;
            }
        }
    }

    public String toString() {
        return "Жанр: " + this.genre + " / Автор: " + this.author + " / \"" + this.name + "\"";
    }

    static {
        buf = new BufferedReader(new InputStreamReader(System.in));
        sc = new Scanner(System.in);
    }
}
