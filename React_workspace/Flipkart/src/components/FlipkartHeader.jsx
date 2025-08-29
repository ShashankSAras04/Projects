import React from "react";
import { FaSearch, FaUserCircle, FaShoppingCart, FaStore } from "react-icons/fa";


const FlipkartHeader = () => {
  return (
    <header
      className="d-flex align-items-center justify-content-between px-3 py-2 shadow-sm bg-white"
      style={{ position: "sticky", top: 0, zIndex: 1000 }}>
    

      <div className="d-flex align-items-center">
        <div>
          <span style={{ fontSize: 24, fontWeight: "bold", color: "#2874f0", fontFamily: "sans-serif" }}>
            Flipkart
          </span>
          <br />
          <span style={{ fontSize: 12, color: "#9e9e9e", fontFamily: "sans-serif" }}>
            Explore&nbsp;
            <span style={{ color: "#f9ab00", fontWeight: "bold" }}>Plus ✨</span>
          </span>
        </div>
      </div>

      <div className="flex-grow-1 mx-4">
        <div className="input-group rounded" style={{ backgroundColor: "#f0f5ff" }}>
          <span className="input-group-text border-0 bg-transparent">
            <FaSearch color="#717478" />
          </span>
          <input
            type="text"
            className="form-control border-0 bg-transparent"
            placeholder="Search for Products, Brands and More"
            style={{ fontSize: 14 }}
          />
        </div>
      </div>

      <div className="d-flex align-items-center gap-4">

        <div className="dropdown hover-dropdown">
          <div
            className="d-flex align-items-center dropdown-toggle"
            data-bs-toggle="dropdown"
            aria-expanded="false"
            style={{ cursor: "pointer" }}
          >
            <FaUserCircle size={18} />
            <span className="ms-2">Shashank</span>
          </div>
          <ul className="dropdown-menu mt-2">
            <li><a className="dropdown-item" href="#profile">My Profile</a></li>
            <li><a className="dropdown-item" href="#orders">Orders</a></li>
            <li><a className="dropdown-item" href="#wishlist">Wishlist</a></li>
            <li><a className="dropdown-item" href="#logout">Logout</a></li>
          </ul>
        </div>


        <div className="d-flex align-items-center position-relative">
          <FaShoppingCart size={18} />
          <span className="ms-2">Cart</span>
        </div>


        <div className="d-flex align-items-center">
          <FaStore size={18} />
          <span className="ms-2">Become a Seller</span>
        </div>

        <div className="dropdown hover-dropdown position-relative">
          <div
            data-bs-toggle="dropdown"
            aria-expanded="false"
            style={{ fontSize: 24, cursor: "pointer" }}>
            <i className="bi bi-three-dots-vertical"></i>

          </div>
          <ul className="dropdown-menu dropdown-menu-end mt-2">
            <li><a className="dropdown-item" href="#notifications">Notification Preferences</a></li>
            <li><a className="dropdown-item" href="#help">Help Center</a></li>
            <li><a className="dropdown-item" href="#advertise">Advertise</a></li>
            <li><a className="dropdown-item" href="#download">Download App</a></li>
          </ul>
        </div>


      </div>
    </header>
  );
};

export default FlipkartHeader;
