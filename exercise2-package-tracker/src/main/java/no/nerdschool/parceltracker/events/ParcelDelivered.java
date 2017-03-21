package no.nerdschool.parceltracker.events;

public class ParcelDelivered extends ParcelStatus {

    private final String location;
    private final String status;

    public ParcelDelivered(String parcelId, String timestamp, String location, String status) {
        super(parcelId, timestamp, ParcelStatusType.ParcelDelivered);

        this.location = location;
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }
}
