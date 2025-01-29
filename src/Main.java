import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello, JavaFX! 실행 성공 🎉");
        Scene scene = new Scene(label, 400, 300);
        stage.setScene(scene);
        stage.setTitle("JavaFX Test");
        stage.show();  // 창 띄우기
    }

    public static void main(String[] args) {
        launch(args);  // JavaFX 애플리케이션 실행
    }
}
