package challanges;

public class Numbers {

    public static void printNumbers(int input){

        Integer[] intTable = new Integer[input];

        for(int i = 1; i <= input; i++){
            intTable[i-1] = i;
        }

        for (Integer integer : intTable) {
            System.out.println("Numbers up to given integer are: " + integer);
        }
    }
}
