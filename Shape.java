package gz.hw12.t1;

public interface Shape {

    void move(double dx, double dy);
    void draw(Boolean fill);
    void zoom(double ds);
    Boolean isPointed(int mx, int my);

}
