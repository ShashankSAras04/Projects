import React, { useState, useEffect } from 'react';
import profilepic from "./../assets/image/pic.jpg"

const AboutMe = () => {
  const [showButton, setShowButton] = useState(false);

  useEffect(() => {
    const handleScroll = () => {
      setShowButton(window.scrollY > 300);
    };
    window.addEventListener('scroll', handleScroll);
    return () => window.removeEventListener('scroll', handleScroll);
  }, []);

  const scrollToTop = () => {
    window.scrollTo({ top: 0, behavior: 'smooth' });
  };

  return (
    <section
      id="about"
      style={{
        background: 'linear-gradient(135deg, #667eea, #764ba2)',
        padding: '80px 0',
        position: 'relative',
      }}
    >
      <div className="container">
        <h2 className="text-center text-white fw-bold mb-5 display-5">About Me</h2>
        <div
          className="row align-items-center p-4 rounded-4 shadow-lg"
          style={{
            background: 'rgba(255, 255, 255, 0.1)',
            backdropFilter: 'blur(10px)',
            border: '2px solid rgba(255, 255, 255, 0.1)',
            boxShadow: '0 0 30px rgba(0,0,0,0.3)',
          }}>
      
          <div className="col-md-6 text-center mb-4 mb-md-0">
            <img
              src={profilepic}
              className="img-fluid rounded-circle border border-4 border-light shadow-lg"
              style={{ width: '280px', height: '280px', objectFit: 'cover' }}/>
            
          </div>
          <div className="col-md-6 text-white">
            <h4 className="fw-bold mb-3 fs-3">
              I'm <span className="text-warning">Shashank S</span>
            </h4>
            <p>
              A passionate developer from <strong>Bengaluru, India</strong> with hands-on experience in:
              <span className="fw-bold text-info"> HTML, CSS, Bootstrap, JavaScript, React</span> for frontend,
              and <span className="fw-bold text-danger">Core Java</span> for backend.
            </p>
            <p>
              I enjoy building practical, efficient, and beautiful solutions that solve real-world problems.
              My work spans responsive UIs, API integrations, and scalable backend logic.
            </p>
            <div className="d-flex flex-wrap gap-2 my-3">
              <span className="badge bg-light text-dark fw-bold">HTML</span>
              <span className="badge bg-warning text-dark fw-bold">CSS</span>
              <span className="badge bg-info text-dark fw-bold">JavaScript</span>
              <span className="badge bg-primary fw-bold">Bootstrap</span>
              <span className="badge bg-success fw-bold">React</span>
              <span className="badge bg-danger fw-bold">API Integration</span>
              <span className="badge bg-dark fw-bold">Core Java</span>
            </div>
            <ul className="list-unstyled mt-4">
              <li><strong>📱 Phone:</strong> +91 9620737569</li>
              <li><strong>📍 Location:</strong> Bengaluru, India</li>
            </ul>
          </div>
        </div>
      </div>

      {showButton && (
        <button
          onClick={scrollToTop}
          className="btn btn-light text-dark"
          style={{
            position: 'fixed',
            bottom: '30px',
            right: '30px',
            borderRadius: '50%',
            width: '50px',
            height: '50px',
            fontSize: '22px',
            zIndex: 1000,
            transition: 'transform 0.2s ease',
            boxShadow: '0 0 15px rgba(0,0,0,0.5)',
          }}
          title="Back to Top"
          onMouseOver={(e) => e.currentTarget.style.transform = 'scale(1.1)'}
          onMouseOut={(e) => e.currentTarget.style.transform = 'scale(1)'}
        >
          ↑
        </button>
      )}
    </section>
  );
};

export default AboutMe;
