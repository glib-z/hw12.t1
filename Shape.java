package gz.hw12.t1;

import javafx.scene.canvas.GraphicsContext;

public abstract class Shape {

    GraphicsContext gc;
    protected double x;
    protected double y;
    protected double size;

    Shape(GraphicsContext gc, double x, double y, double size) {
        this.gc = gc;
        this.x = x;
        this.y = y;
        this.size = size;
    }

    void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public abstract void draw(Boolean fill);

}
