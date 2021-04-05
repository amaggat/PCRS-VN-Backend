package com.pcpartpicker.backend.model.mainboard;


import com.pcpartpicker.backend.model.PcProfile;
import com.pcpartpicker.backend.model.base.electronicComponents;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name ="mainboard")
public class Mainboard extends electronicComponents {

    @Column(name = "socket")
    @NotEmpty
    private String socket = new String();
    
    @Column(name = "formfactor")
    @NotEmpty
    private String formfactor = new String();

    @Column(name = "sizeofram")
    @NotEmpty
    private String sizeofram = new String();

    @Column(name = "slot")
    @NotEmpty
    private Integer memory_slot;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "main")
    private List<PcProfile> pcProfile;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mainboard", fetch = FetchType.EAGER)
    private List<mainPriceList> PriceList;

    public String getFormfactor() {
        return formfactor;
    }

    public void setFormfactor(String size) {
        this.formfactor = size;
    }

    public List<mainPriceList> getPriceList() {
        return PriceList;
    }

    public void setPriceList(List<mainPriceList> mainPriceList) {
        this.PriceList = mainPriceList;
    }

    public String getSizeofram() {
        return sizeofram;
    }

    public void setSizeofram(String sizeofram) {
        this.sizeofram = sizeofram;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public Integer getMemory_slot() {
        return memory_slot;
    }

    public void setMemory_slot(Integer memory_slot) {
        this.memory_slot = memory_slot;
    }
}
