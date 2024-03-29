package org.oauth;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Courses {
	
	@Test
	public void accesstoken(){
		String url = "https://rahulshettyacademy.com/getCourse.php?code=4%2F0AdQt8qiUPS1jMe7z_EmHomTZtJaD4PaCyrNAQiuz1knt62InX9xRFkpmUmdNsPbWvFGmiA&scope=email+openid+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email&authuser=0&prompt=none";
	String[] s  = url.split("code=");
	String[]s1 = s[1].split("&scope=");

		String tokenresponse = given().log().all().
		queryParam("code",s1[0])
		.queryParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParam("client_secret","erZOWM9g3UtwNRj340YYaK_W")
		.queryParam("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
		.queryParam("grant_type","authorization_code").urlEncodingEnabled(false)
		.when().post("https://www.googleapis.com/oauth2/v4/token")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		
	
		JsonPath j = new JsonPath(tokenresponse);
		String token = j.get("access_token");
		
		String response = given().log().all().queryParam("access_token", token).header("Content-Type","application/json")
		.when().get("https://rahulshettyacademy.com/getCourse.php")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(response);
		
		JsonPath j1 = new JsonPath(response);
		
		int count = j1.get("courses.webAutomation.size()");
		
		for(int i = 0; i< count; i++){
			
			String countTitle = j1.get("courses.webAutomation["+i+"].courseTitle");
			System.out.println(countTitle);
			
			String price = j1.get("courses.webAutomation["+i+"].price");
			System.out.println(price);
		}
	
		int count2 = j1.get("courses.api.size()");
		
		for(int i = 0; i< count2; i++){
			
			String countTitle = j1.get("courses.api["+i+"].courseTitle");
			System.out.println(countTitle);
			
			String price = j1.get("courses.api["+i+"].price");
			System.out.println(price);
		}
		
		int count3 = j1.get("courses.mobile.size()");
		
		for(int i = 0; i< count3; i++){
			
			String countTitle = j1.get("courses.mobile["+i+"].courseTitle");
			System.out.println(countTitle);
			
			String price = j1.get("courses.mobile["+i+"].price");
			System.out.println(price);
		}	
		
	}
	
}