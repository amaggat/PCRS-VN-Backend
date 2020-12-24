package com.PcPartPicker.BackEnd.PSU;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "psu_price_list")
public class psuPriceList {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fid")
    private PowerSupplyUnit psu;

    @Column(name= "link")
    @NotEmpty
    private String link = new String();

    @Column(name= "img")
    @NotEmpty
    private String img = new String();

    @Column(name= "name")
    @NotEmpty
    private String name = new String();

    @Column(name= "price")
    @NotEmpty
    private int price;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
