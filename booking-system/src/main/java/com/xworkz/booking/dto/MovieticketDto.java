package com.xworkz.booking.dto;

import com.xworkz.booking.dto.constant.Language;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder//
@Entity//make enable dto mapped with db
@Table(name = "movie_ticket")
@NamedQueries(value = {
//        @NamedQuery(name = "findAll", query = "select dto from MovieticketDto as dto"),
//      @NamedQuery(name = "findBookingInfoByLocation", query = "select dev from MovieticketDto dev where dev.location=:loc"),
//        @NamedQuery(name = "findBookingInfoByMovieName", query = "select dev from MovieticketDto dev where dev.movieName=:name"),
      //  @NamedQuery(name = "findBookingInfoByTheratorname", query = "select dev from MovieticketDto dev where dev.theaterName=:the"),
    //  @NamedQuery(name = "findBookingInfoByTiming", query = "select dev from MovieticketDto dev where dev.timings=:time"),
//    @NamedQuery(name = "findBookingInfoByMoviePrice", query = " select dev from MovieticketDto dev where dev.moviePrice=:price"),
//       @NamedQuery(name = "getMovieNameByLocation", query = "select dev.movieName from MovieticketDto dev where dev.location=:locat"),
// @NamedQuery(name = "fetchAllBookingInfo", query = "from MovieticketDto"),
     //  @NamedQuery(name = "getTheatreNameByMovieName", query = "select dev.theaterName from MovieticketDto dev where dev.movieName=:ns"),
//     @NamedQuery(name = "getMovieNameAndTheratorNameByLocation", query = "select dev.movieName,dev.theaterName from MovieticketDto dev where dev.location=:lo"),
@NamedQuery(name = "updateMoviePriceByTheatreName", query = "update  MovieticketDto p set p.moviePrice=:price where p.theaterName=:theater"),
   // @NamedQuery(name = "deleteMovieticketDtoById", query = "delete from MovieticketDto s where s.id=:ids")
})
public class MovieticketDto {//dto is entity
    @Id
//    @GenericGenerator(name = "ref",strategy = "increment")
//    @GeneratedValue(generator = "ref")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//instead of generic generator and generated value we use this
    @Column(name = "id")
    private int id;
    @Column(name = "movie_name")
    private String movieName;
    @Column(name = "location")
    private String location;
    @Column(name = "language")
    @Enumerated(EnumType.STRING)
    private Language language;
    @Column(name = "movie_price")
    private double moviePrice;
    @Column(name = "nooftickets")
    private int noOfTickets;
    @Column(name = "timings")
    private String timings;
    @Column(name = "theater_name")
    private String theaterName;


}
