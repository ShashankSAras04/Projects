import React from "react";

const Footer = () => {
  return (
    <div className="container-fluid bg-dark text-white pt-5 pb-3 px-4 fw-bold">
      <div className="row">
       
        <div className="col-md-2 mb-3">
          <h6 className="text-secondary">ABOUT</h6>
          <ul className="list-unstyled fw-bold small">
            <li><a href="#" className="text-white text-decoration-none">Contact Us</a></li>
            <li><a href="#" className="text-white text-decoration-none">About Us</a></li>
            <li><a href="#" className="text-white text-decoration-none">Careers</a></li>
            <li><a href="#" className="text-white text-decoration-none">Flipkart Stories</a></li>
            <li><a href="#" className="text-white text-decoration-none">Press</a></li>
            <li><a href="#" className="text-white text-decoration-none">Corporate Information</a></li>
          </ul>
        </div>

        {/* Group Companies */}
        <div className="col-md-2 mb-3">
          <h6 className="text-secondary">GROUP COMPANIES</h6>
          <ul className="list-unstyled fw-bold small">
            <li><a href="#" className="text-white text-decoration-none">Myntra</a></li>
            <li><a href="#" className="text-white text-decoration-none">Cleartrip</a></li>
            <li><a href="#" className="text-white text-decoration-none">Shopsy</a></li>
          </ul>
        </div>

        {/* Help */}
        <div className="col-md-2 mb-3">
          <h6 className="text-secondary">HELP</h6>
          <ul className="list-unstyled fw-bold small">
            <li><a href="#" className="text-white text-decoration-none">Payments</a></li>
            <li><a href="#" className="text-white text-decoration-none">Shipping</a></li>
            <li><a href="#" className="text-white text-decoration-none">Cancellation & Returns</a></li>
            <li><a href="#" className="text-white text-decoration-none">FAQ</a></li>
          </ul>
        </div>

        {/* Consumer Policy */}
        <div className="col-md-2 mb-3">
          <h6 className="text-secondary">CONSUMER POLICY</h6>
          <ul className="list-unstyled fw-bold small">
            <li><a href="#" className="text-white text-decoration-none">Cancellation & Returns</a></li>
            <li><a href="#" className="text-white text-decoration-none">Terms Of Use</a></li>
            <li><a href="#" className="text-white text-decoration-none">Security</a></li>
            <li><a href="#" className="text-white text-decoration-none">Privacy</a></li>
            <li><a href="#" className="text-white text-decoration-none">Sitemap</a></li>
            <li><a href="#" className="text-white text-decoration-none">Grievance Redressal</a></li>
            <li><a href="#" className="text-white text-decoration-none">EPR Compliance</a></li>
          </ul>
        </div>

        {/* Mail Us */}
        <div className="col-md-2 mb-3">
          <h6 className="text-secondary">Mail Us:</h6>
          <small className="d-block">
            Flipkart Internet Private Limited, Buildings Alyssa, Begonia & Clove Embassy Tech Village,<br />
            Outer Ring Road, Devarabeesanahalli Village,<br />
            Bengaluru, 560103,<br />
            Karnataka, India
          </small>

          <div className="mt-3">
            <h6 className="text-secondary">Social:</h6>
            <span className="me-2">
              <a href="#" className="text-white"><i className="bi bi-facebook fs-5"></i></a>
            </span>
            <span className="me-2">
              <a href="#" className="text-white"><i className="bi bi-twitter-x fs-5"></i></a>
            </span>
            <span className="me-2">
              <a href="#" className="text-white"><i className="bi bi-youtube fs-5"></i></a>
            </span>
            <span>
              <a href="#" className="text-white"><i className="bi bi-instagram fs-5"></i></a>
            </span>
          </div>
        </div>

        {/* Registered Office Address */}
        <div className="col-md-2 mb-3">
          <h6 className="text-secondary">Registered Office Address:</h6>
          <small className="d-block fw-bold">
            Flipkart Internet Private Limited, Buildings Alyssa, Begonia & Clove Embassy Tech Village,<br />
            Outer Ring Road, Devarabeesanahalli Village, Bengaluru, 560103, Karnataka, India
          </small>
          <div className="mt-2 small">
            <div>CIN : <strong>U51109KA2012PTC066107</strong></div>
            <div>
              Telephone:{" "}
              <a href="tel:044-45614700" className="text-info">044-45614700</a> /
              <a href="tel:044-67415800" className="text-info"> 044-67415800</a>
            </div>
          </div>
        </div>
      </div>

      {/* Bottom Row */}
      <hr className="bg-secondary" />
      <div className="d-flex justify-content-between flex-wrap align-items-center text-white small">
        <div className="d-flex flex-wrap align-items-center gap-4">
          <a href="#" className="text-white text-decoration-none">
            <i className="bi bi-briefcase text-warning me-1"></i> Become a Seller
          </a>
          <a href="#" className="text-white text-decoration-none">
            <i className="bi bi-megaphone text-warning me-1"></i> Advertise
          </a>
          <a href="#" className="text-white text-decoration-none">
            <i className="bi bi-gift text-warning me-1"></i> Gift Cards
          </a>
          <a href="#" className="text-white text-decoration-none">
            <i className="bi bi-question-circle text-warning me-1"></i> Help Center
          </a>
        </div>

        <div className="text-muted">
          © 2007-2025 Flipkart.com
        </div>

        <div>
          <img src="https://img.icons8.com/color/48/000000/visa.png" alt="Visa" width="32" />
          <img src="https://img.icons8.com/color/48/000000/mastercard.png" alt="Mastercard" width="32" />
          <img src="https://img.icons8.com/color/48/000000/amex.png" alt="Amex" width="32" />
          <img src="https://img.icons8.com/color/48/000000/rupay.png" alt="RuPay" width="32" />
          <img src="https://img.icons8.com/color/48/000000/discover.png" alt="Discover" width="32" />
          <img src="https://img.icons8.com/color/48/000000/paypal.png" alt="PayPal" width="32" />
          <img src="https://img.icons8.com/ios-filled/50/000000/apple-pay.png" alt="Apple Pay" width="32" />
        </div>
      </div>
    </div>
  );
};

export default Footer;
