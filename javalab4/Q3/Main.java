class Apple {
    void show() {
        System.out.println("This is the show() method of Apple class.");
    }
}

class Banana extends Apple {
    @Override
    void show() {
        System.out.println("This is the show() method of Banana class.");
    }
}

class Cherry extends Apple {
    @Override
    void show() {
        System.out.println("This is the show() method of Cherry class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Apple ref;

        ref = new Apple();
        ref.show();

        ref = new Banana();
        ref.show();

        ref = new Cherry();
        ref.show();
    }
}

