import React from 'react';

const projects = [
  {
    name: "BLR University",
    url: "https://blruniversity.netlify.app",
    stack: "HTML, CSS",
  },
  {
    name: "Complaint Handling System",
    url: "https://chsystem.netlify.app",
    stack: "HTML, CSS",
  },
  {
    name: "Shashank Hotel",
    url: "https://shahankhotel.netlify.app",
    stack: "HTML, CSS, JavaScript",
  },
  {
    name: "Suraksha App",
    url: "https://surakshapp.netlify.app",
    stack: "HTML, CSS, Bootstrap, JavaScript",
  },
  {
    name: "Shopgy",
    url: "https://shopgy.netlify.app",
    stack: "HTML, CSS, Bootstrap",
  },
  {
    name: "Shashank YouTube",
    url: "https://shashankyoutube.netlify.app",
    stack: "HTML, CSS, Bootstrap",
  },
  {
    name: "Shashank Flipkrat",
    url: "https://shashankflipkrat.netlify.app",
    stack: "HTML, CSS, Bootstrap, React",
  },
  {
    name: "My Live Weather App",
    url: "https://myliveweatherpp.netlify.app",
    stack: "HTML, CSS, Bootstrap, React, API",
  },
  {
    name: "APIs Dashboard",
    url: "https://apisdashboard.netlify.app",
    stack: "HTML, CSS, Bootstrap, React, API",
  },
];

const Projects = () => {
  return (
    <div
      id="projects"
      className="py-5"
      style={{
        background: "linear-gradient(to right, #74ebd5, #ACB6E5)",
        minHeight: "100vh",
      }}
    >
      <div className="container">
        <h2 className="text-center fw-bold mb-4 text-dark">🚀 My Projects</h2>
        <div className="row row-cols-1 row-cols-md-3 g-4">
          {projects.map((project, index) => (
            <div className="col" key={index}>
              <div
                className="card h-100 border-0 shadow project-card"
                style={{
                  transition: "transform 0.3s",
                  borderRadius: "15px",
                }}
              >
                <div className="card-body d-flex flex-column justify-content-between">
                  <h5 className="card-title fw-bold text-danger mb-2">
                    <i className="bi bi-lightbulb-fill me-2 text-warning"></i>
                    {project.name}
                  </h5>
                  <p className="card-text mb-3">
                    <strong className="text-secondary">Tech Stack:</strong> {project.stack}
                  </p>
                  <a
                    href={project.url}
                    target="_blank"
                    rel="noopener noreferrer"
                    className="btn btn-primary mt-auto w-100"
                  >
                    <i className="bi bi-box-arrow-up-right me-1"></i> Open
                  </a>
                </div>
              </div>
            </div>
          ))}
        </div>

        <style>
          {`
            .project-card {
              background: white;
            }
            .project-card:hover {
              transform: translateY(-10px);
              box-shadow: 0 8px 16px rgba(0,0,0,0.15);
            }
          `}
        </style>
      </div>
    </div>
  );
};

export default Projects;
