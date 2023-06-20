package hooks;

import io.cucumber.java.Before;

import static base_urls.ManagementOnSchoolsBaseUrl.setUp;

public class Hooks {
    //bu cucumberdan alınmalıdır
    @Before("@Api")//import io.cucumber.java.Before; --> Sadece @Api tagi olan testler öncesi çalışır.
    public void before(){
        setUp();
    }

}
