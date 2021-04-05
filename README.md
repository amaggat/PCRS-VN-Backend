# PcPartPickerVN_BackEndService
Pc Part Picker (but in VN)

This Back-end use MySQL.

1. Add application.properties to src/main/resources with below content

```
spring.jpa.hibernate.ddl-auto=none
spring.datasource.url= jdbc:mysql://localhost:3306/pc_parts_picker
spring.datasource.username= //username
spring.datasource.password= //password 
```

2. Import database.sql to MySQL.

3. Run backend.BackEndApplication.

If you want Front-end source code, visit https://github.com/manhdung20112000/PCbuilder-frontend
