/*
 * Task 3
 *
 * change the code to a more reasonably class structure
 * */

public class Circle extends Ellipse {
    public Integer diameter;

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = (diameter > 0) ? diameter : new Integer(0);
        super.setConjugateDiameter(diameter);
    }
}
