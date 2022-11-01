import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        boolean gamePlay = true;
        int randomNumber = (int) Math.round(Math.random() * 100);
        System.out.println("Välkommen till Gissa Numret!");
        System.out.println();
        System.out.println("Ange ett tal mellan 1 och 100");

        while (gamePlay) {

            int guess = scanner.nextInt();

            if (isCorrect(guess, randomNumber) == true){
                counter++;
                System.out.println("Försök nummer: " + counter);
                counter = 0;
                System.out.println();
                randomNumber = (int) Math.round(Math.random()*100);
                System.out.println("Ange ett tal mellan 1 och 100");
                guess = scanner.nextInt();
                isCorrect(guess,randomNumber);

            }

            counter++;
            System.out.println("Försök nummer: " + counter);
        }
    }
    static boolean isCorrect(int x, int y){

        if (x < y){
            System.out.println("Din gissning är mindre än mitt nummer");
            return false;
        } else if (x > y) {
            System.out.println("Din gissing är större än mitt nummer");
            return false;
        }
        else {
            System.out.println("Grattis du har hittat rätt nummer.");
            return true;
        }

    }

    }



