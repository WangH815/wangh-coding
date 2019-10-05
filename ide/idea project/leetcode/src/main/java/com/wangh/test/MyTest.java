package com.wangh.test;


public class MyTest {
    public static void main(String[] args) {
        int[] is = {6, 1, 7, 9, 0, 2};
        for (int i : is) {
            System.out.println(i);
        }

        System.out.println("============");
        for (int i : sortMaopao(is)) {
            System.out.println(i);
        }

    }

    private static int[] sortMaopao(int[] inta) {
        int temp;
        for (int i = 0; i < inta.length; i++) {
            for (int j = 0; j < inta.length - i - 1; j++) {
                if (inta[j] > inta[j + 1]) {
                    temp = inta[j];
                    inta[j] = inta[j + 1];
                    inta[j + 1] = temp;
                }
            }
        }

        return inta;
    }

}

class FreshJuice {
    enum aa {A, B, C}
}




