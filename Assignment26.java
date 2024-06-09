public class Assignment26{
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 8, 3, 12, 25, 1, 6};

        // Initializing the variables for the two smallest and two largest numbers
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Finding the two smallest numbers
        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        // Finding the two largest numbers
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Display the results
        System.out.println("Smallest number: " + smallest);
        System.out.println("Second smallest number: " + secondSmallest);
        System.out.println("Largest number: " + largest);
        System.out.println("Second largest number: " + secondLargest);
    }
}
