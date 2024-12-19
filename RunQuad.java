import java.util.Scanner;

// Base class
class Quadrilateral {
    public void showDescription() {
        System.out.println("- is quadrilateral");
    }
}

// Parallelogram class
class Parallelogram extends Quadrilateral {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 2 pairs of parallel sides");
    }
}

// Rectangle class
class Rectangle extends Parallelogram {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 right angles");
    }
}

// Square class
class Square extends Rectangle {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 equal sides");
    }
}

// Rhombus class
class Rhombus extends Parallelogram {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 congruent sides");
    }
}

// Trapezoid class
class Trapezoid extends Quadrilateral {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 1 pair of parallel sides");
    }
}

// Main class
public class RunQuad {
    public static void main(String[] args) {
        Scanner jeremy = new Scanner(System.in);

        System.out.println("Press R for Rectangle, S for Square, P for Parallelogram, H for Rhombus, T for Trapezoid:");
        char choice = jeremy.next().toUpperCase().charAt(0);

        switch (choice) {
            case 'R':
                Rectangle rectangle = new Rectangle();
                rectangle.showDescription();
                break;
            case 'S':
                Square square = new Square();
                square.showDescription();
                break;
            case 'P':
                Parallelogram parallelogram = new Parallelogram();
                parallelogram.showDescription();
                break;
            case 'H':
                Rhombus rhombus = new Rhombus();
                rhombus.showDescription();
                break;
            case 'T':
                Trapezoid trapezoid = new Trapezoid();
                trapezoid.showDescription();
                break;
            default:
                System.out.println("Invalid choice. Please enter R, S, P, H, or T.");
        }

        jeremy.close();
    }
}
