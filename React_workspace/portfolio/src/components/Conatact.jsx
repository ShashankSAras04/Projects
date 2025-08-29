import React from 'react';
import contact from "./../assets/image/contact.avif";

const Contact = () => {
  return (
    <div
      id="contact"
      className="d-flex justify-content-center align-items-center"
      style={{
        backgroundImage: `url(${contact})`,
        backgroundSize: "cover",
        backgroundPosition: "center",
        backgroundRepeat: "no-repeat",
        minHeight: "100vh",
      }}
    >
      <div
        className="card p-5 text-white"
        style={{
          background: "rgba(0, 0, 0, 0.6)",
          borderRadius: "20px",
          maxWidth: "600px",
          width: "100%",
          boxShadow: "0 0 25px rgba(0,0,0,0.3)",
          backdropFilter: "blur(10px)",
        }}
      >
        <h2 className="text-center text-light mb-4">
          <i className="bi bi-person-lines-fill me-2 text-info"></i>Get in Touch
        </h2>

        <p className="text-center mb-4 fs-5" style={{ lineHeight: "1.6" }}>
          Whether you're a recruiter, collaborator, or just someone who enjoyed exploring my work — I'd love to hear from you. Let's build something great together! 🚀
        </p>

        <div className="text-center fs-2">
          <a
            href="https://github.com/ShashankSAras04"
            className="text-white me-4"
            target="_blank"
            rel="noopener noreferrer"
          >
            <i className="bi bi-github"></i>
          </a>
          <a
            href="https://www.linkedin.com/in/ss04"
            className="text-white me-4"
            target="_blank"
            rel="noopener noreferrer"
          >
            <i className="bi bi-linkedin"></i>
          </a>
          <a
            href="mailto:shashankst04@gmail.com"
            className="text-white me-4"
            target="_blank"
            rel="noopener noreferrer"
          >
            <i className="bi bi-envelope"></i>
          </a>
          <a
            href="https://wa.me/919620737569"
            className="text-white"
            target="_blank"
            rel="noopener noreferrer"
          >
            <i className="bi bi-whatsapp"></i>
          </a>
        </div>
      </div>
    </div>
  );
};

export default Contact;
