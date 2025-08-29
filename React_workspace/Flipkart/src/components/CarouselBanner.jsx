import React, { useEffect } from "react";
import { Carousel } from "bootstrap";

import img1 from './../assets/Images/CarouselBanner/img1.webp';
import img2 from './../assets/Images/CarouselBanner/img2.webp';
import img3 from './../assets/Images/CarouselBanner/img3.webp';
import img4 from './../assets/Images/CarouselBanner/img4.webp';
import img5 from './../assets/Images/CarouselBanner/img5.webp';
import img6 from './../assets/Images/CarouselBanner/img6.webp';








const CarouselBanner = () => {
  useEffect(() => {
    const carouselEl = document.getElementById("flipkartCarousel");
    if (carouselEl) {
      new Carousel(carouselEl, {
        interval: 2000,
        ride: "carousel",
        pause: false,
        wrap: true
      });
    }
  }, []);

  const scrollLeft = () => {
    const el = document.getElementById("flipkartCarousel");
    if (el) {
      const carousel = bootstrap.Carousel.getInstance(el) || new bootstrap.Carousel(el);
      carousel.prev();
    }
  };

  const scrollRight = () => {
    const el = document.getElementById("flipkartCarousel");
    if (el) {
      const carousel = bootstrap.Carousel.getInstance(el) || new bootstrap.Carousel(el);
      carousel.next();
    }
  };

  return (
    <div style={{ backgroundColor: "#f1f3f6", padding: "12px 8px" }}>
      <div
        id="flipkartCarousel"
        className="carousel slide"
        data-bs-ride="carousel"
        data-bs-interval="3000"
        style={{ overflow: "hidden" }} >
     
        <div className="carousel-indicators">
          <button type="button" data-bs-target="#flipkartCarousel" data-bs-slide-to="0" className="active" aria-current="true" aria-label="Slide 1"></button>
          <button type="button" data-bs-target="#flipkartCarousel" data-bs-slide-to="1" aria-label="Slide 2"></button>
          <button type="button" data-bs-target="#flipkartCarousel" data-bs-slide-to="2" aria-label="Slide 3"></button>
          <button type="button" data-bs-target="#flipkartCarousel" data-bs-slide-to="3" aria-label="Slide 4"></button>
          <button type="button" data-bs-target="#flipkartCarousel" data-bs-slide-to="4" aria-label="Slide 5"></button>
          <button type="button" data-bs-target="#flipkartCarousel" data-bs-slide-to="5" aria-label="Slide 6"></button>
        </div>

        <div className="carousel-inner">
          <div className="carousel-item active">
            <img src={img1} className="d-block w-100" alt="Banner 1" style={{ height: "250px", objectFit: "cover" }} />
          </div>
          <div className="carousel-item">
            <img src={img2} className="d-block w-100" alt="Banner 2" style={{ height: "250px", objectFit: "cover" }} />
          </div>
          <div className="carousel-item">
            <img src={img3} className="d-block w-100" alt="Banner 3" style={{ height: "250px", objectFit: "cover" }} />
          </div>
          <div className="carousel-item">
            <img src={img4} className="d-block w-100" alt="Banner 4" style={{ height: "250px", objectFit: "cover" }} />
          </div>
          <div className="carousel-item">
            <img src={img5} className="d-block w-100" alt="Banner 5" style={{ height: "250px", objectFit: "cover" }} />
          </div>
          <div className="carousel-item">
            <img src={img6} className="d-block w-100" alt="Banner 6" style={{ height: "250px", objectFit: "cover" }} />
          </div>
        </div>


        <button className="deals-nav left" onClick={scrollLeft} >‹</button>
        <button className="deals-nav right" onClick={scrollRight} >›</button>

      </div>
    </div>
  );
};

export default CarouselBanner;
