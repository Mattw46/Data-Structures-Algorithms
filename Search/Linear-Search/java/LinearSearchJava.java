import org.junit.jupiter:junit-jupiter;

class LinearSearchJava {

    public static void main() {
        int[] numberList = [1,2,3,4,5,6,7,8];
        int number = 4;
        assert.
    }

    int LinearSearch(int number, int[] numberList) {
        for (int i = 0; i < numberList.length; i++) {
            if (numberList[i] == number) {
                return i;
            }
        }
        return -1;
    }
}

/*
 * 
 * public class LinearSearch {

    public static void main(String[] args) {
        int[] numberList = {1,2,3,4,5,6,7,8};
        int number = 4;

        assert linearSearch(number, numberList) == 3;
        number = 12;
        assert linearSearch(number, numberList) == -1;
        System.out.println("*** Testing Passed ***");
    }

    static int linearSearch(int number, int[] numberList) {
        return -1;
    }
}

 */