import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Исходный массив:");
        ArrayUtils.printArray(array);

        ArrayUtils.mergeSort(array, 0, array.length - 1);
        System.out.println("Отсортированный массив:");
        ArrayUtils.printArray(array);

        int target = array[random.nextInt(array.length)];
        System.out.println("Ищем элемент " + target + " в массиве.");
        int result = ArrayUtils.search(array, target);
        ArrayUtils.getOutput(result, target);
    }
}