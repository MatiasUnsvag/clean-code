package no.nerdschool.parceltracker;

import no.nerdschool.parceltracker.events.ParcelStatus;

import java.util.ArrayList;

public class Tracker implements ParcelTracker {

    ArrayList<ParcelStatus> Events;

    public Tracker() {
        Events = new ArrayList<>();
    }

    @Override
    public String getParcelStatusForParcelId(String parcelId) {
        return Events
                .get(Events.size() - 1)
                .toString();
    }

    @Override
    public void handleNewParcelStatus(ParcelStatus parcelStatus) {
        System.out.println("handleNewParcelStatus called for parcel with id: " + parcelStatus.getParcelId() + ", statusType: " + parcelStatus.getStatusType());
        if(Events.stream().anyMatch(e -> .))
    }
}
