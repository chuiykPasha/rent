package rent.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ApartmentLocationForm {
    @NotEmpty
    private String location;

    private double latitude;

    private double longitude;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
