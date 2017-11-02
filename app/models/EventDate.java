package models;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class EventDate
{
    @Id

    @Column(name = "eventDateId")
    private int eventDateId;

    @Column(name = "eventDate")
    private Date eventDate;

    @Column(name = "actId")
    private int actId;

    @Column(name = "locationId")
    private int locationId;

    @Column(name = "setlistId")
    private Integer setlistId;

    public int getEventDateId()
    {
        return eventDateId;
    }

    public void setEventDateId(int eventDateId)
    {
        this.eventDateId = eventDateId;
    }

    public Date getEventDate()
    {
        return eventDate;
    }

    public void setEventDate(Date eventDate)
    {
        this.eventDate = eventDate;
    }

    public int getActId()
    {
        return actId;
    }

    public void setActId(int actId)
    {
        this.actId = actId;
    }

    public int getLocationId()
    {
        return locationId;
    }

    public void setLocationId(int locationId)
    {
        this.locationId = locationId;
    }

    public Integer getSetlistId()
    {
        return setlistId;
    }

    public void setSetlistId(Integer setlistId)
    {
        this.setlistId = setlistId;
    }
}
