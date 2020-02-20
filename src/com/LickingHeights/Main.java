package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    public static void main(String[] args) {
    drakeEquation();
    }

    public static void drakeEquation() {
/*Drake equation
N = number of intelligent species that can communicate with us
R∗ = 1 yr−1 (1 star formed per year, on the average over the life of the galaxy; this was regarded as conservative)
fp = 0.2 to 0.5 (one fifth to one half of all stars formed will have planets)
ne = 1 to 5 (stars with planets will have between 1 and 5 planets capable of developing life)
fl = 1 (100% of these planets will develop life)
fi = 1 (100% of which will develop intelligent life)
fc = 0.1 to 0.2 (10–20% of which will be able to communicate)
L = 1000 to 100,000,000 years (which will last somewhere between 1000 and 100,000,000 years)
 */
        int N;
        int rStar;
        double f_p;
        int numberOfExoplanets;
        double f_l;
        double f_i;
        double f_c;
        int l;
        Scanner keyboard;
        keyboard =new Scanner(System.in);

        //todo initialize the scanner to take input and commit
        //ask for rStar number store in the rStar variable and commit
        //ask for f_p fraction store in the f_p variable and commit
        //ask for numberOfExoplanets store in the numberOfExoplanets variable and commit
        //ask for f_l fraction store in the f_l variable and commit
        //ask for f_i fraction store in the f_i variable and commit
        //ask for f_c fraction store in the f_c variable and commit
        //ask for l number store in the l variable and commit



        System.out.println("how many stars are formed in the galaxy per year per year?");
        rStar= keyboard.nextInt();
        System.out.println("how many stars formed have planets ?");
        f_p= keyboard.nextDouble();
        System.out.println(" how many planets are capable of developing a life? ");
        numberOfExoplanets=keyboard.nextInt();
    }

}
