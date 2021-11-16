/*
* Task 3
*
* change the code to a more reasonably class structure
* */

public class GeoObject {
    public String color;
    public Integer identifier;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Integer identifier) {
        this.identifier = (identifier>0) ? identifier : new Integer(0);
    }
}
