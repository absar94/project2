package eventBrite.UH.EventJoin;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RegistrationFormTest 
{
	private RegistrationForm registrationForm;
	private int actualValue;
	private int expectedValue;

	@Before
	public void setUp()
	{
		registrationForm = new RegistrationForm();
	}

	@After
	public void tearDown() 
	{
	}

	@Test
	public void testRightMailFormat()
	{
		expectedValue = 0;
		actualValue = registrationForm.setUserRegistrationInfo(
			"XXXX", "YYYY", "x+x_ssd-ddd@dkj.com", "x+x_ssd-ddd@dkj.com", "952-255-5522");
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testWrongMailFormat()
	{
		expectedValue = -1;
		actualValue = registrationForm.setUserRegistrationInfo(
			"XXXX", "YYYY", "xxxxx.com", "xxxx@xx.com", "952-255-5522");
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testWrongMailConfirmation()
	{
		expectedValue = -2;
		actualValue = registrationForm.setUserRegistrationInfo(
			"XXXX", "YYYY", "xxxx@xx.com", "xxxx@xx2.com", "952-255-5522");
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testRightPhoneNumberFormat_TenDigits()
	{
		expectedValue = 0;
		actualValue = registrationForm.setUserRegistrationInfo(
			"XXXX", "YYYY", "x+x_ssd-ddd@dkj.com", "x+x_ssd-ddd@dkj.com", "9522555522");
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testRightPhoneNumberFormat_DashSeperator()
	{
		expectedValue = 0;
		actualValue = registrationForm.setUserRegistrationInfo(
			"XXXX", "YYYY", "x+x_ssd-ddd@dkj.com", "x+x_ssd-ddd@dkj.com", "952-255-5522");
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testRightPhoneNumberFormat_ParenthesesDashSeperator()
	{
		expectedValue = 0;
		actualValue = registrationForm.setUserRegistrationInfo(
			"XXXX", "YYYY", "x+x_ssd-ddd@dkj.com", "x+x_ssd-ddd@dkj.com", "(952)255-5522");
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testWrongPhoneNumberFormat_LessThanTenDigits()
	{
		expectedValue = -3;
		actualValue = registrationForm.setUserRegistrationInfo(
			"XXXX", "YYYY", "x+x_ssd-ddd@dkj.com", "x+x_ssd-ddd@dkj.com", "952-255-22");
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testWrongPhoneNumberFormat_SpaceSeperator()
	{
		expectedValue = -3;
		actualValue = registrationForm.setUserRegistrationInfo(
			"XXXX", "YYYY", "x+x_ssd-ddd@dkj.com", "x+x_ssd-ddd@dkj.com", "952 255-5522");
		assertEquals(expectedValue, actualValue);
	}
}