package com.xworkz.booking.service.impl;

import com.xworkz.booking.dto.MovieticketDto;
import com.xworkz.booking.repository.BookMyShowRepository;
import com.xworkz.booking.repository.impl.BookMyShowRepositoryImpl;
import com.xworkz.booking.service.BookMyShowService;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class BookMyShowServiceImpl implements BookMyShowService {

    BookMyShowRepository bookMyShowRepository;

    public BookMyShowServiceImpl() {
        bookMyShowRepository = new BookMyShowRepositoryImpl();
    }

    @Override
    public void movieTicketAddAndSave(MovieticketDto dto) {
        System.out.println("movie ticket is added and save");
        boolean isTicketsValidated = false;
        boolean isLocationValidated = false;
        boolean isMovieNameValidated = false;
        boolean isLanguageValidated = false;
        boolean isTheaterNameValidated = false;
        boolean isTimingValidated = false;
        if (dto != null) {

            if (dto.getNoOfTickets() > 0) {
                isTicketsValidated = true;
            }
            if (dto.getLocation() != null) {
                isLocationValidated = true;
            }
            if (dto.getMovieName() != null) {
                isMovieNameValidated = true;
            }
            if (dto.getLanguage() != null) {
                isLanguageValidated = true;
            }

            if (dto.getTheaterName() != null) {
                isTheaterNameValidated = true;
            }
            if (dto.getTimings() != null) {
                isTimingValidated = true;
            }
        }

        if (isLanguageValidated == true && isMovieNameValidated == true && isLocationValidated ==true && isTheaterNameValidated == true && isTicketsValidated == true && isTimingValidated == true) {
            bookMyShowRepository.addMoviesticketInfo(dto);
        }

    }

    @Override
    public MovieticketDto getMovieInfoById(int id) {
        System.out.println("invoking getMovieInfoById in service layer");
        MovieticketDto dto = null;
        if (id > 0) {
            System.out.println("id is validated invoking repository");
            dto = bookMyShowRepository.getBookingInfoById(id);
        }
        return dto;
    }

    @Override
    public boolean updateNoOfTicketsByIdValidate(int updateNoOfTickets, int id) {
      boolean  isNoOfTicketsUpdated=false;
        System.out.println("update nooftickets by id");
        if (updateNoOfTickets > 0 && id > 0) {
            bookMyShowRepository.updateNoOfTicketsById(updateNoOfTickets, id);
            isNoOfTicketsUpdated=true;
        }
      return isNoOfTicketsUpdated;
    }

    @Override
    public void deleteMovieTicketInfoByIdValidation(int id) {
        if (id >0){
            bookMyShowRepository.deleteMovieTicketInfoById(id);
        }
    }

    @Override
    public List<MovieticketDto> findAll() {
        List list=bookMyShowRepository.findAll();
        if (list != null) {
            System.out.println("list is not null");
        }
        return list;
    }

    @Override
    public MovieticketDto findAllByMovieName(String movieName) {
        if (movieName != null){
            return  bookMyShowRepository.getBookingInfoByMovieName(movieName);
        }


        return null;
    }

    @Override
    public MovieticketDto getBookingInfoByTheratorname(String theaterName) {
        if(theaterName != null){
            return  bookMyShowRepository.getBookingInfoByTheratorname(theaterName);
        }
        return null;
    }

    @Override
    public MovieticketDto getBookingInfoByLocation(String location) {
        if(location !=null){
            return bookMyShowRepository.getBookingInfoByLocation(location);
        }
        return null;
    }

    @Override
    public MovieticketDto getBookingInfoByTiming(String timing) {
        if(timing !=null){
            return bookMyShowRepository.getBookingInfoByTiming(timing);
        }
        return null;
    }

    @Override
    public MovieticketDto getBookingInfoByMoviePrice(double moviePrice) {
        if(moviePrice >0){
            return  bookMyShowRepository.getBookingInfoByMoviePrice(moviePrice);
        }
        return null;
    }

    @Override
    public List<MovieticketDto> fetchAllBookingInfo() {

        return bookMyShowRepository.fetchAllBookingInfo();
    }

    @Override
    public List<String> getMovieNameByLocation(String location) {
        if(location != null) {

            return bookMyShowRepository.getMovieNameByLocation(location);
        }
        return null;
    }

    @Override
    public double getMoviePriceByMovieName(String movieName) {
        if(movieName !=null) {
            return bookMyShowRepository.getMoviePriceByMovieName(movieName);
        }
        return 0;
    }

    @Override
    public List<Object[]> getMovieNameAndTheratorNameByLocation(String location) {
        if(location != null) {

            return bookMyShowRepository.getMovieNameAndTheratorNameByLocation(location);
        }
        return  null;
    }

    @Override
    public void updateMoviePriceByTheatreName(double updatedPrice, String theaterName) {
        if(theaterName != null && !theaterName.isEmpty() && updatedPrice>0)
            bookMyShowRepository.updateMoviePriceByTheatreName(updatedPrice,theaterName);
        }

    @Override
    public boolean updateMovieNameByTheatreName(String updatedName, String theaterName) {
        boolean isupadte=false;

        return false;
    }

    @Override
    public void deleteMovieticketDtoById(int id) {
        if (id>0){
            bookMyShowRepository.deleteMovieticketDtoById(id);
        }
    }

    @Override
    public String getTheatreNameByMovieName(String movieName) {
        if(movieName != null){
            return bookMyShowRepository.getTheatreNameByMovieName(movieName);
        }
        return null;
    }
}



