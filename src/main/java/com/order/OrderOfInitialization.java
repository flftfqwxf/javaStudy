package com.order;
class Tag {
    Tag(int marker) {
        System.out.println("Tag(" + marker + ")");
    }
}

class Card {
    Tag t1 = new Tag(1); // Before constructor
    Card() {
        // Indicate we're in the constructor:
        System.out.println("Card()");
        t3 = new Tag(33); // Re-initialize t3
    }
    Tag t2 = new Tag(2); // After constructor
    void f() {
        System.out.println("f()");
    }
    Tag t3 = new Tag(3); // At end
}

public class OrderOfInitialization {
   public OrderOfInitialization(){
        Card t = new Card();
        t.f(); // Shows that construction is done
        System.out.println("t55");

    }
   protected void orderOut(){
        System.out.println("orderOut");
    }

} ///:~jav