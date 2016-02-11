import java.io.*;
import java.util.Scanner;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.canvas.*;
import javafx.scene.text.*;
import javafx.scene.layout.StackPane;



//#   # ##### #     #      ###  #     # ####  ####
//#   # #     #     #     #   # #  #  # #   # #   #
//##### ##### #     #     #   # # # # # #   # ####
//#   # #     #     #     #   # ##   ## #   # #  #
//#   # ##### ##### #####  ###  #     # ####  #   #
import javafx.stage.Stage;


public class Excercise1 extends Application{
	static String word;
	Stage window;

	public static void main(String[] args) {
		inputWord();
		BigLetterGen.letterList(word);
		for (int i = 0; i < 5; i++) {
			System.out.println(BigLetterGen.bigWord[i]);
		}
		launch(args);
	}

	public static String inputWord() {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a word: ");
		word = reader.nextLine();
		word = word.toLowerCase();
		return word;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		StackPane layout = new StackPane();
		primaryStage.setTitle("String to Graphics");
		layout.setStyle("-fx-background-color: black");
		
		Canvas canvas = new Canvas(400, 100);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		Font font = new Font( "Stencil", 32 );
		gc.setFont(font);
		word = word.toUpperCase();
		gc.setFill(Color.WHITESMOKE);
		gc.fillText(word, 20, 60);
		

		layout.getChildren().add(canvas);
		Scene window = new Scene(layout,400,100);
		primaryStage.setScene(window);
		primaryStage.show();
	}

}


