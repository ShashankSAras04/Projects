import React, { useRef } from "react";
import img1 from './../assets/Images/Appliances/img1.webp';
import img2 from './../assets/Images/Appliances/img2.webp';
import img3 from './../assets/Images/Appliances/img3.webp';
import img4 from './../assets/Images/Appliances/img4.webp';
import img5 from './../assets/Images/Appliances/img5.webp';
import img6 from './../assets/Images/Appliances/img6.webp';
import img7 from './../assets/Images/Appliances/img7.webp';
import img8 from './../assets/Images/Appliances/img8.webp';


const tv = [
    {
        name: "Godrej Refrigerator",
        price: "7240",
        image: img1,
    },
    {
        name: "Front Load Washing Machine",
        price: "19999",
        image: img2,
    },
    {
        name: "Semi Automatic Washing Machine",
        price: "15999",
        image: img3,
    },
    {
        name: "Double Door Refrigerator",
        price: "25999",
        image: img4,
    },
    {
        name: "Samsung Refrigerator",
        price: "14999",
        image: img5,
    },
    {
        name: "Top Load Washing Machine",
        price: "9999",
        image: img6,
    },
    {
        name: "Samsung AI Vision TV",
        price: "45000",
        image: img7,
    },
    {
        name: "XIAOMI By Fire Tv",
        price: "39999",
        image: img8,
    }
]

const Appliances = () => {
    const scrollRef = useRef(null);

    const scrollLeft = () => {
        scrollRef.current.scrollBy({ left: -400, behavior: "smooth" });
    };

    const scrollRight = () => {
        scrollRef.current.scrollBy({ left: 400, behavior: "smooth" });
    };

    return (
        <div className="deals-section">
            <h5 className="deals-title fw-bold">Tv and Appliances</h5>
            <div className="deals-carousel-wrapper">
                <button className="deals-nav left" onClick={scrollLeft}>
                    ‹
                </button>
                <div className="deals-container" ref={scrollRef}>
                    {tv.map((device, idx) => (
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

export default Appliances;
