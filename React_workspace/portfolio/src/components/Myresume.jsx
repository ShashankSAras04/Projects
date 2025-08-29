import React from 'react';

const Myresume = () => {
  return (
    <section
      id="mycv"
      style={{
        background: "linear-gradient(120deg, #f6d365 0%, #fda085 100%)",
        padding: "80px 0",
      }}>
    
      <div className="container">
        <h3 className="fw-bold text-center text-white mb-5" style={{ fontSize: "2.2rem", letterSpacing: "1px" }}>
          My Curriculum Vitae
        </h3>

        <div
          className="mx-auto p-4 resume-box"
          style={{
            maxWidth: "900px",
            background: "rgba(255, 255, 255, 0.15)",
            backdropFilter: "blur(10px)",
            borderRadius: "20px",
            color: "#333",
            boxShadow: "0 8px 30px rgba(0,0,0,0.2)",
            lineHeight: "1.8rem",
          }}
        >
          <p className="text-center fs-5">
            I'm a passionate and dedicated Full Stack Developer with strong foundational knowledge in frontend and backend technologies.
            I specialize in building dynamic and responsive websites using HTML, CSS, JavaScript, React, Bootstrap, and more.
            With hands-on experience in various projects, I constantly strive to deliver efficient and visually appealing web solutions.
          </p>

          <div className="d-flex justify-content-center gap-4 mt-4 flex-wrap">
            <a
              href="/Shashank_S_Resume.pdf"
              target="_blank"
              rel="noopener noreferrer"
              className="btn btn-light resume-btn">
              <i className="bi bi-box-arrow-up-right"></i> View Resume
            </a>
            <a
              href="/Shashank_S_Resume.pdf"
              download="Shashank_S_Resume.pdf"
              className="btn btn-success resume-btn">
              <i className="bi bi-download"></i> Download Resume
            </a>
          </div>

          <div
            className="text-center p-4 mt-5"
            style={{
              background: "#fff",
              borderRadius: "15px",
              boxShadow: "0 0 15px rgba(0,0,0,0.1)",
            }}
          >
            <p className="fs-5 mb-1">🚀 Want to build a project together?</p>
            <h4 className="fw-bold text-primary">I'm available — Freelancer Full Stack Developer</h4>
          </div>
        </div>
      </div>

      <style>{`
        .resume-btn {
          transition: all 0.3s ease;
          border-radius: 30px;
          padding: 10px 20px;
          font-weight: 500;
        }

        .resume-btn:hover {
          transform: translateY(-3px);
          box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
        }
      `}</style>
    </section>
  );
};

export default Myresume;
