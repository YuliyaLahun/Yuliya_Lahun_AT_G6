package homework.day2.cycletask;


public class CycleTaskRunner {
    public static void main(String[] args) {

        TrainWhile trainWhile = new TrainWhile();
        trainWhile.whileReturnsNumbers();
        System.out.println();
        System.out.println("_______");

        TrainFor trainFor = new TrainFor();
        trainFor.printOddNumbers();
        System.out.println();

        CreateAndFillArray createAndFillArray = new CreateAndFillArray();
        int[] array = createAndFillArray.createArray();
        System.out.println("_______");

        PrintArray printArray = new PrintArray();
        printArray.printArray(array);
        System.out.println("_______");

        PrintReversedArray printReversedArray = new PrintReversedArray();
        printReversedArray.printReversedArray(array);
        System.out.println("_______");

        PrintArrayMultiplyFive printArrayMultiplyFive = new PrintArrayMultiplyFive();
        printArrayMultiplyFive.arrayMultiplyFive(array);
        System.out.println("_______");

        PrintArraySquare printArraySquare = new PrintArraySquare();
        printArraySquare.printArraySquare(array);
        System.out.println("_______");

        ArraySwapFirstAndLast arraySwapFirstAndLast = new ArraySwapFirstAndLast();
        arraySwapFirstAndLast.swapFirstAndLastElementOfArray(array);
        System.out.println("_______");

        SmallestElementInArray smallestElementInArray = new SmallestElementInArray();
        smallestElementInArray.findSmallestElementInArray(array);
        System.out.println("_______");

        SortingArray sortingArray = new SortingArray();
        sortingArray.sortArray(array, 7);


    }
}
