package testngproject;

public class Testng {
	

	    @BeforeSuite
	    public void setup() {
	        System.out.println("Setup system property for chrome");
	    }

	    @BeforeClass
	    public void launchbrowser() {
	        System.out.println("Launch the browser");
	    }

	    @BeforeMethod
	    public void enterurl() {
	        System.out.println("Enter URL");
	    }

	    @BeforeTest
	    public void login() {
	        System.out.println("Login method");
	    }

	    @Test
	    public void googleTitleTest() {
	        System.out.println("Google title test");
	    }

	    @AfterMethod
	    public void logout() {
	        System.out.println("Logout");
	    }
	}


