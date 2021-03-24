package co.edu.escuelaing.edu.co.funcion;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import spark.Request;
import spark.Response;


import java.lang.Math;

public class Operation {

    public static String funcionExp(Request req, Response res) throws JSONException {
        double value;
        value= Double.parseDouble(req.queryParams("value"));
        Double  value2 = Math.exp(value);
        return json("Exp",value,value2);
    }


    public static String funcionLog(Request req, Response res) throws JSONException {
        double value;
        value= Double.parseDouble(req.queryParams("value"));
        Double  value2 = Math.log(value);
        return json("Log",value,value2);
    }

    private static String json(String operation, Double value1, Double value2) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("operación", operation);
        jsonObject.put("input", value1);
        jsonObject.put("output", value2);

        return jsonObject.toString();
    }

}
