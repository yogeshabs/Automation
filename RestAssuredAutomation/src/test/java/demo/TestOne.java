package demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestOne 
{
	public void test1()
	{
		Response resp = RestAssured.get("");
		resp.getStatusCode();
	}
}
