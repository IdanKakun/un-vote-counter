package com.idan;

import java.util.Scanner;

public class UnVoteCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pro = 0, against = 0, abstain = 0, input = 0;
        boolean IsVoted = false;
        for (int i = 0; i < 10 && !IsVoted; i++) {
            System.out.println("Please enter your answer for the vote:\n 1- pro \n 2- against \n 3- Avoid \n 4- Veto");
            input = scanner.nextInt();
            if (input == 4) {
                System.out.println("Country number:" + i + " vetoed");
                IsVoted = true;;break;
            } else {
                if (input == 1) {
                    pro++;
                } else {
                    if (input == 2) {
                        against++;
                    }
                }

                if (input == 3) {
                    abstain++;
                }
            }
        }  System.out.println(pro + " countries voted 'pro'\n" + against + " countries voted 'against'\n" + abstain + " countries voted 'avoid'");
    }
}
