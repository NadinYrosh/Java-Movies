import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    get("/hello", (request, response) -> "Hey there my friend- you can code");
  }
}
