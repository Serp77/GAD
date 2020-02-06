package Fitnes;

import javax.swing.*;

public class Fitnes {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            ivan = ivan * 3;
            nik = nik * 2;
            month = month + 1;
        }
        return month;
    }

    public static void main(String[] args) {
        System.out.println (calc(30, 50));
    }
}