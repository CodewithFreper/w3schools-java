public class ArraysExamples {

    static void main(String[] args) {
        // 1. program that calculates the average of different ages

        int [] ages = {22, 45, 17, 12, 45, 47, 55, 87, 45};

        double avg, sum=0;
        int length = ages.length;

        for (int i = 0; i < ages.length; i++) {
            sum = sum + ages[i];
        }

        avg = sum/length;

        System.out.println("Average: " + avg);

        // 2. program that finds the lowest age among different ages
        int lowestAge = ages[0];

        for (int age: ages) {
            if (age < lowestAge) {
                lowestAge = age;
            }
        }

        System.out.println("Lowest age: " + lowestAge);

        // 3. program that counts repeated ages
        /*int repeats = 0;

        for (int i = 0; i<ages.length; i++) {
            int num = ages[i];
            for (int j=1; j<ages.length;j++) {
                if num == age[j]
            }
        }*/

    }
}
