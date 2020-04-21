package pl.warkocz.cinema.domain;

import java.time.LocalDateTime;

public class Ticket {

    private Long id;

    private LocalDateTime showTime;

    private User customer;

    private Movie movie;

    private Hall room;

}
