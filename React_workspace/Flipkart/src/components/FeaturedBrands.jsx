import React, { useRef } from "react";
import img1 from './../assets/Images/FeaturedBrands/img1.webp'
import img2 from './../assets/Images/FeaturedBrands/img2.webp'
import img3 from './../assets/Images/FeaturedBrands/img3.webp'
import img4 from './../assets/Images/FeaturedBrands/img4.webp'
import img5 from './../assets/Images/FeaturedBrands/img5.webp'
import img6 from './../assets/Images/FeaturedBrands/img6.webp'
import img7 from './../assets/Images/FeaturedBrands/img7.webp'


const brandImages = [
img1,img2,img3,img4,img5,img6,img7
];

const FeaturedBrands = () => {
  const scrollRef = useRef();

  const scroll = (direction) => {
    const { current } = scrollRef;
    if (direction === "left") {
      current.scrollBy({ left: -300, behavior: "smooth" });
    } else {
      current.scrollBy({ left: 300, behavior: "smooth" });
    }
  };

  return (
    <div className="featured-brands-section">
      <h5 className="section-title fw-bold">Featured Brands</h5>
      <div className="scroll-wrapper">
        <button className="deals-nav left" onClick={() => scroll("left")}>&#8249;</button>
        <div className="featured-scroll" ref={scrollRef}>
          {brandImages.map((img, idx) => (
            <div key={idx} className="brand-card">
              <a href=""><img src={img}  alt={`brand-${idx}`}/></a>
            </div>
          ))}
        </div>
        <button className="deals-nav right" onClick={() => scroll("right")}>&#8250;</button>
      </div>
    </div>
  );
};

export default FeaturedBrands;
