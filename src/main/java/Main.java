import com.google.gson.Gson;

public class Main {
    public static void main (String[] args){

        String homework =  "[\n" +
                "  {\n" +
                "    \"dev_id\": \"4c:55:cc:1e:36:8a\",\n" +
                "    \"data\": [\n" +
                "      {\n" +
                "        \"Instant_HR\": \"255\",\n" +
                "        \"Heart_Rate\": \"120\",\n" +
                "        \"Resp_Rate\": \"0\",\n" +
                "        \"HRV\": \"0\",\n" +
                "        \"Total_Motions\": \"0\",\n" +
                "        \"Room_Temp\": \"34\",\n" +
                "        \"Room_Hum\": \"43\",\n" +
                "        \"Body_Temp\": \"0\",\n" +
                "        \"Total_Snoring\": \"0\",\n" +
                "        \"Total_Apnea\": \"0\",\n" +
                "        \"Pnp_bg\": \"0.000000\",\n" +
                "        \"Pnp_rt\": \"0.000000\",\n" +
                "        \"Th_bg\": \"0\",\n" +
                "        \"Th_rt\": \"0\",\n" +
                "        \"Bed_Occupied\": \"1\",\n" +
                "        \"t\": \"2021-07-20T09:54:27Z\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "]";

        Car Gson = new Gson().fromJson(homework, Car.class);

    }
}
