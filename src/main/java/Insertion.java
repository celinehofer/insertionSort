public class Insertion {

    public void sort(int[] listOfNumbers) {
        for (int i = 1; i < listOfNumbers.length; i++) {
            int value = listOfNumbers[i];
            int j = i;
            while ((j > 0) && (listOfNumbers[j - 1] > value)) {
                listOfNumbers[j] = listOfNumbers[j - 1];
                j--;
            }
            listOfNumbers[j] = value;
        }
    }
}
