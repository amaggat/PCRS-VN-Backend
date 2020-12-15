package com.PcPartPicker.BackEnd.Mainboard;


import com.PcPartPicker.BackEnd._Model.electronicComponents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name ="main")
public class Mainboard extends electronicComponents {

    @Column(name = "socket")
    @NotEmpty
    private String socket = new String();
    
    @Column(name = "main_size")
    @NotEmpty
    private String size = new String();

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

}
