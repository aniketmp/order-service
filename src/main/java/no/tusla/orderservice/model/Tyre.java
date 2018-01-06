package no.tusla.orderservice.model;

public class Tyre {

    private Integer Id;
    private String vin;

    private String tyreId;
    private String tyreDescription;
    private String model;

    public Tyre(String tyreId, String tyreDescription) {
        this.tyreId = tyreId;
        this.tyreDescription = tyreDescription;
    }


    public String getTyreId() {
        return tyreId;
    }

    public void setTyreId(String tyreId) {
        this.tyreId = tyreId;
    }

    public String getTyreDescription() {
        return tyreDescription;
    }

    public void setTyreDescription(String tyreDescription) {
        this.tyreDescription = tyreDescription;
    }

}
