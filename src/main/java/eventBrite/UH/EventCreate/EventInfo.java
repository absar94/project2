package eventBrite.UH.EventCreate;

import java.util.Date;

public class EventInfo {

    private String eTitle;
    private String eLocation;
    private Date eStart;
    private Date eEnd;
    private String eDescription;
    private String eOrgName;
    private String eOrgDesc;

    public EventInfo()
    {
        eTitle = "";
        eLocation = "";
        eStart = new Date();
        eEnd = new Date();
        eDescription = "";
        eOrgName = "";
        eOrgDesc = "";
    }

    public int SetEventInfos(
            String eTitle,
            String eLocation,
            Date eStart,
            Date eEnd,
            String eDescription,
            String eOrgName,
            String eOrgDesc)
    {
        this.eTitle = eTitle;
        this.eLocation = eLocation;
        this.eStart = eStart;
        this.eEnd = eEnd;
        this.eDescription = eDescription;
        this.eOrgName = eOrgName;
        this.eOrgDesc = eOrgDesc;

        return 1;
    }


}
