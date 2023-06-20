package stepDefinitions.api_stepdefs;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import static base_url.ManagementonSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class API_StepDefs {

    @Given("tum guest userlar icin get request yap")
    public void tum_guest_userlar_icin_get_request_yap() {
        //set the url
        //https://managementonschools.com/app/guestUser/getAll?size=1000
        //setUp() ı hooks içine koyuyoruz.
        spec.pathParams("first","questUser","second","getAll").
                queryParam("size","1000");

        //SEND THE REQUEST GET THE RESPONSE
        Response response=given(spec).get("{first},{second}");
        response.prettyPrint();



    }
    @Then("gelen bodyi dogrula : {string}, {string}, {string}, {string}, {string}, {string}, {string},{string}")
    public void gelen_bodyi_dogrula(String name, String surname, String birthplace, String phone, String gender, String birthOfBirth, String ssn, String username) {

    }
}
