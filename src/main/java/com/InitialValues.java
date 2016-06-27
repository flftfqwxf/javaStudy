package com;
class Measurement {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;

    void print() {
        String J = new String("asdf");
        String u = J;
        u = "rrrr";
        System.out.println(
                "Data type      Inital value\n" +
                        "boolean        " + t + "\n" +
                        "char           " + c + "\n" +
                        "byte           " + b + "\n" +
                        "short          " + s + "\n" +
                        "int            " + i + "\n" +
                        "long           " + l + "\n" +
                        "float          " + f + "\n" +
                        "U          " + u + "\n" +
                        "s          " + J + "\n" +
                        "double         " + d);
    }
}

public class InitialValues {
    public static void main(String[] args) {
        Measurement d = new Measurement();
        d.print();
    /* In this case you could also say:
    new Measurement().print();
    */
    }
    void friendPack(){
        System.out.println("friendly");
    }
} ///:~