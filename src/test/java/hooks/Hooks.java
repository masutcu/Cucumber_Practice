package hooks;

import io.cucumber.java.Before;

import static base_url.ManagementonSchoolBaseUrl.setUp;

public class Hooks {
    //bu cucumberdan alınmalıdır
    @Before ("@Api") //sadece api tagi olan testler öncesi çalışır
    public void before(){
        setUp();
    }

}
