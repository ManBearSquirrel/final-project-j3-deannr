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

    @Column(name = "eventDateId")
        private Integer eventDateId;

   @Column(name = "eventDate")
    private Date eventDate;

    @Column(name = "actId")
    private Integer actId;

    @Column(name = "locationId")
    private Integer locationId;

    @Column(name = "setlistId")
    private Integer setlistId;

       @Column(name = "cityName")
       private String cityName;

       @Column(name = "stateName")
       private String stateName;

       @Column(name = "venueSize")
       private Integer venueSize;

       @Column(name = "venueName")
       private String venueName;

       @Column(name = "venueType")
       private String venueType;

       @Column(name = "actName")
       private String actName;

       @Column(name = "musicGenre")
       private String musicGenre;

       @Column(name = "performanceRating")
       private Integer performanceRating;

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

    public Integer getEventDateId()
    {
        return eventDateId;
    }

    public void setEventDateId(Integer eventDateId)
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

    public Integer getActId()
    {
        return actId;
    }

    public void setActId(Integer actId)
    {
        this.actId = actId;
    }

    public Integer getLocationId()
    {
        return locationId;
    }

    public void setLocationId(Integer locationId)
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

    public Integer getVenueSize()
    {
        return venueSize;
    }

    public void setVenueSize(Integer venueSize)
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


    public String getMusicGenre()
    {
        return musicGenre;
    }

    public void setMusicGenre(String musicGenre)
    {
        this.musicGenre = musicGenre;
    }


    public Integer getPerformanceRating()
    {
        return performanceRating;
    }

    public void setPerformanceRating(Integer performanceRating)
    {
        this.performanceRating = performanceRating;
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

}
