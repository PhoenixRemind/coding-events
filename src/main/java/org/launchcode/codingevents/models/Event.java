package org.launchcode.codingevents.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.Objects;


public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Location is required")
    @Size(max = 50, message = "Location should be 50 characters maximum. Please truncate it down.")
    private String location;

    @AssertTrue(message = "Must be listed as 'true' for a valid event. Registration is required for all events")
    @NotNull(message = "Enter 'true' into this field as all events are required registration")
    private Boolean registration;

    @Digits(fraction = 0, integer = 500, message = "Attendee limits must range between 10 and 500 members for a valid event")
    @Min(value = 10, message = "Must have at least 10 participants for a valid event")
    private Integer numAttendees;

    @NotNull(message = "Must enter a valid date to host event on")
    @Future(message = "Must enter a date scheduled beyond today")
    @DateTimeFormat(pattern="MM-dd-yyyy")
    private Date eventTime;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    public Event(String name, String description, String location, Boolean registration, Integer numAttendees, Date eventTime, String contactEmail) {
        this();
        this.name = name;
        this.description = description;
        this.location = location;
        this.registration = registration;
        this.numAttendees = numAttendees;
        this.eventTime = eventTime;
        this.contactEmail = contactEmail;
    }

    public Event() {
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getRegistration() {
        return registration;
    }

    public void setRegistration(Boolean registration) {
        this.registration = registration;
    }

    public Integer getNumAttendees() {
        return numAttendees;
    }

    public void setNumAttendees(Integer numAttendees) {
        this.numAttendees = numAttendees;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}