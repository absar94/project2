package eventBrite.UH.EventTools;

public class EventTypes
{
	public enum TicketType 
	{
		GA("General Access"),
		VIP("Very Important Person");
		
		private String name = "";

		TicketType(String name)
		{
			this.name = name;
		}

		public String toString()
		{
			return name;
		}
	}
}



