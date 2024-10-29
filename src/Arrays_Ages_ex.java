public class Arrays_Ages_ex {
    public static void main(String[] args) {
        int[] ages = {10, 20, 25, 34, 56, 78, 90};
        // get the sum of ages
        double sum = 0;
        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
        }
        System.out.println(sum);
        //get the average of ages
        double average = sum / ages.length;
        System.out.println("--------------");
        System.out.println(average);

        //print out the smallest age
        int lowest = ages[0];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < lowest) {
                lowest = ages[i];
            }
        }

        System.out.println("The Lowest Age is: " + lowest);
    }
}
