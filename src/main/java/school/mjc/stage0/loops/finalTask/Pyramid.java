package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int nsp = cathetusLength - 1;
        int nnu = 1;

        for (int i = 1; i <= cathetusLength; i++) {

            for (int j = 0; j < nsp; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= nnu / 2; j++) {
                if (j == nnu / 2) {
                    System.out.print(1);
                } else {
                    System.out.print(i - j);
                }
            }
            for (int j = 0; j < nnu / 2; j++) {
                System.out.print(j + 2);
            }
            System.out.println();
            nsp -= 1;
            nnu += 2;
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
