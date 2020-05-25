package com.wangh.code.leetcode.p0001_0100;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class L_0036_ValidSudoku {

    public static void main(String[] args) {

    }

    public static boolean isValidSudoku1(char[][] board) {
        //判断每一行
        for (int i = 0; i < 9; i++) {
            if (!isValidRows1(board[i])) {
                return false;
            }
        }
        //判断每一列
        for (int i = 0; i < 9; i++) {
            if (!isValidCols1(i, board)) {
                return false;
            }
        }
        //判断每个小棋盘
        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                if (!isValidSmall1(i, j, board)) {
                    return false;
                }
            }

        }
        return true;
    }

    public static boolean isValidRows1(char[] board) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : board) {
            if (c != '.') {
                if (hashMap.getOrDefault(c, 0) != 0) {
                    return false;
                } else {
                    hashMap.put(c, 1);
                }
            }
        }
        return true;
    }

    public static boolean isValidCols1(int col, char[][] board) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            char c = board[i][col];
            if (c != '.') {
                if (hashMap.getOrDefault(c, 0) != 0) {
                    return false;
                } else {
                    hashMap.put(c, 1);
                }
            }
        }
        return true;
    }

    public static boolean isValidSmall1(int row, int col, char[][] board) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char c = board[row + i][col + j];
                if (c != '.') {
                    if (hashMap.getOrDefault(c, 0) != 0) {
                        return false;
                    } else {
                        hashMap.put(c, 1);
                    }
                }
            }
        }
        return true;
    }

    public static boolean isValidSudoku2(char[][] board) {
        Set seen = new HashSet();
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] != '.') {
                    String b = "(" + board[i][j] + ")";
                    if (!seen.add(b + i) || !seen.add(j + b) || !seen.add(i / 3 + b + j / 3))
                        return false;
                }
            }
        }
        return true;
    }

    // 同isValidSudoku2，增加备注
    public static boolean isValidSudoku3(char[][] board) {
        Set seen = new HashSet();
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                char number = board[i][j];
                if (number != '.')
                    if (!seen.add(number + " in row " + i) ||
                            !seen.add(number + " in column " + j) ||
                            !seen.add(number + " in block " + i / 3 + "-" + j / 3))
                        return false;
            }
        }
        return true;
    }

}
