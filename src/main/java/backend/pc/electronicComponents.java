package backend.pc;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@MappedSuperclass
public abstract class electronicComponents {
    private String manufacturer = new String();

    @Column(name = "seriename")
    @NotEmpty
    private String serieName = new String();

    @Column(name = "chipset")
    @NotEmpty
    private String chipset = new String();

    @Column(name= "image")
    @NotEmpty
    private String image = new String();

//    @Column(name = "price")
//    @NotEmpty
//    @Digits(fraction = 2, integer = 4)
//    private double price = 0.0;

    @Column(name = "fullname")
    @NotEmpty
    private String fullname = new String();

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id = new String();

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSerieName() {
        return serieName;
    }

    public void setSerieName(String serieName) {
        this.serieName = serieName;
    }

    public boolean isNew() {
        return this.id == null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
