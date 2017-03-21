package no.nerdschool.parceltracker.events;

public abstract class ParcelStatus {
    private final String parcelId;
    private final String timestamp;
    private final ParcelStatusType statusType;

    public ParcelStatus(String parcelId, String timestamp, ParcelStatusType statusType) {
        this.parcelId = parcelId;
        this.timestamp = timestamp;
        this.statusType = statusType;
    }

    public String getParcelId() {
        return parcelId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public ParcelStatusType getStatusType() { return statusType; }
}

