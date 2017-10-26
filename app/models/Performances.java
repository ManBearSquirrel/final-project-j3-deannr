package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity

public class Performances
{
    @Id

  //  @Column(name = "eventDateId")
    //private int eventDateId;

   @Column(name = "eventDate")
    private Date eventDate;

    /* @Column(name = "actId")
    private int actId;

    @Column(name = "locationId")
    private int locationId;

    @Column(name = "setlistId")
    private int setlistId;

    @Column(name = "cityName")
    private String cityName;

    @Column(name = "stateName")
    private String stateName;

    @Column(name = "venueSize")
    private int venueSize;

    @Column(name = "venueName")
    private String venueName;

    @Column(name = "venueType")
    private String venueType;

    @Column(name = "venuePhoto")
    private byte[]venuePhoto;

    @Column(name = "actName")
    private String actName;

    @Column(name = "musicGenre")
    private String musicGenre;

    @Column(name = "actPhoto")
    private byte[]actPhoto;

    @Column(name = "performanceRating")
    private int performanceRating;

    @Column(name = "setlistPhoto")
    private byte[]setlistPhoto;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "songsPerformed")
    private String songsPerformed;

    public String getActName()
    {
        return actName;
    }

    public void setActName(String actName)
    {
        this.actName = actName;
    }

    public int getEventDateId()
    {
        return eventDateId;
    }

    public void setEventDateId(int eventDateId)
    {
        this.eventDateId = eventDateId;
    }
    */

  public Date getEventDate()
    {
        return eventDate;
    }

    public void setEventDate(Date eventDate)
    {
        this.eventDate = eventDate;
    }
 /*
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

    public int getSetlistId()
    {
        return setlistId;
    }

    public void setSetlistId(int setlistId)
    {
        this.setlistId = setlistId;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public String getStateName()
    {
        return stateName;
    }

    public void setStateName(String stateName)
    {
        this.stateName = stateName;
    }

    public int getVenueSize()
    {
        return venueSize;
    }

    public void setVenueSize(int venueSize)
    {
        this.venueSize = venueSize;
    }

    public String getVenueName()
    {
        return venueName;
    }

    public void setVenueName(String venueName)
    {
        this.venueName = venueName;
    }

    public String getVenueType()
    {
        return venueType;
    }

    public void setVenueType(String venueType)
    {
        this.venueType = venueType;
    }

    public byte[] getVenuePhoto()
    {
        return venuePhoto;
    }

    public void setVenuePhoto(byte[] venuePhoto)
    {
        this.venuePhoto = venuePhoto;
    }

    public String getMusicGenre()
    {
        return musicGenre;
    }

    public void setMusicGenre(String musicGenre)
    {
        this.musicGenre = musicGenre;
    }

    public byte[] getActPhoto()
    {
        return actPhoto;
    }

    public void setActPhoto(byte[] actPhoto)
    {
        this.actPhoto = actPhoto;
    }

    public int getPerformanceRating()
    {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating)
    {
        this.performanceRating = performanceRating;
    }

    public byte[] getSetlistPhoto()
    {
        return setlistPhoto;
    }

    public void setSetlistPhoto(byte[] setlistPhoto)
    {
        this.setlistPhoto = setlistPhoto;
    }

    public String getRemarks()
    {
        return remarks;
    }

    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

    public String getSongsPerformed()
    {
        return songsPerformed;
    }

    public void setSongsPerformed(String songsPerformed)
    {
        this.songsPerformed = songsPerformed;
    }
    */
}
