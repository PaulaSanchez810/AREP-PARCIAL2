package co.edu.escuelaing.edu.co;
import co.edu.escuelaing.edu.co.funcion.Operation;
import spark.*;
import static spark.Spark.*;
import static spark.route.HttpMethod.put;

/**
 * Hello world!
 *
 */
public class SparkApp
{
    public static void main( String[] args ) {
        port(getPort());
        get("/operetionExp", Operation::funcionExp);
        get("/operetionLog", Operation::funcionLog);

    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4577;
    }
}
