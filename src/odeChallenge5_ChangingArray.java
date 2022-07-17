
class odeChallenge5_ChangingArray {
    public static void main(String[] args) {

    /*
    Create an array of numbers and add them all together using a loop.
    */
        int one = 1;
        int two = 2;
        int thre = 3;
        int three = 3;
        int four = 4;
        int all = one + two + thre + four;
        String[] Y = {"1", "2", "3", "4"};
        while (three < 4) {
            System.out.println(Y[0]);
            System.out.println(Y[1]);
            System.out.println(Y[2]);
            System.out.println(Y[3]);
            three++;

            while (three == 4) {
                System.out.println(all);
                three++;
            }
        }
    }
}
