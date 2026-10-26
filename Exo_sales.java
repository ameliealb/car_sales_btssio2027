import java.util.Scanner;

public class Exo_sales {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        String [] employee = {"André", "Ingemar", "Jean-J", "Cindy", "Joey"};
        String [] model = {"Twingo", "Clio", "Mégane", "Vel Satis"};

        int [][] arraySales = new int[employee.length][model.length] ;

        for(int i = 0 ; i < employee.length ; i++){
            System.out.println("Saisissez le nombre de ventes effectuées par l'employé.e " + employee[i]);

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
    }
}
