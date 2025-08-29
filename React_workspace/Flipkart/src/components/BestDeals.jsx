import React, { useRef } from "react";
import img1 from './../assets/Images/BestDeals/img1.webp';
import img2 from './../assets/Images/BestDeals/img2.webp';
import img3 from './../assets/Images/BestDeals/img3.webp';
import img4 from './../assets/Images/BestDeals/img4.webp';
import img5 from './../assets/Images/BestDeals/img5.webp';
import img6 from './../assets/Images/BestDeals/img6.webp';


const phones = [
  {
    name: "Vivo T4 5G",
    price: "20499",
    image: img1,
  },
  {
    name: "Motorola G85 5G",
    price: "14999",
    image: img2,
  },
  {
    name: "Oppo K13 5G",
    price: "16499",
    image: img3,
  },
  {
    name: "Realme P3 5G",
    price: "15999",
    image: img4,
  },
  {
    name: "Motorola g45 5G",
    price: "10999",
    image: img5,
  },
  {
    name: "POCO F7 5G",
    price: "29999",
    image: img6
  },
  {
    name: "Vivo T4 5G",
    price: "13999",
    image: img1
  },
  {
    name: "Motorola G85 5G",
    price: "18999",
    image: img2
  },
   {
    name: "Oppo K13 5G",
    price: "18999",
    image: img3
  }
];

const BestDeals = () => {
  const scrollRef = useRef(null);

  const scrollLeft = () => {
    scrollRef.current.scrollBy({ left: -400, behavior: "smooth" });
  };

  const scrollRight = () => {
    scrollRef.current.scrollBy({ left: 400, behavior: "smooth" });
  };

  return (
    <div className="deals-section">
      <h5 className="deals-title fw-bold">Best Deals on Smartphones</h5>
      <div className="deals-carousel-wrapper">
        <button className="deals-nav left" onClick={scrollLeft}>
          ‹
        </button>
        <div className="deals-container" ref={scrollRef}>
          {phones.map((phone, idx) => (
            <div className="deals-item" key={idx}>
              <img src={phone.image} alt={phone.name} className="deals-img hover-lift-img" />
              <div className="deals-name">{phone.name}</div>
              <div className="deals-price">from ₹{phone.price}*</div>
            </div>
          ))}
        </div>
        <button className="deals-nav right" onClick={scrollRight}>
          ›
        </button>
      </div>
    </div>
  );
};

export default BestDeals;
