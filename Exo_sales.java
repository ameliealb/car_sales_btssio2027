import java.util.Scanner;

public class Exo_sales {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        String [] employee = {"André", "Ingemar", "Jean-J", "Cindy", "Joey"};
        String [] model = {"Twingo", "Clio", "Mégane", "Vel Satis"};

        int [][] arraySales = new int[employee.length][model.length] ;

        int [] carPrice = new int[model.length] ;

        for(int c = 0 ; c < model.length ; c++){
            System.out.println("Saisissez le prix de : " + model[c]);

            carPrice[c] = scan.nextInt();
        }

        for(int i = 0 ; i < employee.length ; i++){
            System.out.println("Saisissez le nombre de ventes effectuées par l'employé.e " + employee[i]);

            int totalSales = 0;

            for(int j = 0 ; j < model.length ; j++){
                System.out.println("Par modèle :" + model[j]);

                arraySales[i][j] = scan.nextInt();
            }

        }

        System.out.print("\t\t"); //tabulations
        for (int j = 0; j < model.length; j++) {
            System.out.print(model[j] + "\t");
        }
        System.out.println(); //start to a new line

        // a line for each employee
        for (int i = 0; i < employee.length; i++) {
            System.out.print(employee[i] + "\t\t");
            for (int j = 0; j < model.length; j++) {
                System.out.print(arraySales[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int j = 0 ; j < model.length ; j++){
            int totalSales = 0 ;

            for (int i = 0 ; i < employee.length ; i++){
                totalSales = totalSales += arraySales[i][j];
            }

            System.out.print(totalSales + " ");
        }

        int globalSales = 0;

        System.out.println("Chiffre d'affaires par voiture : ");

        for (int i = 0 ; i < employee.length ; i++){
            int salesByCar = 0;

            for (int j = 0 ; j < model.length ; j++){
                salesByCar += arraySales[i][j] * carPrice[j];
            }

            System.out.println("Chiffre d'affaires pour l'employé.e " + employee[i] + " : " + salesByCar);

            globalSales += salesByCar;
        }

        System.out.println("Chiffre d'affaires total : " + globalSales);

    }
}
