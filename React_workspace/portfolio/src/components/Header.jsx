import React from 'react';

const Navbar = () => {
  return (
    <nav
      className="navbar navbar-expand-lg sticky-top shadow-sm"
      style={{
        background: 'rgba(0, 0, 0, 0.6)',
        backdropFilter: 'blur(8px)',
        zIndex: 999,
      }}>
      <div className="container-fluid">
        <a className="navbar-brand text-warning fw-bold" href="#home">
          Shashank S
        </a>
        <button
          className="navbar-toggler bg-light"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNav"
          aria-controls="navbarNav"
          aria-expanded="false"
          aria-label="Toggle navigation">
          <span className="navbar-toggler-icon"></span>
        </button>
        <div className="collapse navbar-collapse justify-content-end" id="navbarNav">
          <ul className="navbar-nav">
            <li className="nav-item">
              <a className="nav-link text-light fw-semibold" href="#home">Home</a>
            </li>
            <li className="nav-item">
              <a className="nav-link text-light fw-semibold" href="#about">About</a>
            </li>
            <li className="nav-item">
              <a className="nav-link text-light fw-semibold" href="#services">Services</a>
            </li>
             <li className="nav-item">
              <a className="nav-link text-light fw-semibold" href="#achievements">Achievements</a>
            </li>
             <li className="nav-item">
              <a className="nav-link text-light fw-semibold" href="#mycv">My CV</a>
            </li>
            <li className="nav-item">
              <a className="nav-link text-light fw-semibold" href="#projects">Projects</a>
            </li>
            <li className="nav-item">
              <a className="nav-link text-light fw-semibold" href="#contact">Contact</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  );
};

export default Navbar;
