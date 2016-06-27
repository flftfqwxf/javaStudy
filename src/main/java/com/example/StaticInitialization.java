
package com.example;
import com.order.OrderOfInitialization;

class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Table {
    static Bowl b1 = new Bowl(1);

    Table() {
        System.out.println("Table()");
        b2.f(1);
    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    static Bowl b2 = new Bowl(2);
}


public class StaticInitialization {
    public static void main(String[] args) {
        OrderOfInitialization aa = new OrderOfInitialization();
    }

    static Table t2 = new Table();
    static Table t3 = new Table();
}