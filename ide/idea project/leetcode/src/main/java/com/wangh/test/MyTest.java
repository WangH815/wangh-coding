package com.wangh.test;


public class MyTest {
    public static void main(String[] args) {
        int[] is = new int[]{6, 1, 7, 9, 0, 2};
        int[][] iss = {{1,2,3},{1,2}};
        for (int i : is) {
            System.out.println(i);
        }

        System.out.println("============");
        for (int i : sortMaopao(is)) {
            System.out.println(i);
        }

        System.out.println("aaa:" + (2+3)/2);

    }

    private static int[] sortMaopao(int[] intArr) {
        int temp;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr.length - i - 1; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }
        return intArr;
    }

    private static int[] sortInsert(int[] intArr){
        for(int i = 0;i <intArr.length;i++){
            if(intArr[i]>intArr[i+1]){

            }
        }
        return null;
    }

}

class FreshJuice {
    enum aa {A, B, C}
}




