package Task1;

import java.util.*;

public class Main {

    private static void menu()
    {
        System.out.println("Введіть 1 якщо хочете  вивести данні про всі машини");
        System.out.println("Введіть 2 якщо хочете  всіх об`єктів даного масиву засетити одинаковий  об`єкт");

        System.out.println("------------------------------------------------------------------------------------------");

    }

    static int setRandomValue(int min, int max){
        Random random =  new Random();
        return random.nextInt(max-min+1)+min;
    }


    public static void main(String[] args) {

        Random rand = new Random();

        List <Car> auto1 = new ArrayList<>();

        List<String> material1 = Arrays.asList(new String[]{"Шкіра", "Алькантара", "Дермантин", "Шкірозманник"});



        while (true){
            menu();
            Scanner scanner = new Scanner(System.in);
            String x;
            x=scanner.nextLine();

            switch (x){

                case "1": {

                    for(int i = 0; i < 10; i++) {

                        auto1.add(new Car(setRandomValue(1,10),setRandomValue(10,20), material1.get(rand.nextInt(4)), setRandomValue(50,300),setRandomValue(1980,2021)));

                    }
                    System.out.println(auto1);

                    break;
                }

                case "2":{

                    Car defaultCar = new Car(setRandomValue(1,10),setRandomValue(10,20), material1.get(rand.nextInt(5)), setRandomValue(50,300),setRandomValue(1980,2021));
                    auto1.clear();
                    for (int i=0; i<rand.nextInt(10);i++)
                        auto1.add(defaultCar);

                    System.out.println(auto1);
                    break;

                }
                default:

                    throw new IllegalArgumentException("Unexpected value: " + x );

            }

            }

        }


    }

