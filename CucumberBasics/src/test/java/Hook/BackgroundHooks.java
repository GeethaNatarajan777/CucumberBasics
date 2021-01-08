package Hook;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BackgroundHooks {
	@Before
	public void BeforeScenario() {
		System.out.println("This will run before every scenario");
	}
	@After
	public void AfterScenario() {
		System.out.println("This will run After every scenario");
	}
}
