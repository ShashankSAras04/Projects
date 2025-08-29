import React from "react";


function Header() {

    return (
        <nav className="navbar navbar-expand-lg navbar-dark bg-primary">
            <div className="container">
                <a className="navbar-brand fw-bold" href="/">
                    🏢 Department List
                </a>

                <div className="collapse navbar-collapse" id="navbarNav">
                    <ul className="navbar-nav ms-auto">
                        <li className="nav-item">
                            <a className="nav-link active fw-bold" href="/">Home</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    )
}

export default Header;
