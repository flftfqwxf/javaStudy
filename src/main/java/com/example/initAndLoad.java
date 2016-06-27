package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;

class Insect {
    int i = 9;
    int j;
    Insect() {
        System.out.println("Insect");
        prt("i = " + i + ", j = " + j);
        j = 39;
    }
    static int x1 =
            prt("static Insect.x1 initialized");
    static int prt(String s) {
        System.out.println(s);
        return 47;
    }
}

@SpringBootApplication
public class initAndLoad extends Insect {
    int k = prt("initAndLoad.k initialized");
    initAndLoad() {
        prt("k = " + k);
        prt("j = " + j);
    }
    static int x2 =
            prt("static initAndLoad.x2 initialized");
    static int prt(String s) {
        System.out.println(s);
        return 63;
    }
    public static void main(String[] args) {
        prt("initAndLoad constructor");
        initAndLoad b = new initAndLoad();
    }
}