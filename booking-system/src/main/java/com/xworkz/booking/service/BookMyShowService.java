package com.xworkz.booking.service;

import com.xworkz.booking.dto.MovieticketDto;
import com.xworkz.booking.repository.BookMyShowRepository;
import com.xworkz.booking.repository.impl.BookMyShowRepositoryImpl;

import java.util.List;

public interface BookMyShowService {

    public void  movieTicketAddAndSave(MovieticketDto dto);

    public MovieticketDto getMovieInfoById(int id);
    public  boolean updateNoOfTicketsByIdValidate(int updateNoOfTickets,int id);
    public void deleteMovieTicketInfoByIdValidation(int id);
    public List<MovieticketDto> findAll();
    public MovieticketDto findAllByMovieName(String movieName);
    public MovieticketDto getBookingInfoByTheratorname(String theaterName);
    public MovieticketDto getBookingInfoByLocation(String  location);
    public MovieticketDto getBookingInfoByTiming(String timing);
    public  MovieticketDto getBookingInfoByMoviePrice(double moviePrice);
    public  List<MovieticketDto> fetchAllBookingInfo();
    public List<String> getMovieNameByLocation(String location);
    public double getMoviePriceByMovieName(String movieName);
    public List<Object[]> getMovieNameAndTheratorNameByLocation(String location);
    public void updateMoviePriceByTheatreName(double updatedPrice,String theaterName );
    public boolean updateMovieNameByTheatreName(String updatedName,String  theaterName);
    public void deleteMovieticketDtoById(int id);
    public  String getTheatreNameByMovieName(String movieName);
}
