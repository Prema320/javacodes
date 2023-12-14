package com.xworkz.booking.repository;

import com.xworkz.booking.dto.MovieticketDto;

import java.util.List;

public interface BookMyShowRepository {

    public void addMoviesticketInfo(MovieticketDto dto);
    public MovieticketDto getBookingInfoById(int id);
    public boolean updateNoOfTicketsById(int updateNoOfTickets, int id);
    public void deleteMovieTicketInfoById(int id);
    public List<MovieticketDto> findAll();
    public  MovieticketDto getBookingInfoByMovieName(String movieName);
    public MovieticketDto getBookingInfoByTheratorname(String theaterName);
    public MovieticketDto getBookingInfoByLocation(String  location);
    public MovieticketDto getBookingInfoByTiming(String timings);
    public  MovieticketDto getBookingInfoByMoviePrice(double moviePrice);
    public List<String> getMovieNameByLocation(String location);
    public double getMoviePriceByMovieName(String movieName);
    public  List<MovieticketDto> fetchAllBookingInfo();
    public  String getTheatreNameByMovieName(String movieName);
    public List<Object[]> getMovieNameAndTheratorNameByLocation(String location);

    void updateMoviePriceByTheatreName(double updatedPrice, String theaterName);

    void deleteMovieticketDtoById(int id);


}
