public class StaticBlock {
    public String car;
    public String color;

    static {
        System.out.println("In SB 1");
    }

    static {
        System.out.println("In SB 2");
    }

    static {
        System.out.println("In SB 3");
    }

    static {
        System.out.println("In SB 4");
    }

    static {
        System.out.println("In SB 5");
    }
}
