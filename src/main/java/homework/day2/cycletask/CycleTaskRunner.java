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

        System.out.println("print reversed array");
        PrintReversedArray printReversedArray = new PrintReversedArray();
        printReversedArray.printReversedArray(array);
        printReversedArray.printReversedArrayStream(array);
        System.out.println("_______");

        System.out.println("print array multiply 5");
        PrintArrayMultiplyFive printArrayMultiplyFive = new PrintArrayMultiplyFive();
        printArrayMultiplyFive.arrayMultiplyFive(array);
        printArrayMultiplyFive.printStreamMultiplyFive(array);
        System.out.println("_______");


        System.out.println("print array square");
        PrintArraySquare printArraySquare = new PrintArraySquare();
        printArraySquare.printArraySquare(array);
        printArraySquare.printArraySquareStream(array);
        System.out.println("_______");

        System.out.println("Swap first and last elements of array: ");
        ArraySwapFirstAndLast arraySwapFirstAndLast = new ArraySwapFirstAndLast();
        arraySwapFirstAndLast.swapFirstAndLastElementOfArray(array);
        arraySwapFirstAndLast.swapFirstAndLastElementOfArrayCollection(array);
        System.out.println("_______");

        System.out.println("smallest element in array");
        SmallestElementInArray smallestElementInArray = new SmallestElementInArray();
        smallestElementInArray.findSmallestElementInArray(array);
        smallestElementInArray.findSmallestElementInArrayStream(array);
        System.out.println("_______");

        System.out.println("Sortingarray: ");
        SortingArray sortingArray = new SortingArray();
        sortingArray.sortArray(array, 7);
        sortingArray.sortArrayByStream(array);


    }
}
