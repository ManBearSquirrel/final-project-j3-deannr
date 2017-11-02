package models;

import javax.persistence.Column;
import javax.persistence.Id;

public class Setlist
{
    @Id

    @Column(name = "setlistId")
    private Integer setlistId;

    @Column(name = "performanceRating")
    private Integer performanceRating;

    @Column(name = "setlistPhoto")
    private byte[]setlistPhoto;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "songsPerformed")
    private String songsPerformed;

    @Column(name = "eventDateId")
    private int eventDateId;

    public Integer getSetlistId()
    {
        return setlistId;
    }

    public void setSetlistId(Integer setlistId)
    {
        this.setlistId = setlistId;
    }

    public Integer getPerformanceRating()
    {
        return performanceRating;
    }

    public void setPerformanceRating(Integer performanceRating)
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

    public int getEventDateId()
    {
        return eventDateId;
    }

    public void setEventDateId(int eventDateId)
    {
        this.eventDateId = eventDateId;
    }
}
