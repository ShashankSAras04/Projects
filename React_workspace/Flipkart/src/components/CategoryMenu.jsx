import React from "react";
import img1 from './../assets/Images/categories/img1.webp'
import img2 from './../assets/Images/categories/img2.webp'
import img3 from './../assets/Images/categories/img3.webp'
import img4 from './../assets/Images/categories/img4.webp'
import img5 from './../assets/Images/categories/img5.webp'
import img6 from './../assets/Images/categories/img6.webp'
import img7 from './../assets/Images/categories/img7.webp'
import img8 from './../assets/Images/categories/img8.webp'
import img9 from './../assets/Images/categories/img9.webp'
import img10 from './../assets/Images/categories/img10.webp'


const categories = [
  { name: "Top Offers", image: img1 },
  { name: "Mobiles & Tablets", image: img2},
  { name: "TVs & Appliances", image: img3},
  { name: "Electronics", image: img4},
  { name: "Fashion", image: img5},
  { name: "Beauty, Food..", image: img6},
  { name: "Home & Kitchen", image: img7},
  { name: "Furniture", image: img8},
  { name: "Flight Bookings", image: img9},
  { name: "Grocery", image: img10 },
];

const CategoryMenu = () => {
  return (
    <div className="category-page-background">
      <div className="category-wrapper">
        {categories.map((item, index) => (
          <div key={index} className="category-item">
            <img src={item.image} alt={item.name} className="category-icon" />
            <div className="category-label">{item.name}</div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default CategoryMenu;
