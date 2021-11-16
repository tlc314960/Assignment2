/*
 * Task 3
 *
 * change the code to a more reasonably class structure
 * */

public class Ellipse extends GeoObject {
    public Integer diameter;
    public Integer conjugateDiameter;

    public Integer getDiameter() {
        return diameter;
    }

    public Integer getConjugateDiameter() {
        return conjugateDiameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = (diameter > 0) ? diameter : new Integer(0);
    }

    public void setConjugateDiameter(Integer conjugateDiameter) {
        this.conjugateDiameter = (conjugateDiameter > 0) ?
                conjugateDiameter : new Integer(0);
    }
}
