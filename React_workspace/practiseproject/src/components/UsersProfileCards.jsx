import React, { useEffect, useState } from "react";


const API_PHOTOS_URL = "https://jsonplaceholder.typicode.com/users";

const UsersProfileCards = () => {
  const [users, setUsers] = useState([]);


   const getPhotosData = async () => {
    const response = await fetch(API_PHOTOS_URL);
    const data = await response.json();
    console.log(data);
    setUsers(data);
  };
  useEffect(() => {
    getPhotosData();
  }, []);

  return (
    <div className="container mt-4">
      <h3 className="text-center text-primary mb-4">User Profiles</h3>
      <div className="row row-cols-1 row-cols-md-2 row-cols-lg-3 g-4">
        {users.map((user) => (
          <div className="col" key={user.id}>
            <div className="card h-100 border-primary shadow-sm">
              <div className="card-body">
                <h5 className="card-title text-center mb-3">
                  <i className="bi bi-person-circle me-2"></i>
                  {user.name}
                </h5>
                <ul className="list-unstyled small">
                  <li><i className="bi bi-person-fill me-2"></i><strong>Username:</strong> {user.username}</li>
                  <li><i className="bi bi-envelope-fill me-2"></i><strong>Email:</strong> {user.email}</li>
                  <li><i className="bi bi-globe me-2"></i><strong>Website:</strong> {user.website}</li>
                  <li><i className="bi bi-telephone-fill me-2"></i><strong>Phone:</strong> {user.phone}</li>
                  <li><i className="bi bi-geo-alt-fill me-2"></i><strong>Address:</strong> {user.address.street}, {user.address.suite}, {user.address.city} - {user.address.zipcode}</li>
                  <li><i className="bi bi-geo-fill me-2"></i><strong>Geo:</strong> Lat {user.address.geo.lat}, Lng {user.address.geo.lng}</li>
                  <li><i className="bi bi-building me-2"></i><strong>Company:</strong> {user.company.name}</li>
                  <li><i className="bi bi-chat-text me-2"></i><strong>Catch Phrase:</strong> {user.company.catchPhrase}</li>
                  <li><i className="bi bi-briefcase me-2"></i><strong>Business:</strong> {user.company.bs}</li>
                </ul>
              </div>
              <div className="card-footer text-center bg-light">
                <a
                  href={`http://${user.website}`}
                  target="_blank"
                  rel="noopener noreferrer"
                  className="btn btn-sm btn-outline-primary"
                >
                  Visit Website
                </a>
              </div>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default UsersProfileCards;
