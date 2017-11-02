package controllers;

import com.google.common.io.Files;
import models.Act;
import models.Location;
import models.Performances;
import models.Setlist;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import javax.persistence.Column;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class PerformanceController extends Controller
{
    private JPAApi jpaApi;
    private FormFactory formFactory;

    @Inject
    public PerformanceController(FormFactory formFactory, JPAApi jpaApi)
    {
        this.formFactory = formFactory;
        this.jpaApi = jpaApi;
    }

    @Transactional(readOnly = true)
    public Result getPerformances()
    {


        List<Performances> performances =
               jpaApi.
            em().
            createNativeQuery("SELECT ed.EventDateId, EventDate, a.ActId, l.LocationId, ed.SetlistId, ActName, MusicGenre, " +
                    "CityName, StateName, VenueSize, VenueName, VenueType, SongsPerformed, Remarks, PerformanceRating " +
                    "FROM eventdate ed " +
                    "JOIN Act a ON ed.ActId = a.ActId " +
                    "JOIN Location l ON ed.LocationId = l.LocationId " +
                    "LEFT OUTER JOIN Setlist s ON ed.EventDateId = s.EventDateId " +
                    "ORDER BY ed.EventDateId", Performances.class).
            getResultList();

        return ok(views.html.performances.render(performances));
    }

    @Transactional(readOnly = true)
    public Result getPerformance(Integer eventDateId)
    {


        Performances performance =
                (Performances)jpaApi.
                        em().
                        createNativeQuery("SELECT ed.EventDateId, EventDate, a.ActId, l.LocationId, ed.SetlistId, ActName, MusicGenre, " +
                                "CityName, StateName, VenueSize, VenueName, VenueType, SongsPerformed, Remarks, PerformanceRating " +
                                "FROM eventdate ed " +
                                "JOIN Act a ON ed.ActId = a.ActId " +
                                "JOIN Location l ON ed.LocationId = l.LocationId " +
                                "LEFT OUTER JOIN Setlist s ON ed.EventDateId = s.EventDateId " +
                                "WHERE ed.EventDateId = :eventdate", Performances.class).setParameter("eventdate", eventDateId).getSingleResult();

        return ok(views.html.performance.render(performance));
    }


    @Transactional
    public Result addPerformance()
    {
        DynamicForm form = formFactory.form().bindFromRequest();


        String formattedDate = form.get("eventDate");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date eventDate;
        try
        {
            eventDate = sdf.parse(formattedDate);
        }
        catch(Exception e)
        {
            eventDate = null;
        }
        int actId = Integer.parseInt(form.get("actId"));
        int locationId = Integer.parseInt(form.get("locationId"));
        Integer setlistId = Integer.parseInt(form.get("setlistId"));
        String cityName = form.get("cityName");
        String stateName = form.get("stateName");
        Integer venueSize = Integer.parseInt(form.get("venueSize"));
        String venueName = form.get("venueName");
        String venueType = form.get("venueType");
        String actName = form.get("actName");
        String musicGenre = form.get("musicGenre");
        Integer performanceRating = Integer.parseInt(form.get("performanceRating"));
        String remarks = form.get("remarks");
        String songsPerformed = form.get("songsPerformed");

        Http.MultipartFormData<File> formData = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart<File> actPhotoPart = formData.getFile("actPhoto");
        File actfile = actPhotoPart.getFile();

        byte[] actPhoto;

        try
        {
            actPhoto = Files.toByteArray(actfile);
        }
        catch (Exception e)
        {
            actPhoto = null;
        }
        Http.MultipartFormData.FilePart<File> setlistPhotoPart = formData.getFile("setlistPhoto");
        File setlistfile = setlistPhotoPart.getFile();

        byte[] setlistPhoto;

        try
        {
            setlistPhoto = Files.toByteArray(setlistfile);
        }
        catch (Exception e)
        {
            setlistPhoto = null;
        }
        Http.MultipartFormData.FilePart<File> venuePhotoPart = formData.getFile("venuePhoto");
        File venuefile = venuePhotoPart.getFile();

        byte[] venuePhoto;

        try
        {
            venuePhoto = Files.toByteArray(venuefile);
        }
        catch (Exception e)
        {
            venuePhoto = null;
        }

        Performances performances = new Performances();


        performances.setEventDate(eventDate);
        performances.setActId(actId);
        performances.setLocationId(locationId);
        performances.setSetlistId(setlistId);
        performances.setCityName(cityName);
        performances.setStateName(stateName);
        performances.setVenueSize(venueSize);
        performances.setVenueName(venueName);
        performances.setVenueType(venueType);

        performances.setActName(actName);
        performances.setMusicGenre(musicGenre);
        performances.setPerformanceRating(performanceRating);
        performances.setRemarks(remarks);

        performances.setSongsPerformed(songsPerformed);


        jpaApi.em().persist(performances);

        return redirect(routes.PerformanceController.getPerformances());
    }

    @Transactional(readOnly = true)
    public Result newPerformance()
    {


        return ok(views.html.addperformance.render());

    }

    @Transactional(readOnly = true)
    public Result getActPhoto(int actId)
    {
        Act act = jpaApi.
                em().
                createQuery("SELECT a FROM Act a WHERE actId = :id", Act.class).
                setParameter("id", actId).
                getSingleResult();

        if (act.getActPhoto() == null)
        {
            return null;
        }
        else
        {
            return ok(act.getActPhoto()).as("image.jpg");
        }
    }

    @Transactional(readOnly = true)
    public Result getSetlistPhoto(Integer setlistId)
    {
        Setlist setlist = jpaApi.
                em().
                createQuery("SELECT s FROM Setlist s WHERE setlistId = :id", Setlist.class).
                setParameter("id", setlistId).
                getSingleResult();

        if (setlist.getSetlistPhoto() == null)
        {
            return null;
        }
        else
        {
            return ok(setlist.getSetlistPhoto()).as("image.jpg");
        }
    }

    @Transactional(readOnly = true)
    public Result getVenuePhoto(int locationId)
    {
        Location venue = jpaApi.
                em().
                createQuery("SELECT l FROM Location l WHERE locationId = :id", Location.class).
                setParameter("id", locationId).
                getSingleResult();

        if (venue.getVenuePhoto() == null)
        {
            return null;
        }
        else
        {
            return ok(venue.getVenuePhoto()).as("image.jpg");
        }
    }

}