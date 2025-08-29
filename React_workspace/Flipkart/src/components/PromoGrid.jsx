import React from "react";
import img1 from './../assets/Images/PromoGrid/img1.webp'
import img2 from './../assets/Images/PromoGrid/img2.webp'
import img3 from './../assets/Images/PromoGrid/img3.webp'
import img4 from './../assets/Images/PromoGrid/img4.webp'
import img5 from './../assets/Images/PromoGrid/img5.webp'
import img6 from './../assets/Images/PromoGrid/img6.webp'
import img7 from './../assets/Images/PromoGrid/img7.webp'
import img8 from './../assets/Images/PromoGrid/img8.webp'
import img9 from './../assets/Images/PromoGrid/img9.webp'


const promoImages = [
  img1,img2,img3,
  img4,img5,img6,
  img7,img8,img9
];

const PromoGrid = () => {
  return (
    <div className="promo-grid-container">
      {promoImages.map((src, idx) => (
        <div className="promo-grid-item" key={idx}>
          <a href="#"><img src={src} alt={`promo-${idx}`} className="promo-grid-img" /></a>
        </div>
      ))}
    </div>
  );
};

export default PromoGrid;
