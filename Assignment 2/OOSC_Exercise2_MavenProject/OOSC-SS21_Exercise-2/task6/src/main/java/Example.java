/*
 * Task 6
 *
 * Write the source code according to your UML class diagram of functional variation inheritance
 * */
class Material { private void writeName() { System.out.println("Material");
} } // class
class Aurochs extends Material { public void writeName () { System.out.println("Aurochs");
}
    public static void writeLatin() { System.out.print("Bos primigenius");
    }
    public void writeDescription() { this.writeName();
    } } // class
class Cow extends Aurochs { public void writeName () { System.out.println("Cow");
}
    public static void writeLatin() { Aurochs.writeLatin(); System.out.println("taurus");
    }
} // class
public class Example {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Aurochs aurochs = cow;
        Material material = new Material();
        ((Aurochs)cow).writeName();
    }

}
