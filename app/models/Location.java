package models;

import javax.persistence.Column;
import javax.persistence.Id;

public class Location
{
    @Id

    @Column(name = "locationId")
    private int locationId;

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

    @Column(name = "venuePhoto")
    private byte[]venuePhoto;

    public int getLocationId()
    {
        return locationId;
    }

    public void setLocationId(int locationId)
    {
        this.locationId = locationId;
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

    public byte[] getVenuePhoto()
    {
        return venuePhoto;
    }

    public void setVenuePhoto(byte[] venuePhoto)
    {
        this.venuePhoto = venuePhoto;
    }
}
