import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mrhri on 20.11.2016.
 */
/*
В библиотеке хранятся журналы, газеты и книги. У книг есть автор, название и жанр, у журналов есть название,
номер(дата выпуска) и тематика, у газет – название и номер(дата выпуска).
Нужно написать программу для каталогизации, которая запрашивает у пользователя данные:
сначала запрашивает тип записи ( т. е. книга, журнал, газета и далее все необходимые поля для этой записи ).
Далее следующую запись и так далее пока пользователь не выберет окончание ввода.
После чего нужно вывести каталог отсортированный в следующем порядке:
сначала газеты по алфавиту и по дате выпуска, затем журналы по тематике,
по алфавиту и дате выпуска, затем книги по жанрам, по авторам (по алфавиту) и по названиям ( по алфавиту).
 */
public class Library {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {

        System.out.println("Добро пожаловать в библиотеку!\nПоложите что нибудь в нашу коллекцию и мы её отсортируем.");
        Menu();

    }

    public static void Menu() throws IOException {
        System.out.println("Введите номер типа, который вы хотите добавить:");
        System.out.println("1. Книга\n2. Газета\n3. Журнал\n");
        String type = reader.readLine();

        switch (type){
            case "1" :
                Book.Boo();
                System.out.println("Теперь положите газеты...");
                Gazeta.Gaz();
                System.out.println("Теперь положите журналы...");
                Journal.Jour();
                System.out.println("");
                System.out.println("Газеты:");
                Gazeta.InfoCol();
                System.out.println("");
                System.out.println("Журналы:");
                Journal.InfoCol();
                System.out.println("");
                System.out.println("Книги:");
                Book.InfoCol();
                break;
            case "2" :
                Gazeta.Gaz();
                System.out.println("Теперь положите книги...");
                Book.Boo();
                System.out.println("Теперь положите журналы...");
                Journal.Jour();
                System.out.println("");
                System.out.println("Газеты:");
                Gazeta.InfoCol();
                System.out.println("");
                System.out.println("Журналы:");
                Journal.InfoCol();
                System.out.println("");
                System.out.println("Книги:");
                Book.InfoCol();
                break;
            case "3" :
                Journal.Jour();
                System.out.println("Теперь положите газеты...");
                Gazeta.Gaz();
                System.out.println("Теперь положите книги...");
                Book.Boo();
                System.out.println("");
                System.out.println("Газеты:");
                Gazeta.InfoCol();
                System.out.println("");
                System.out.println("Журналы:");
                Journal.InfoCol();
                System.out.println("");
                System.out.println("Книги:");
                Book.InfoCol();
                break;
            default:
                Menu();
                break;
        }
    }

}
