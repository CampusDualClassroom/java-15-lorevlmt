package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expirationDate;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public FreshMerchandise(String name, String uniqueId, String responsibleId) {
        super(name, uniqueId, responsibleId);
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getFormattedDate(Date formattedDate) {
        return this.sdf.format(this.getExpirationDate());
    }

    @Override
    public String getSpecificData() {
        StringBuilder builder = new StringBuilder();

        builder.append("Producto: ");
        builder.append(this.name);
        builder.append("\n");
        builder.append("Comercio: ");
        builder.append(this.responsibleId);
        builder.append("\n");
        builder.append("Almacén: ");
        builder.append(getLocation());
        builder.append("\n");
        builder.append("Fecha de caducidad: ");
        builder.append(sdf.format(this.getExpirationDate()));

        return builder.toString();
    }

    public void printSpecificData() {
        System.out.println("Mercancía:");
        System.out.println(this.getSpecificData());
    }
}
