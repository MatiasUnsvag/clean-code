package no.nerdschool.parceltracker.events;

public class ParcelRegistered extends ParcelStatus {

    private final String fromLocation;
    private final String toLocation;

    public ParcelRegistered(String parcelId, String timestamp, String fromLocation, String toLocation) {
        super(parcelId, timestamp, ParcelStatusType.ParcelRegistred);
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }
}
