package models;

import javax.persistence.Column;
import javax.persistence.Id;

public class Act
{
    @Id

    @Column(name = "actId")
    private int actId;

    @Column(name = "actName")
    private String actName;

    @Column(name = "musicGenre")
    private String musicGenre;

    @Column(name = "actPhoto")
    private byte[]actPhoto;

    public int getActId()
    {
        return actId;
    }

    public void setActId(int actId)
    {
        this.actId = actId;
    }

    public String getActName()
    {
        return actName;
    }

    public void setActName(String actName)
    {
        this.actName = actName;
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
}
