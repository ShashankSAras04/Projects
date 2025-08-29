import React from "react";

function Footer() {
    return (
        <footer className="bg-dark text-white mt-5 pt-4 pb-2" style={{ "position": "fixed", "bottom": 0, "width": "100%" }}>
            <div className="container text-center">
                <p className="mb-1">
                    &copy; {new Date().getFullYear()} Department List. All Rights Reserved.
                </p>
                <p className="small">
                    Built with React & Bootstrap
                </p>
            </div>
        </footer>
    )
}

export default Footer;
