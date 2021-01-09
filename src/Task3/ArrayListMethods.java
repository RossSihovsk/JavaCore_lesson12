package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListMethods {

    public static void  addSomething(List list){

        Scanner scanner =   new Scanner(System.in);
        list.add(scanner.nextLine());

    };


    public static  void removeByIndex(List list,int index){

        list.remove(index);


    }

    public static void  displayAll(List list){

        System.out.println(list);

    }


}
