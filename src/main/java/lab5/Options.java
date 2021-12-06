package lab5;

public interface Options {
    void setY(float y);
    void setX(float x);
    float getX();
    float getY();
    String toString();
    boolean equals(Object o);
    int hashCode();
}
