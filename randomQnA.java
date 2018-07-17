import java.util.ArrayList;
import java.util.Random;

public class randomQnA {

    String numArr[] = {"1", "2", "3", "4", "5", "6"};
    String symbolArr[] = {"+", "-", "/", "*"};

    ArrayList<String> qArr = new ArrayList<String>();

    int symbolIndex;
    int numIndex;
    int randArr_Size;
    int answer;
    int level;

    randomQnA(int level){

        this.level=level;
    }

    public static void main(String args[]) {

        new randomQnA(1).generateQandA();
        new randomQnA(1).generateQandA();
        new randomQnA(1).generateQandA();
        new randomQnA(1).generateQandA();
        new randomQnA(1).generateQandA();
        new randomQnA(1).generateQandA();

        System.out.println();

        new randomQnA(2).generateQandA();
        new randomQnA(2).generateQandA();
        new randomQnA(2).generateQandA();
        new randomQnA(2).generateQandA();
        new randomQnA(2).generateQandA();
        new randomQnA(2).generateQandA();

        System.out.println();

        new randomQnA(3).generateQandA();
        new randomQnA(3).generateQandA();
        new randomQnA(3).generateQandA();
        new randomQnA(3).generateQandA();
        new randomQnA(3).generateQandA();
        new randomQnA(3).generateQandA();
        new randomQnA(3).generateQandA();

        System.out.println();

        new randomQnA(4).generateQandA();
        new randomQnA(4).generateQandA();
        new randomQnA(4).generateQandA();
        new randomQnA(4).generateQandA();
        new randomQnA(4).generateQandA();
        new randomQnA(4).generateQandA();

 	System.out.println();

    }


    public void generateQandA() {

        generateQuestion(level);

        for (String x : qArr) {

            System.out.print(x + " ");

        }

        solve(0, qArr);

    }


    public void generateQuestion(int level) {


        /*
        * novice - exactly 2 integers
        * easy - max 3  , 2..3 integers
        * medium - max 4 , 2...4 integers
        * guru -max 6 , min 4 , 4...6 integers
        * */


        switch (level){


            case(1):

                randArr_Size = 5;

                break;

            case(2):

                randArr_Size =  (int)(Math.random() * ((7 - 5) + 1))+5;

                break;

            case(3):

                randArr_Size =  (int)(Math.random() * ((9 - 5) + 1))+5;

                break;

            case(4):

                randArr_Size =  (int)(Math.random() * ((11 - 9) + 1))+9;

                break;
        }


        if (randArr_Size % 2 == 0) {

            generateQuestion(level);

        } else if (randArr_Size % 2 != 0) {

            numIndex = (int) (Math.random() * (numArr.length - 1)) + 1;

            qArr.add(numArr[numIndex]);

            for (int x = 1; x < randArr_Size / 2; x++) {

                symbolIndex = (int) new Random().nextInt(symbolArr.length);

                qArr.add(symbolArr[symbolIndex]);

                numIndex = (int) new Random().nextInt(numArr.length);

                qArr.add(numArr[numIndex]);

            }


        }

    }

    public void solve(int n, ArrayList<String> list) {

        if (n == 0) {

            answer = answer + Integer.parseInt(list.get(n));
            solve(n + 2, list);
        } else {

            int symbolIndex = n - 1;

            switch (list.get(symbolIndex)) {

                case ("+"):

                    answer = answer + Integer.parseInt(list.get(n));

                    break;

                case ("-"):

                    answer = answer - Integer.parseInt(list.get(n));

                    break;

                case ("/"):

                    answer = answer / Integer.parseInt(list.get(n));
                    break;

                case ("*"):

                    answer = answer * Integer.parseInt(list.get(n));

                    break;

            }

            if (n + 2 <= list.size()) {

                solve(n + 2, list);

            } else {

                System.out.println();
                System.out.println("answer : " + answer);

            }

        }
    }

}
