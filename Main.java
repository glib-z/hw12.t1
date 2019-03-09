package gz.hw12.t1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    private static final double SPEED = 3;
    private Board board;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Paint");

        Canvas canvas = new Canvas();
        canvas.setWidth(800);
        canvas.setHeight(500);

        BorderPane group = new BorderPane(canvas);
        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.show();
        Logger.log("Game started");

        GraphicsContext gc = canvas.getGraphicsContext2D();
        board = new Board(gc);
        board.draw();

        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case LEFT:
                    board.move(gc, -SPEED, 0);
                    break;
                case RIGHT:
                    board.move(gc, SPEED, 0);
                    break;
                case UP:
                    board.move(gc, 0, -SPEED);
                    break;
                case DOWN:
                    board.move(gc, 0, SPEED);
                    break;
                case W:
                    break;
                case Q:
                    break;
                case DIGIT1:
                    board.addBall(gc);
                    break;
                case DIGIT2:
                    board.addSquare(gc);
                    break;
                case DIGIT3:
                    break;
                case CONTROL:
                    break;
                case SHIFT:
                    break;
                case PAGE_UP:
                    break;
                case PAGE_DOWN:
                    break;
                case TAB:
                    board.nextShape(gc);
                    break;
            }

            board.draw();
        });



    }
}
