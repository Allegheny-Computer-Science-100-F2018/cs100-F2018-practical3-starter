package practicalthree;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class uses JavaFX to produce graphical output with shapes.
 * The program will display a graphical scene that contains
 * shapes with complementary colors, according to the specification in
 * the README file and the assignment sheet.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Gregory M. Kapfhammer and Lewis and Loftus
 */

public class DisplayComplementaryDrawingCanvas extends Application {

  /** The horizontal origin of the graphical scene's canvas. */
  private static final int HORIZONTAL_ORIGIN = 0;

  /** The vertical origin of the graphical scene's canvas. */
  private static final int VERTICAL_ORIGIN = 0;

  /** The width of the graphical scene's canvas. */
  private static final int CANVAS_WIDTH = 1024;

  /** The height of the graphical scene's canvas. */
  private static final int CANVAS_HEIGHT = 768;

  // Define the maximum RGB value that is possible
  public static final int RGB_MAXIMUM = 255;

  /** The redValue that is input from the file. */
  private static int redValue;

  /** The greenValue that is input from the file. */
  private static int greenValue;

  /** The blueValue that is input from the file. */
  private static int blueValue;

  /**
   * This is the start method that displays a graphical scene.
   * This method will create colored graphical objects and place
   * them on a virtual canvas with a title. This method will
   * be called by the main method's invocation of start.
   */
  public void start(Stage primaryStage) {
    // TODO: create the first rectangle on the left-hand side
    // this rectangle should be of the userRequestedColor
    Rectangle leftRectangle = null;
    Color userRequestedColor = Color.rgb(redValue, greenValue, blueValue);

    // TODO: create the second rectangle on the right-hand side
    // this rectangle should be colored with the complement
    // of the userRequestedColor
    Rectangle rightRectangle = null;

    // create a root group and display it in the scene
    Group root = new Group(leftRectangle, rightRectangle);
    Scene scene = new Scene(root, CANVAS_WIDTH, CANVAS_HEIGHT, Color.WHITE);

    primaryStage.setTitle("A Complementary Graphical Scene");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  /**
   * This is the main method that displays a graphical scene.
   * After reading in the RGB color value, this method will call the other
   * method to display the scene.
   */
  public static void main(String[] args) {
    // declare the starting file and scanner
    File colorValuesInputFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      colorValuesInputFile = new File("input/color_values.txt");
      scanner =
        new Scanner(colorValuesInputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in the RED color value

    // Step Two: Read in the GREEN color value

    // Step Three: Read in the BLUE color value

    // Step Four: Launch the graphical application
    launch(args);
  }
}
