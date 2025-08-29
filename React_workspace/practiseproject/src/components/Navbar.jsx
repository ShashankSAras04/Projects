import React from "react";
import { Link } from "react-router-dom";

const Navbar = () => {
  return (
    <nav className="navbar navbar-expand-lg navbar-dark bg-dark px-3 sticky-top shadow-sm">
      <Link className="navbar-brand fw-bold" to="/">📊 Dashboard</Link>
      <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
        <span className="navbar-toggler-icon"></span>
      </button>

      <div className="collapse navbar-collapse" id="navbarNav">
        <ul className="navbar-nav ms-auto gap-2">
          <li className="nav-item">
            <Link className="nav-link" to="/posts">User Posts</Link>
          </li>
          <li className="nav-item">
            <Link className="nav-link" to="/users">GitHub Users</Link>
          </li>
          <li className="nav-item">
            <Link className="nav-link" to="/comments">Dog Gallery</Link>
          </li>
          <li className="nav-item">
            <Link className="nav-link" to="/random-users">Random Users</Link>
          </li>
          <li className="nav-item">
            <Link className="nav-link" to="/user-cards">Users profile</Link>
          </li>
        </ul>
      </div>
    </nav>
  );
};

export default Navbar;
