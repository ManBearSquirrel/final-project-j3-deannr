package controllers;

import models.Performances;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

public class PerformanceController extends Controller
{
    private JPAApi jpaApi;

    @Inject
    public PerformanceController(JPAApi jpaApi)
    {
        this.jpaApi = jpaApi;
    }

    @Transactional(readOnly = true)
    public Result getPerformances()
    {


        List<Performances> performances =
               jpaApi.
            em().
            createNativeQuery("SELECT EventDate " +
                    "FROM eventdate " +
                    "ORDER BY EventDateId", Performances.class).
            getResultList();

        return ok(views.html.performances.render(performances));
}


}

  /*  Performances performanceDetail = (Performances) jpaApi.
            em().
            createNativeQuery("SELECT EventDateId, EventDate, ActId, LocationId, SetlistId" +
                    "FROM EventDate " +
                    "WHERE eventDateId = :eventDateId", Performances.class).
            setParameter("eventDateId", eventDateId).
            getSingleResult();
            */