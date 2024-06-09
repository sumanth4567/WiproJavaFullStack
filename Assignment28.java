public class Assignment28 {
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 8, 5, 10, 12, 25, 1, 6, 8};

        // Remove duplicates
        int[] uniqueArray = removeDuplicates(array);

        // Display the results
        System.out.println("Original array: " + arrayToString(array));
        System.out.println("Array after removing duplicates: " + arrayToString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        // If array is empty or contains a single element
        if (n == 0 || n == 1) {
            return array;
        }

        // Temporary array to store unique elements
        int[] temp = new int[n];
        int j = 0;

        // Traverse the input array
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }
        // Store the last element as it has no next element to compare
        temp[j++] = array[n - 1];

        // Create a new array with the correct size
        int[] uniqueArray = new int[j];
        for (int i = 0; i < j; i++) {
            uniqueArray[i] = temp[i];
        }

        return uniqueArray;
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
