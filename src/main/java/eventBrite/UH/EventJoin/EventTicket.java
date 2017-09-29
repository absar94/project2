package eventBrite.UH.EventJoin;

public class EventTicket
{
	private TicketInfo				ticketInfo;
	private int						ticketQuantity;
	// private EventInfo				eventInfo;

	public EventTicket(String clientFullName, TicketType ticketType, int quantity)
	{
		ticketInfo = new TicketInfo(clientFullName, ticketType);
		// ticketInfo.setTicketCover(newCover):newCover from eventInfo
		ticketQuantity = (quantity > 0) ? quantity : 0;
	}

	public void approveTicket() {ticketInfo.isPendingTicket = false;} 

	private static class TicketInfo
	{
		private String 		clientFullName;
		private TicketType 	ticketType;
		private	boolean 	isPendingTicket;
		private float		ticketCover;

		public TicketInfo(String clientFullName, TicketType ticketType)
		{
			this.clientFullName 		= clientFullName;
			this.ticketType 			= ticketType;
			isPendingTicket 			= true;
			ticketCover 				= -1;
		}

		private boolean setTicketCover(float newCover)
		{
			if(newCover < 0)
				return false;

			ticketCover = newCover;
			return true;
		}
	}

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
