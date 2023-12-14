package com.xworkz.booking.repository.impl;

import com.xworkz.booking.repository.BookMyShowRepository;
import com.xworkz.booking.dto.MovieticketDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class BookMyShowRepositoryImpl implements BookMyShowRepository {


    @Override
    public void addMoviesticketInfo(MovieticketDto dto) {

        Persistence persistencece = new Persistence();
        EntityManagerFactory entity = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager manager = entity.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(dto);//persist is for save
        manager.getTransaction().commit();


    }

    @Override
    public MovieticketDto getBookingInfoById(int id) {
        return new Persistence().createEntityManagerFactory("com.xworkz").createEntityManager().find(MovieticketDto.class, id);
//find is used for search
    }

    @Override
    public boolean updateNoOfTicketsById(int updateNoOfTickets, int id) {
        boolean isNoOfTicketsUpdated = false;
        EntityManager entityManager = new Persistence().createEntityManagerFactory("com.xworkz").createEntityManager();
        MovieticketDto dto = entityManager.find(MovieticketDto.class, id);

        if (dto != null) {
            entityManager.getTransaction().begin();
            dto.setNoOfTickets(updateNoOfTickets);
            entityManager.merge(dto);//merge is used for update
            entityManager.getTransaction().commit();
            System.out.println("sucessfully update the tickets by id");
            isNoOfTicketsUpdated = true;
        }

        return isNoOfTicketsUpdated;
    }

    @Override
    public void deleteMovieTicketInfoById(int id) {
        EntityManager entityManager = new Persistence().createEntityManagerFactory("com.xworkz").createEntityManager();
        MovieticketDto dto = entityManager.find(MovieticketDto.class, id);
        if (dto != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(dto);
            entityManager.getTransaction().commit();
        }

    }

    @Override
    public List<MovieticketDto> findAll() {
        EntityManager entityManager=new  Persistence().createEntityManagerFactory("com.xworkz").createEntityManager();
        Query q=entityManager.createNamedQuery("findAll");
        return q.getResultList();
    }

    @Override
    public MovieticketDto getBookingInfoByMovieName(String  movieName) {
        EntityManager entityManager=Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
        Query query=entityManager.createNamedQuery("findBookingInfoByMovieName").setParameter("name",movieName);//prepare query
        //dev is alias name(ref)
        MovieticketDto dto= (MovieticketDto) query.getSingleResult();

        return dto;
    }

    @Override
    public MovieticketDto getBookingInfoByTheratorname(String theaterName) {
        EntityManager entityManager=Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
        Query query=entityManager.createNamedQuery("findBookingInfoByTheratorname").setParameter("the",theaterName);
        MovieticketDto dto= (MovieticketDto) query.getSingleResult();

        return dto;
    }

    @Override
    public MovieticketDto getBookingInfoByLocation(String location) {
        EntityManager entityManager=Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
        Query query=entityManager.createNamedQuery("findBookingInfoByLocation").setParameter("loc",location);
        MovieticketDto dto= (MovieticketDto) query.getSingleResult();
return  dto;

    }

    @Override
    public MovieticketDto getBookingInfoByTiming(String timings) {
        EntityManager entityManager=Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
        Query query=entityManager.createNamedQuery("findBookingInfoByTiming").setParameter("time",timings);
        MovieticketDto dto= (MovieticketDto) query.getSingleResult();

        return dto;
    }

    @Override
    public MovieticketDto getBookingInfoByMoviePrice(double moviePrice) {
//        EntityManager entityManager=Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
//        Query query=entityManager.createQuery("select dev from MovieticketDto dev where dev.moviePrice='"+moviePrice+"'");
//        MovieticketDto dto= (MovieticketDto) query.getSingleResult();//casting because getsingleresult returntype object but we get entity for this reason we can cast it

         return (MovieticketDto)Persistence.createEntityManagerFactory("com.xworkz").createEntityManager().createNamedQuery("findBookingInfoByMoviePrice").setParameter("price",moviePrice).getSingleResult();
    }

    @Override
    public List<String> getMovieNameByLocation(String location) {
        return Persistence.createEntityManagerFactory("com.xworkz").createEntityManager().createNamedQuery("getMovieNameByLocation").setParameter("locat",location).getResultList();
   }

    @Override
    public double getMoviePriceByMovieName(String movieName) {

        return (double) Persistence.createEntityManagerFactory("com.xworkz").createEntityManager().createQuery("select dev.moviePrice from MovieticketDto dev where dev.movieName='"+movieName+"'").getSingleResult();

    }

    @Override
    public List<MovieticketDto> fetchAllBookingInfo() {
//        EntityManager entityManager=Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
//        Query query=entityManager.createQuery("from MovieticketDto ");
//        List<MovieticketDto> list=query.getResultList();
//        return list;

  return (List<MovieticketDto>)Persistence.createEntityManagerFactory("com.xworkz").createEntityManager().createNamedQuery("fetchAllBookingInfo").getResultList();
    }

    @Override
    public String getTheatreNameByMovieName(String movieName) {
        return (String) Persistence.createEntityManagerFactory("com.xworkz").createEntityManager().createNamedQuery("getTheatreNameByMovieName").setParameter("ns",movieName).getSingleResult();


    }

    @Override
    public List<Object[]> getMovieNameAndTheratorNameByLocation(String location) {
        return (List<Object[]>) Persistence.createEntityManagerFactory("com.xworkz").createEntityManager().createNamedQuery("getMovieNameAndTheratorNameByLocation").setParameter("lo",location).getResultList();
    }

    @Override
    public void updateMoviePriceByTheatreName(double updatedPrice, String theaterName) {
        EntityManager entityManager=Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
        entityManager.getTransaction().begin();
        Query q=entityManager.createNamedQuery("updateMoviePriceByTheatreName").setParameter("price",updatedPrice).setParameter("theater",theaterName);
        q.executeUpdate();
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteMovieticketDtoById(int id) {
        EntityManager entityManager=Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
        entityManager.getTransaction().begin();
        Query query=entityManager.createNamedQuery("deleteMovieticketDtoById").setParameter("ids",id);
        query.executeUpdate();
        entityManager.getTransaction().commit();
    }
}
//findall:from MovieDto
