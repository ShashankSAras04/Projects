import React, { useRef } from "react";
import img1 from './../assets/Images/Electronics/img1.webp';
import img2 from './../assets/Images/Electronics/img2.webp';
import img3 from './../assets/Images/Electronics/img3.webp';
import img4 from './../assets/Images/Electronics/img4.webp';
import img5 from './../assets/Images/Electronics/img5.webp';
import img6 from './../assets/Images/Electronics/img6.webp';
import img7 from './../assets/Images/Electronics/img7.webp';
import img8 from './../assets/Images/Electronics/img8.webp';


const electronics = [
  {
    name: "Cooling Pads",
    price: "599",
    image: img1,
  },
  {
    name: "Laptop Stands",
    price: "209",
    image: img2,
  },
  {
    name: "Top Rated Keyboards",
    price: "299",
    image: img3,
  },
  {
    name: "Best Selling Mouse",
    price: "249",
    image: img4,
  },
  {
    name: "Bestseller Mice & Keyboard",
    price: "149",
    image: img5,
  },
  {
    name: "permium Best Watches",
    price: "3099",
    image: img6,
  },
  {
    name: "Top Selling Powerbanks",
    price: "600",
    image: img7,
  },
  {
    name: "Designer Cases & Covers",
    price: "99",
    image: img8,
  }
]

const ElectronicsDeals = () => {
  const scrollRef = useRef(null);

  const scrollLeft = () => {
    scrollRef.current.scrollBy({ left: -400, behavior: "smooth" });
  };

  const scrollRight = () => {
    scrollRef.current.scrollBy({ left: 400, behavior: "smooth" });
  };

  return (
    <div className="deals-section">
      <h5 className="deals-title fw-bold">Electronics</h5>
      <div className="deals-carousel-wrapper">
        <button className="deals-nav left" onClick={scrollLeft}>
          ‹
        </button>
        <div className="deals-container" ref={scrollRef}>
          {electronics.map((device, idx) => (
            <div className="deals-item" key={idx}>
              <img src={device.image} alt={device.name} className="deals-img hover-lift-img" />
              <div className="deals-name">{device.name}</div>
              <div className="deals-price">from ₹{device.price}*</div>
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

export default ElectronicsDeals;
