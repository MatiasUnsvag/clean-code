package no.nerdschool.parceltracker;

import no.nerdschool.parceltracker.events.ParcelRegistered;
import no.nerdschool.parceltracker.events.ParcelScanned;

import java.time.LocalDateTime;
import java.util.UUID;

public class ParcelTrackerApp {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().toString());

        Tracker tracker = new Tracker();

        String parcelId = UUID.randomUUID().toString();
        ParcelRegistered status1 = new ParcelRegistered(
                parcelId,
                LocalDateTime.now().toString(),
                "Bergen",
                "Oslo"
        );

        ParcelScanned status2 = new ParcelScanned(
                parcelId,
                LocalDateTime.now().toString(),
                "Oslo"
        );

        tracker.handleNewParcelStatus(status1);
        tracker.handleNewParcelStatus(status2);
        System.out.println(tracker.getParcelStatusForParcelId(parcelId));
    }
}
