package com.ohgiraffers.api.hair;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DTO {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private char gender;
    private LocalDate birth;
    private LocalDate reservationDate;
    private LocalTime reservationTime;
    private LocalDateTime created_at;

    public DTO() {
    }

    public DTO(int id, String first_name, String last_name, String email, char gender, LocalDate birth, LocalDate reservationDate, LocalTime reservationTime, LocalDateTime created_at) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.birth = birth;
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
        this.created_at = created_at;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public LocalTime getReservation() {
        return reservationTime;
    }

    public void setReservationTime(LocalTime reservation) {
        this.reservationTime = reservation;
    }

    public LocalDateTime getCreate() {
        return created_at;
    }

    public void setCreate(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "DTO{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", birth=" + birth +
                ", reservationDate=" + reservationDate +
                ", reservationTime=" + reservationTime +
                ", created_at=" + created_at +
                '}';
    }
}
