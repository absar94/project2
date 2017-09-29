package eventBrite.UH.EventCreate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EventCreate {

    private EventInfo eInfo = new EventInfo();
    private Scanner sc;
    public EventCreate(Scanner sc)
    {
        this.sc=sc;
    }
    public int createEvent()
    {

        String strIn;
        Date dateIn;
        int intIn;
        float fltIn;
        SimpleDateFormat formatIn;
        try {
            // title
            System.out.println("Input the title of the event");
            strIn=readLine(sc);
            eInfo.seteTitle(strIn);

            // location
            System.out.println("Input the event location");
            strIn=readLine(sc);
            eInfo.seteLocation(strIn);

            //start date
            System.out.println("Input the start date of the event MM/dd/yy - HH:mm");
            strIn=readLine(sc);

            formatIn = new SimpleDateFormat("MM/dd/yy - HH:mm");

            dateIn = formatIn.parse(strIn);
            eInfo.seteStart(dateIn);

            // end date
            System.out.println("Input the end date of the event MM/dd/yy - HH:mm");
            strIn=readLine(sc);

            formatIn = new SimpleDateFormat("MM/dd/yy - HH:mm");

            dateIn = formatIn.parse(strIn);
            eInfo.seteEnd(dateIn);

            //event description
            System.out.println("Input the event description");
            strIn=readLine(sc);
            eInfo.seteDescription(strIn);

            //organizer name
            System.out.println("Input the organizer name");
            strIn=readLine(sc);
            eInfo.seteOrgName(strIn);

            //organizer description
            System.out.println("Input the organizer description");
            strIn=readLine(sc);
            eInfo.seteOrgDesc(strIn);

            System.out.println("Input the event available spots (-1 means unlimited spots)");
            intIn=Integer.parseInt(readLine(sc));
            eInfo.seteAvailable(intIn);

            System.out.println("Input the event price in USD");
            fltIn=Float.parseFloat(readLine(sc));
            eInfo.setePrice(fltIn);

        }catch (Exception e)
        {
            System.out.println(e.toString());
            return 0;
        }

        try {
            eInfo.saveEvent();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 1;
    }

    public String readLine(Scanner sc) throws EmptyStringException
    {
        String strIn=sc.nextLine();
        EmptyStringException e = new EmptyStringException();
        if(strIn.isEmpty())
        {
            throw e;
        }
        return strIn;
    }
}
