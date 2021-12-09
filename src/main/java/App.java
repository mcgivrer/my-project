import java.util.ResourceBundle;

/**
 * This the MyPorject main class
 *
 * @author Frédéric Delorme
 * @since 0.0.1
 */
public class App {

  ResourceBundle config;
  String title;

  public App() {
    config = ResourceBundle.getBundle("app");
    title = config.getString("title");
  }

  public void displayMsg(String msg) {
    System.out.println(String.format("%s: %s", title, msg));
  }

  /**
   * The main entry point fo this program.
   *
   * @param argc the list of command line arguments send to java program
   */
  public static void main(String[] argc) {
    App app = new App();
    app.displayMsg("Hello World, I am my-project main App class");

  }

}
