// Base class A with a simple show() method
class A {
    // Method to display a message for class A
    void show() {
        System.out.println("class A");
    }
}

// Class B extends A and overrides the show() method
class B extends A {
    // Overriding the show() method to display a message for class B
    @Override
    void show() {
        System.out.println("class B");
    }
}

// Main class to demonstrate upcasting and dynamic method dispatch
class Upcasting {
    public static void main(String[] args) {
        // Upcasting: B object is referenced by a variable of type A.
        A obj = new B();

        // When calling obj.show(), the overridden method in class B is executed.
        obj.show();
    }
}
