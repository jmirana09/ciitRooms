package sample.model;

import java.time.LocalDate;

public class Reservation {

    private String purpose;
    private LocalDate dateSubmitted;
    private LocalDate dateRequested;
    private String status;

    public Reservation() {

    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public LocalDate getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(LocalDate dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public LocalDate getDateRequested() {
        return dateRequested;
    }

    public void setDateRequested(LocalDate dateRequested) {
        this.dateRequested = dateRequested;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Reservation(String purpose, LocalDate dateSubmitted, LocalDate dateRequested, String status) {
        this.purpose = purpose;
        this.dateSubmitted = dateSubmitted;
        this.dateRequested = dateRequested;
        this.status = status;
    }

}
