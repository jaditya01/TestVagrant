package accuweather.Testvagrant.Helper;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssuredHelper {

	private final static String appid="7fe67bf08c80ded756e598d6f8fedaea";
	private final static String unit="metric";

	public static float getTemperature(String city)
	{
		String temperature="";
		RestAssured.baseURI = "https://api.openweathermap.org";
		RequestSpecification httpRequest = RestAssured.given();

		//Sample request : "/data/2.5/weather?q=Pune&units=metric&appid=7fe67bf08c80ded756e598d6f8fedaea"
		Response response = httpRequest.queryParam("q", city)
				.queryParam("units" , unit)
				.queryParam("appid",appid ) 
				.get("/data/2.5/weather");
		// Retrieve the body of the Response
		ResponseBody body = response.getBody();

		try {
			JsonPath responseJsonPath = new JsonPath(body.asString()) ;
			temperature = responseJsonPath.getString("main.temp");
			System.out.println("The temperature returned from API is : "+temperature);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Float.parseFloat(temperature);
	}
}
