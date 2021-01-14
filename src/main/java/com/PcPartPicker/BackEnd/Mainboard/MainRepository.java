package com.PcPartPicker.BackEnd.Mainboard;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface MainRepository extends JpaRepository<Mainboard, Integer>, JpaSpecificationExecutor<Mainboard> {


    @Query("SELECT DISTINCT mainboard FROM Mainboard mainboard WHERE mainboard.id= :id")
    @Transactional(readOnly = true)
    Mainboard findByID(@Param("id") String id);

//    @Query("SELECT DISTINCT mainboard FROM Mainboard mainboard WHERE mainboard.formfactor LIKE %:mainSize%")
//    @Transactional(readOnly = true)
//    List<Mainboard> findBySize(@Param("mainSize") String mainSize);
//
//    @Query("SELECT DISTINCT mainboard FROM Mainboard mainboard WHERE mainboard.chipset= :chipset")
//    @Transactional(readOnly = true)
//    List<Mainboard> findByChipset(@Param("chipset") String chipset);
//
//    @Query("SELECT DISTINCT mainboard FROM Mainboard mainboard WHERE mainboard.socket= :socket")
//    @Transactional(readOnly = true)
//    List<Mainboard> findBySocket(@Param("socket") String socket);
//
//    @Query("SELECT DISTINCT mainboard FROM Mainboard mainboard WHERE mainboard.manufacturer =:manufacturer")
//    @Transactional(readOnly = true)
//    List<Mainboard> findByManufacturer(@Param("manufacturer") String manufacturer);
//
//    @Query("SELECT DISTINCT mainboard FROM Mainboard mainboard WHERE mainboard.fullname LIKE %:fullname%")
//    @Transactional(readOnly = true)
//    List<Mainboard> findByName(@Param("fullname") String fullname);

//    void save(Mainboard main);

//    @Query("SELECT DISTINCT mainboard FROM Mainboard mainboard")
//    @Transactional(readOnly = true)
//    List<Mainboard> findAll();
}
