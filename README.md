# [PcPartPickerVN](name)

## [Introduction](#introduction)
PcPartPickerVN is our project on Web application development course at [VNU University of Engineering and Technology](http://uet.vnu.edu.vn/).
We were inspired by [PcPartPicker](http://pcpartpicker.com), a website that allows users create their own PC and check their compatibility, it also allow users to compare price from different retail stores.

## [Demo](demo)

1. The dashboard:
![Dashboard](src/main/frontend/images/dashboard.png)
2. The main area which allows users to build their PC:
![Main area](src/main/frontend/images/build-pc.png)
3. Browsing PC item:
![Browsing](src/main/frontend/images/browse-product.png)
4. We already create some finised build which users can use immediately.
![Guild](src/main/frontend/images/guild.png)
5. All the products were crawled from different retail stores. We want to create a website where users can easily check for their items for their wishlist with its price, promo from retailer ...
![Product-detail](src/main/frontend/images/view-product.png)

## [Database](data)
We crawl product, price, promo, ... from many retail stores such as [PhongVu](https://phongvu.vn/), [AnPhat](https://www.anphatpc.com.vn/), [HanoiComputer](https://www.hanoicomputer.vn/), ... that users can access easly.

*Note:* All the data we have are crawled from their public website.

**The database architecture:**
![DB-Architecture](src/main/frontend/images/database.jpg)

*For more detail, please checkout our backend service [here](https://github.com/amaggat/PcPartPickerVN_BackEndService)*

## [Usage](usage)
We are still working on deployment. 
The website will avaiable someday soon, thanks for your patient.

## Back-end

1. Add application.properties to src/main/resources with below content

```
spring.jpa.hibernate.ddl-auto=none
spring.datasource.url= jdbc:mysql://localhost:3306/pc_parts_picker
spring.datasource.username= 
spring.datasource.password=  
```

2. Import database.sql to MySQL.

3. Run BackEndApplication.

If you want Front-end source code, visit https://github.com/manhdung20112000/PCbuilder-frontend

## Front-end

In the project directory, you can run:

### `npm start`

Runs the app in the development mode.\
Open [http://localhost:3000](http://localhost:3000) to view it in the browser.

The page will reload if you make edits.\
You will also see any lint errors in the console.

### `npm test`

Launches the test runner in the interactive watch mode.\
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

### `npm run build`

Builds the app for production to the `build` folder.\
It correctly bundles React in production mode and optimizes the build for the best performance.

The build is minified and the filenames include the hashes.\
Your app is ready to be deployed!

See the section about [deployment](https://facebook.github.io/create-react-app/docs/deployment) for more information.


## Learn More

You can learn more in the [Create React App documentation](https://facebook.github.io/create-react-app/docs/getting-started).

To learn React, check out the [React documentation](https://reactjs.org/).


## [Our team](team)
- Dung M. Nguyen 
[Contact: [GitHub](https://github.com/manhdung20112000) | [Facebook](https://www.facebook.com/nmd2000)]

- Thanh T. Tran
[Contact: [GitHub](https://github.com/amaggat) | [Facebook](https://www.facebook.com/thanhtt.amg/)]

- Hung P. Quang
[Contact: [GitHub](https://github.com/heor2807) | [Facebook](https://www.facebook.com/srw.king)]

- Binh M. Le
[Contact: [Facebook](https://www.facebook.com/luke.shrek)]

- Hieu V. Pham
[Contact: [GitHub](https://github.com/hieuphamjr) | [Facebook](https://www.facebook.com/HieuPhamJR11)]

##### *Special thanks to:*
- Anh T. Tran
[Contact: [GitHub](https://github.com/zzNuAzz) | [Facebook](https://www.facebook.com/SoNguyenTo216/)]
  
- Nhat Q. Nguyen [Contact: [GitHub](https://github.com/fuzeless) | [Facebook](https://www.facebook.com/fuzeless/)]


