
public class Testng {
	@beforesuit
	public void setup() {
		System.out.println("Setup system property for chrome");
	}
	
	@beforeclass
public void launchbrowser() {
	System.out.println("Launch the browser");
}
	@beforemethod
	public void enterurl() {
		System.out.println("enter url");
	}
	@beforeTest
	public void login() {
		System.out.println("Login method");
	}
	@test
	public void googleTitleTest() {
		System.out.println("Google title test");
	}
	@aftermethod
	public void logout() {
		System.out.println("Logout");
	}
}
