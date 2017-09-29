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
        SimpleDateFormat formatIn;
        try {
            // title
            System.out.println("Input the title of the event");
            strIn=readLine(sc);

            // location
            System.out.println("Input the event location");
            strIn=readLine(sc);

            //start date
            System.out.println("Input the start date of the event MM/dd/yy - HH:mm");
            strIn=readLine(sc);

            formatIn = new SimpleDateFormat("MM/dd/yy - HH:mm");

            dateIn = formatIn.parse(strIn);


            // end date
            System.out.println("Input the end date of the event MM/dd/yy - HH:mm");
            strIn=readLine(sc);

            formatIn = new SimpleDateFormat("MM/dd/yy - HH:mm");

            dateIn = formatIn.parse(strIn);


            //event description
            System.out.println("Input the event description");
            strIn=readLine(sc);

            //organizer name
            System.out.println("Input the organizer name");
            strIn=readLine(sc);

            //organizer description
            System.out.println("Input the organizer description");
            strIn=readLine(sc);

        }catch (Exception e)
        {
            System.out.println(e.toString());
            return 0;
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
