import React from 'react';
import firstbodyimg from "./../assets/image/firstbodyimg.jpeg"


const Firstbody = () => {
  return (
    <div
      id="home"
      className="d-flex justify-content-center align-items-center text-center"
      style={{
        minHeight: '100vh',
        backgroundImage: `url(${firstbodyimg})`,
        backgroundSize: 'cover',
        backgroundPosition: 'center',
        backgroundRepeat: 'no-repeat',
        position: 'relative',
        padding: '2rem',
      }}
    >
      {/* Overlay to darken background */}
      <div
        style={{
          position: 'absolute',
          top: 0,
          left: 0,
          height: '100%',
          width: '100%',
          backgroundColor: 'rgba(0, 0, 0, 0.6)',
          zIndex: 0,
        }}></div>

      {/* Glassmorphic Card */}
      <div
        className="rounded-5 p-5 shadow-lg"
        style={{
          background: 'rgba(255, 255, 255, 0.15)',
          backdropFilter: 'blur(18px)',
          WebkitBackdropFilter: 'blur(18px)',
          border: '1px solid rgba(255, 255, 255, 0.2)',
          zIndex: 1,
          color: '#fff',
          maxWidth: '720px',
          boxShadow: '0 8px 32px rgba(0, 0, 0, 0.37)',
        }}>
        <h1 className="display-4 fw-bold text-warning mb-3">
          Hi, I'm Shashank S
        </h1>
        <p className="lead fs-4 mb-4">
          FullStack Developer | React Enthusiast | API Integrator
        </p>
        <div className="d-flex gap-3 justify-content-center flex-wrap">
          <a
            href="/Shashank_S_Resume.pdf"
            target="_blank"
            rel="noopener noreferrer"
            className="btn btn-lg btn-warning fw-semibold">
            <i className="bi bi-eye me-2"></i> View Resume
          </a>
          <a
            href="/Shashank_S_Resume.pdf"
            download
            className="btn btn-lg btn-outline-light fw-semibold">
            <i className="bi bi-download me-2"></i> Download Resume
          </a>
        </div>
      </div>
    </div>
  );
};

export default Firstbody;
