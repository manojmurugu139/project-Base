package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dplogin {

@Test(dataProvider="login")
	private void test(String username,String password) {
	
	System.out.println(username);
	System.out.println(password);
}
	
@DataProvider(name="login"
)	
private Object[][] data(){
	Object[][] obj =new Object[][] {
		
		{"sadhfas","87907"},
		{"kdfhcsf","7897907"},
		{"fkjnhf","8979874"},
		{"hjhwwxe","87974908"}
	};
	
	return obj;
}
	
}

