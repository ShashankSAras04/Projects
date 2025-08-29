import React from 'react';
import achieve from "./../assets/image/Achievements.jpg";
const Achievements = () => (
  <section
    id="achievements"
    style={{
      backgroundImage: `url(${achieve})`,
      backgroundSize: 'cover',
      backgroundPosition: 'center',
      backgroundAttachment: 'fixed',
      padding: '80px 0',
      color: 'white',
    }}>
    <div className="container bg-dark bg-opacity-75 rounded p-5">
      <h2 className="text-center text-warning fw-bold mb-5">Achievements</h2>
      <div className="row justify-content-center">
        <div className="col-md-8">
          <ul className="list-group">
            <li className="list-group-item bg-transparent text-light border-light d-flex align-items-center">
              <i className="fa fa-globe text-success me-3"></i>
              Built <strong className="ms-1">9+ Live Hosted Websites</strong>
            </li>
            <li className="list-group-item bg-transparent text-light border-light d-flex align-items-center">
              <i className="fa fa-plug text-warning me-3"></i>
              Completed <strong className="ms-1">Multiple API-based Projects</strong>
            </li>
            <li className="list-group-item bg-transparent text-light border-light d-flex align-items-center">
              <i className="fa fa-code text-info me-3"></i>
              Developed with <strong className="ms-1">React Router for Dynamic Navigation</strong>
            </li>
            <li className="list-group-item bg-transparent text-light border-light d-flex align-items-center">
              <i className="fa fa-laptop-code text-danger me-3"></i>
              Proficient in <strong className="ms-1">Frontend Tech Stack (HTML, CSS, JS, Bootstrap, React)</strong>
            </li>
            <li className="list-group-item bg-transparent text-light border-light d-flex align-items-center">
              <i className="fa fa-cogs text-secondary me-3"></i>
              Strong foundation in <strong className="ms-1">Core Java Programming</strong>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </section>
);

export default Achievements;
