package com.xworkz.booking;

import com.xworkz.booking.dto.constant.Language;
import com.xworkz.booking.repository.BookMyShowRepository;
import com.xworkz.booking.dto.MovieticketDto;
import com.xworkz.booking.repository.impl.BookMyShowRepositoryImpl;
import com.xworkz.booking.service.BookMyShowService;
import com.xworkz.booking.service.impl.BookMyShowServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingExecuter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
        BookMyShowRepository show = new BookMyShowRepositoryImpl();
        BookMyShowService bookMyShowService = new BookMyShowServiceImpl();

//        for (int i = 0; i < size; i++) {
//            MovieticketDto dto1 = new MovieticketDto();
//            dto1.setMovieName(sc.next());
//            dto1.setMoviePrice(sc.nextInt());
//            dto1.setLocation(sc.next());
//            dto1.setLanguage(Language.valueOf(sc.next()));
//            dto1.setNoOfTickets(sc.nextInt());
//            dto1.setTimings(sc.next());
//            dto1.setTheaterName(sc.next());
//            bookMyShowService.movieTicketAddAndSave(dto1);
//
//        }
    //  MovieticketDto dto=new MovieticketDto();
////
//        List<MovieticketDto> list=bookMyShowService.findAll();
//        for (MovieticketDto dto1:list){
//           System.out.println(dto1);
//        }
  // System.out.println("enter the moviename to get the details");
//
     //  System.out.println(bookMyShowService.findAllByMovieName(sc.next()));
     // System.out.println(bookMyShowService.getBookingInfoByTheratorname(sc.next()));
//     System.out.println(bookMyShowService.getBookingInfoByLocation(sc.next()));
//      System.out.println(bookMyShowService.getBookingInfoByTiming(sc.next()));
//      System.out.println(bookMyShowService.getBookingInfoByMoviePrice(sc.nextInt()));
       // System.out.println(show.getMovieNameByLocation(sc.next()));


        //   System.out.println(list.toString());
       // System.out.println(list.size());





      //  System.out.println(bookMyShowService.getMovieInfoById(sc.nextInt()));
//       boolean br= bookMyShowService.updateNoOfTicketsByIdValidate(sc.nextInt(), sc.nextInt());
//        System.out.println(br);

        //  bookMyShowService.deleteMovieTicketInfoByIdValidation(sc.nextInt());
//        List<MovieticketDto> list=bookMyShowService.fetchAllBookingInfo();
//      System.out.println(bookMyShowService.fetchAllBookingInfo());
//      for (MovieticketDto dto7:list){
//          System.out.println(dto7);
//      }
        //System.out.println(bookMyShowService.getMovieNameByLocation(sc.next()));
       // System.out.println(bookMyShowService.getMovieNameByLocation(sc.next()));
//        List<Object []> list=bookMyShowService.getMovieNameAndTheratorNameByLocation(sc.next());
//        for (Object[] a:list){
//            for (Object b:a) {
//                System.out.println(b);
//            }
//        }
 bookMyShowService.updateMoviePriceByTheatreName(sc.nextInt(), sc.next());
//     bookMyShowService.deleteMovieticketDtoById(sc.nextInt());
//        System.out.println(bookMyShowService.getTheatreNameByMovieName(sc.next()));

    }
}
