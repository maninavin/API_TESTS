package apiTest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class IhmsHeartRate {
	
	
	@Test
	public void Test1() {
			
			
			//Base URl
			RestAssured.baseURI = "http://1a9488e9.ngrok.io";
			
			given().
			        //param("location", "-33.8670522,151.1957362").
			        //param("radius", "1500").
			        //param("key","AIzaSyCxtol8r6nagmyNrKvbaJLWBF4cU5GEmbk").
			        when().
			        get("getHRRecords").
			        then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
			        body("[0].date", equalTo("2018-04-26"));
			        
		}
	
}
