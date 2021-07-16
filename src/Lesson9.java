public class Lesson9 {

    public static void main(String[] args) {

        int[] firstArray = new int[3];
        firstArray[0] = 55;
        firstArray[1] = 1900;
        firstArray[2] = 1;

        System.out.println("This is the first element: " + firstArray[0]);
        System.out.println("I want to get 1900, here it is: " + firstArray[1]);

//        Short hand array initialization
        int[] temperatures = {33, 34, 31, 30, 29, 28, 36};
        System.out.println("This is the temperature for Friday: " + temperatures[4]);
        System.out.println("In temperature array we have " + temperatures.length + "elements.");
        System.out.println("Last element in array is " + temperatures[temperatures.length - 1]);

        int[] weatherForecast = new int[7];
        weatherForecast[0] = 29;
        weatherForecast[1] = 31;
        weatherForecast[2] = 30;
//       int weatherForecast = {29, 31, 30};
        weatherForecast[4] = 37;
        weatherForecast[5] = 30;
        weatherForecast[6] = 19;

        double averageTemperature =
                (weatherForecast[0] + weatherForecast[1] + weatherForecast[2] + weatherForecast[3] +
                        weatherForecast[4] + weatherForecast[5] + weatherForecast[6]) / 7d;
        System.out.println("Average temperature for the week is: " + averageTemperature + " degreees");


//        Loops
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello,you are in an iteration" + i);
        }
//        infinite loop
//        for (int i = 0; i < 10; i--) {
//            System.out.println("New iteration:" +i);
//        }


//        write a loop that starts at 85 and run 10 times
        for (int i = 85; i < 95; i++) {
            System.out.println("Loop iteration" + i);
        }
//        loop that starts with 53 and runs for 100 times, goes negatively
        for (int i = 53; i > -47; i--) {
            System.out.println("Loop iteration" + i);
        }

        int counter = 0;
        for (int i = 59; i < 1005; i++) {
            System.out.println("This is iteration nr." + counter);
            counter++;
        }
        counter = 1;
        for (int currentTime = 8; currentTime < 12; currentTime++) {
            System.out.println("Bom! Bom! it is " + currentTime + " o'clock.");
            System.out.println("This is the" + counter + " time the clock alarm.");
            counter++;

//        Arrays+ Loops
            int[] grades = {8, 9, 7, 8, 9, 9, 5, 1, 2, 10, 6, 6, 9, 10, 4, 8, 5, 4, 6, 10};
            int gradeSum = 0;

            for (int i = 0; i < grades.length; i++) {
                gradeSum += grades[i];
            }

            System.out.println("Sum of all the grades is: " + gradeSum);

            double averageGrade = gradeSum / (double) grades.length;
            System.out.println("The average grade is: " + averageGrade);

            boolean[] arrayofBooleans = {true, false, false, true};

            String[] arrayOfString = {"Message A", "Message B", "MessageC"};

            double[] monthlySalary = {1000, 1100, 1200d, 1300d, 1400d};

            String[] students = {"Artjoms", "Laura", "Oksana", "Tatjana"};

//        Circle K coffee
            for (int i = 0; i < 10000; i++) {
                if (i % 7 == 0) {
                    System.out.println("This coffee is for free");
                } else {
                    System.out.println("You neeed to pay for the coffee" + 1);

                }
            }
        }


    }
}
