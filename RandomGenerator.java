package lesson12;

public class RandomGenerator {

    public static void main(String[] args) {
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
        System.out.println(rand7());
    }

    public static int rand5() {
        return (int) (Math.random() * 5);
    }

    public static int rand7() {
        int randNum;
        while (true) {
            randNum = 5 * rand5() + rand5();
            if (randNum < 21) {
                return randNum % 7;
            }
            else randNum = rand5();
        }
    }

}
