package eventBrite.UH.EventJoin;

public class RegistrationForm  
{
	private UserRegistrationInfo 	registrationInfo;
	/*These classes are not imlemented yet*/
	// private EventInfo				eventInfo;
	// private TicketInfo				ticketInfo;

	public RegistrationForm() 
	{
		registrationInfo = new UserRegistrationInfo(); 
	}

	public int setUserRegistrationInfo(
		String	firstName,
		String	lastName,
		String	emailAddress,
		String	emailConfirm,
		String 	cellPhone)
	{
		registrationInfo.firstName = firstName;
		registrationInfo.lastName = lastName;
		if(!registrationInfo.setEmailAddress(emailAddress)) return -1;
		if(!confirmEmailAddress(emailConfirm))				return -2;
		if(!registrationInfo.setCellPhone(cellPhone)) 		return -3;
		return 0;
	}

	private boolean confirmEmailAddress(String emailConfirm)
	{
		return registrationInfo.emailAddress.equals(emailConfirm);
	}

	private static class UserRegistrationInfo
	{
		private String	firstName;
		private String	lastName;
		private String	emailAddress;
		private String 	cellPhone;
		// birthday Not necessary now

		public UserRegistrationInfo() {}

		private boolean setEmailAddress(String newEmailAddress) 
		{
			final String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
			if (newEmailAddress.matches(EMAIL_REGEX)) 
			{
			 	emailAddress = newEmailAddress;
			 	return true;
			} 
			return false;
		}

		private boolean setCellPhone(String newCellPhone) 
		{
			// 1234567890, 123-456-7890, (123)456-7890 or (123)4567890 are the accepted format
			final String PHONE_REGEX = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
			if (newCellPhone.matches(PHONE_REGEX)) 
			{
			 	cellPhone = newCellPhone;
			 	return true;
			} 
			return false;
		}

	}
}
