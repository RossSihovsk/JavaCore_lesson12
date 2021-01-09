package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application extends ArrayListMethods {

   static List testList = new ArrayList();

    boolean isEmpty(){
        boolean bool = (testList.size()<1);
        return bool;
    }

      void menu(){
        System.out.println("Натисність 1 щоб додати новий елемент в список");
        System.out.println("Натисність 2 щоб видалити елемент за індексом");
        System.out.println("Натисніть 3 щоб провірити актуальний вміст списку");
        System.out.println("---------------------------------------------------");

        Scanner scanner =  new Scanner(System.in);
        String s = scanner.nextLine();



        switch (s){

            case "1":{
                System.out.println("Введіть що хочете добавити в лист");
                addSomething(testList);
                System.out.println("---------------------------------------------------");
                break;

            }

            case "2":{
                if (isEmpty()){
                    try{
                        throw new EmtyListException("Ви не можете видалити данні з пустого списку! Спочатку заповність його!");
                    }
                    catch (EmtyListException exception){
                        System.out.println(exception.getMessage());
                        System.out.println("---------------------------------------------------");
                        return;
                    }
                }

                System.out.println("Введіть індекс ");
                int index = scanner.nextInt();
                removeByIndex(testList,index);
                System.out.println("Видалення пройшло успішно!");
                System.out.println("---------------------------------------------------"); break;
            }
            case"3":{
                if (isEmpty()){
                    try{
                        throw new EmtyListException("Список порожній");
                    }
                    catch (EmtyListException exception){
                        System.out.println(exception.getMessage());
                        System.out.println("---------------------------------------------------");
                        break;

                    }
                }
                else if (!isEmpty()){  System.out.println(testList);
                    System.out.println("---------------------------------------------------");
                    break;
                }

            }
            default:{
                try{throw new IllegalArgumentException("Для такого символа немає запрограмованих дій. Виберіть щось зі списку");}
                catch (IllegalArgumentException exception){
                    System.out.println(exception.getMessage());
                    System.out.println("---------------------------------------------------");
                    break;
                }
            }
        }

    }

    public static void main(String[] args){

        while (true){
            Application application = new Application();
            application.menu();
        }

    }

}
