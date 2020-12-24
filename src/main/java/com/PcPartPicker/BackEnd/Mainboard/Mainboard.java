package com.PcPartPicker.BackEnd.Mainboard;


import com.PcPartPicker.BackEnd.RAM.ramPriceList;
import com.PcPartPicker.BackEnd._Model.electronicComponents;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name ="mainboard")
public class Mainboard extends electronicComponents {

    @Column(name = "socket")
    @NotEmpty
    private String socket = new String();
    
    @Column(name = "size")
    @NotEmpty
    private String size = new String();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mainboard", fetch = FetchType.EAGER)
    private List<mainPriceList> mainPriceList;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<com.PcPartPicker.BackEnd.Mainboard.mainPriceList> getMainPriceList() {
        return mainPriceList;
    }

    public void setMainPriceList(List<com.PcPartPicker.BackEnd.Mainboard.mainPriceList> mainPriceList) {
        this.mainPriceList = mainPriceList;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

}
