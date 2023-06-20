package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.asynchttpclient.RequestBuilder;
import org.junit.runner.Request;

public class ManagementonSchoolBaseUrl {

    public static RequestSpecification spec;

    public static void setUp(){
        new RequestSpecBuilder().setBaseUri("https://managementonschools.com/app").build();

    }
}
