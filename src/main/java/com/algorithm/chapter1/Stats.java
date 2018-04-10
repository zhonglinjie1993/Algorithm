package com.algorithm.chapter1;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 背包的典型用例
 */
public class Stats {

    public static void main(String[] args) {
        Bag<Double> doubles = new Bag<Double> ();
        while (!StdIn.isEmpty ()) {
            doubles.add (StdIn.readDouble ());
        }
        int size = doubles.size ();
        double sum = 0.0;
        for (Double x : doubles) {

            sum += x;

        }
        double v = sum / size;
        sum = 0.0;
        for (Double s : doubles) {
            sum += (s - v) * (s - v);
        }
        double sqrt = Math.sqrt (sum / (size - 1));
        StdOut.printf ("mean: %.2f\n", v);
        StdOut.printf ("Std dev: %.2f\n", sqrt);


    }
}
