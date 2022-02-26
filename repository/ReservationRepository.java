package com.laioffer.staybooking.repository;

import com.laioffer.staybooking.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import com.laioffer.staybooking.model.Stay;
import com.laioffer.staybooking.model.User;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByGuest(User guest);

    List<Reservation> findByStay(Stay stay);

    //other methods like save, delete, etc. have already been implemented by the spring boot;
    //furthermore, when a reservation is inserted into the reservation table, stay availability table should also be updated;

    List<Reservation> findByStayAndCheckoutDateAfter(Stay stay, LocalDate date);
}