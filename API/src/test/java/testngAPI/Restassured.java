package testngAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import 	static io.restassured.RestAssured.*;

import org.data.PetDetails;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Restassured {
	
		static int i;
		
		@DataProvider(name = "pet")
		public Object[][] getPet(){
			return new Object[][] {{218,"Tiny"},{238, "pinky"},{258,"tintu"}};
		}
		
		
		
		@Test(priority = 1,dataProvider = "pet")
		public void addPet(int id,String name){
		RestAssured.baseURI = "https://petstore.swagger.io/v2"; 

		 String postResponse= given().log().all().header("Content-Type","application/json").body(PetDetails.petData(id, name,"available"))	
		.when().post("/pet")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		 System.out.println("response :"+postResponse);

		 JsonPath j = new JsonPath(postResponse);
		  i = j.getInt("id");
		  System.out.println("pet ID:" +id);
		}
		
		@Test(priority = 2)
		public void Petget(){
		given().log().all().header("Content-Type","application/json").pathParam("id", i)
		.when().get("/pet/{id}")
		.then().log().all().assertThat().statusCode(200);
		}
		
	
		@Test(priority = 3)
		public void updatePet(){
		given().log().all().header("Content-Type","application/json").body(PetDetails.petData(218, "Tiny", "sold"))
		.when().put("/pet")
		.then().log().all().assertThat().statusCode(200);
		
		}
		@Test(priority = 4)
		public void FindPet(){
		given().log().all().header("Content-Type","application/json").queryParam("status", "sold")
		.when().get("/pet/findByStatus")
		.then().log().all().assertThat().statusCode(200);
		
		}
		
	

}
