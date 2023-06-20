package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.ManagementOnSchoolAutorization.generateToken;

public class ManagementOnSchoolsBaseUrl {

    public static RequestSpecification spec;

    public static void setUp() {
        spec = new RequestSpecBuilder()
                .addHeader("Authorization",generateToken())
                .setBaseUri("https://managementonschools.com/app")
                .setContentType(ContentType.JSON)
                .build();
    }
}
