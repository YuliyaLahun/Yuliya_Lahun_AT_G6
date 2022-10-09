public class ClassWithDifficultArray {

    //{{1,2,3},
    // {4,5,6},
    // {7,8,9}}
    public void printMyArray() {

        int[][] bigArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.print("{");
        int counterForBig = 0;

        for (int[] innerArray : bigArray) {
            int counterForInner = 0;
            System.out.print("{");

            for (int element : innerArray) {
                if (counterForInner < innerArray.length - 1) {
                    System.out.print(element + ",");
                } else {
                    System.out.print(element);
                }
                counterForInner++;
            }

            if (counterForBig < bigArray.length - 1) {
                System.out.print("},");
            } else
                System.out.print("}}");

            System.out.println();
            counterForBig++;

        }
    }
}
