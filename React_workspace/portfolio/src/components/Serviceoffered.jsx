import React from 'react';
import service from "./../assets/image/service.jpg";

const Serviceoffered = () => (
  <section
    id="services"
    style={{ padding: '80px 0', backgroundColor: '#f2f2f2' }}
  >
    <div
      id="services"
      className="container bg-dark bg-opacity-75 rounded p-5"
      style={{
        backgroundImage: `url(${service})`,
        backgroundSize: 'cover',
        backgroundPosition: 'center',
        backgroundRepeat: 'no-repeat',
        backgroundAttachment: 'fixed',
        color: '#ffffff',
      }}
    >
      <h2
        className="text-center fw-bold mb-5"
        style={{
          color: '#00d9ff',
          textShadow: '2px 2px 8px rgba(0, 0, 0, 0.8)',
        }}
      >
        My Services
      </h2>

      <div className="row justify-content-center g-4">
        <div className="col-md-4">
          <div className="service-box text-center">
            <i className="bi bi-window fs-1 text-info"></i>
            <h5 className="mt-3 text-white">FullStack Development</h5>
            <p>
              Responsive and modern UIs using React, Bootstrap, HTML & CSS. I
              bring design to life in a functional, elegant way.
            </p>
          </div>
        </div>

        <div className="col-md-4">
          <div className="service-box text-center">
            <i className="bi bi-code-slash fs-1 text-warning"></i>
            <h5 className="mt-3 text-white">API Integration</h5>
            <p>
              Real-time data integration from REST APIs, ensuring performance,
              accuracy, and interactivity in your apps.
            </p>
          </div>
        </div>

        <div className="col-md-4">
          <div className="service-box text-center">
            <i className="bi bi-phone fs-1 text-danger"></i>
            <h5 className="mt-3 text-white">Cross-Device Compatibility</h5>
            <p>
              Your website will look perfect on every screen – from mobiles to
              desktops – for a seamless user experience.
            </p>
          </div>
        </div>
      </div>
    </div>

    <style>{`
      .service-box {
        border-radius: 20px;
        padding: 30px;
        background: rgba(0, 0, 0, 0.6);
        backdrop-filter: blur(10px);
        transition: transform 0.3s ease, box-shadow 0.3s ease;
        box-shadow: 0 8px 20px rgba(0, 0, 0, 0.5);
        color: #ffffff;
      }

      .service-box:hover {
        transform: translateY(-10px);
        box-shadow: 0 12px 25px rgba(0, 255, 255, 0.4);
        cursor: pointer;
      }

      .service-box h5 {
        color: #ffffff;
        font-weight: 600;
      }

      .service-box p {
        color: #dddddd;
      }
    `}</style>
  </section>
);

export default Serviceoffered;
