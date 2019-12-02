package com.shelterinlaplace;

import org.junit.Test;

import java.util.Scanner;

public class ShelterinLaplaceTest {

    @Test
    public void highAndLowCorners() {
        int dim = 40;
        ShelterinLaplace sim = new ShelterinLaplace(dim,600/dim,100,0,0,100,.01, .01,25);
        double[][] endingWorld = sim.simulate(900);
        new Scanner(System.in).next();
    }

    @Test
    public void highAndLowCornersHiRes() {
        int dim = 100;
        ShelterinLaplace sim = new ShelterinLaplace(dim,600/dim,100,0,0,100,.01,.001,5);
        double[][] endingWorld = sim.simulate(10000);
        new Scanner(System.in).next();
    }

    @Test
    public void oneHighCorner() {
        int dim = 40;
        ShelterinLaplace sim = new ShelterinLaplace(dim,600/dim,0,100,0,0,.01,.01,25);
        double[][] endingWorld = sim.simulate(900);
        new Scanner(System.in).next();
    }

    @Test
    public void threeHighCorners() {
        int dim = 40;
        ShelterinLaplace sim = new ShelterinLaplace(dim,600/dim,100,100,100,0,.01,.01,25);
        double[][] endingWorld = sim.simulate(900);
        new Scanner(System.in).next();
    }

    @Test
    public void adjacentHighCorners() {
        int dim = 40;
        ShelterinLaplace sim = new ShelterinLaplace(dim,600/dim,100,100,0,0,.01,.01,25);
        double[][] endingWorld = sim.simulate(900);
        new Scanner(System.in).next();
    }
}