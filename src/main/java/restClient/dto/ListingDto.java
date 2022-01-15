package restClient.dto;

import java.sql.Date;

public class ListingDto extends AbstractDto{

    private int idlisting;
    private String city;
    private Date startdate;
    private Date enddate;
    private int roomIdroom;
    private int roomtypeIdroomtype;

    public ListingDto() {
    }

    public void setIdlisting(int idlisting) {
        this.idlisting = idlisting;
    }

    public int getIdlisting() {
        return this.idlisting;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getStartdate() {
        return this.startdate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Date getEnddate() {
        return this.enddate;
    }

    public void setRoomIdroom(int roomIdroom) {
        this.roomIdroom = roomIdroom;
    }

    public int getRoomIdroom() {
        return this.roomIdroom;
    }

    public void setRoomtypeIdroomtype(int roomtypeIdroomtype) {
        this.roomtypeIdroomtype = roomtypeIdroomtype;
    }

    public int getRoomtypeIdroomtype() {
        return this.roomtypeIdroomtype;
    }
}