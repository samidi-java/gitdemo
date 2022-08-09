package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test1 {
	
	@Test(enabled = false)
	public void testAllPosts()
	{
		String baseUrl="http://jsonplaceholder.typicode.com/posts";
		RestAssured.baseURI=baseUrl;
		//Request object
		RequestSpecification httpRequest=RestAssured.given();
		//Response Object
		Response response=httpRequest.request(Method.GET);
		
		System.out.println("Response code:"+response.getStatusCode());
		System.out.println("Response Body:"+response.getBody().asString());
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	@Test
	public void testPostById()
	{
		String baseUrl="http://jsonplaceholder.typicode.com/posts/1";
		RestAssured.baseURI=baseUrl;
		//Request object
		RequestSpecification httpRequest=RestAssured.given();
		//Response Object
		Response response=httpRequest.request(Method.GET);
		
		System.out.println("Response code:"+response.getStatusCode());
		System.out.println("Response Body:"+response.getBody().asString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
