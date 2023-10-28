import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;



public class Sort {



    private int[] tab = new int[10];



    public void bubbleSort(String direction ){

        for (int i = 0; i < tab.length -1; i++){

            for(int j = 0; j < tab.length - i - 1; j++){

                if (direction.equals("ASC")){

                    if (tab[j] > tab[j + 1]) {

                        int temp = tab[j];

                        tab[j] = tab[j + 1];

                        tab[j + 1] = temp;

                    }

                    else if(direction.equals("DESC")) {

                        if (tab[j] < tab[j + 1]){

                            int temp = tab[j];

                            tab[j] = tab[j +1];

                            tab[j + 1]= temp;

                        }

                    }



                }

            }

        }



    }

    public void selectingSort(String direction){

        for (int i = 0; i < tab.length - 1; i++){

            int minIndex = i;

            for(int j = i +1; j < tab.length; j++){

                if (direction.equals("ASC")) {

                    if (tab[minIndex] > tab[j]){

                        minIndex = j;

                    }

                } else if (direction.equals("DESC")){

                    if (tab[minIndex] < tab[j]){

                        minIndex = j;

                    }

                }



            }

            int temp = tab[i];

            tab[i] = tab[minIndex];

            tab[minIndex] = temp;





        }







    }

    public void getNumbers(){

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Wybierz sposób wprowadzenia liczb");

        System.out.println("1.Wylosuj liczby");

        System.out.println("2:Wprowadz");

        int choice = scanner.nextInt();

        switch (choice){

            case 1:

                for (int i = 0; i < tab.length; i++) {

                    tab[i] = random.nextInt(100);

                }

                break;

            case 2:

                for(int i = 0; i < tab.length; i++){

                    System.out.print((i + 1) + ": ");

                    tab[i] = scanner.nextInt();

                }

                break;

            default:

                System.out.println("Nieprawidłowy wybór.");



        }

    }

    public static void main(String[] args) {

        Sort sort = new Sort();

        sort.getNumbers();

        System.out.println("Tablica przed sortowaniem: " + Arrays.toString(sort.tab));

        sort.bubbleSort("ASC");

        System.out.println("Tablica po sortowaniu bąbelkowym rosnąco: " + Arrays.toString(sort.tab));

        sort.selectingSort("DESC");

        System.out.println("Tablica po sortowaniu przez wybieranie malejąco: " + Arrays.toString(sort.tab));

    }

}