package pac1;

import org.testng.annotations.Test;

public class ContactTest {
@Test
public void createOrgTest() {
	String URL=System.getProperty("url");
	String BROWSER=System.getProperty("browser","chrome");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);



	System.out.println("excute createOrgTest");
}
@Test
public void modifyorgTest() {
	System.out.println("excute modifyorgTest");
}

}
