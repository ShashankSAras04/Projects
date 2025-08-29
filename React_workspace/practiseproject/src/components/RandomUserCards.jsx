import React, { useEffect, useState } from "react";

const RandomUserCards = () => {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    fetch("https://randomuser.me/api/?results=20")
      .then((res) => res.json())
      .then((data) => setUsers(data.results));
  }, []);

  return (
    <div className="container mt-4">
      <h3 className="text-center text-primary mb-4">Random User Profiles</h3>
      <div className="row row-cols-1 row-cols-md-3 row-cols-lg-4 g-4">
        {users.map((user, idx) => (
          <div className="col" key={idx}>
            <div className="card h-100 shadow-sm">
              <img
                src={user.picture.large}
                alt={user.name.first}
                className="card-img-top"
              />
              <div className="card-body text-center">
                <h5 className="card-title">
                  {user.name.first} {user.name.last}
                </h5>
                <p className="card-text">
                  <i className="bi bi-geo-alt-fill"></i> {user.location.city},{" "}
                  {user.location.country}
                </p>
                <p className="card-text">
                  <i className="bi bi-envelope-fill"></i> {user.email}
                </p>
                <p className="card-text text-capitalize">
                  <i className="bi bi-person-fill"></i> {user.gender}
                </p>
              </div>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default RandomUserCards;
