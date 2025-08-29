import React, { useEffect, useState } from "react";

const API_USER_URL = "https://api.github.com/users";

const UsersComponent = () => {
  const [users, setUsers] = useState([]);

  const getUsersData = async () => {
    const response = await fetch(API_USER_URL);
    const data = await response.json();
    console.log(data);
    setUsers(data.slice(0,8));
  };

  useEffect(() => {
    getUsersData();
  }, []);

  return (
    <div className="container mt-4">
      <h3 className="text-center text-primary mb-4">GitHub Users</h3>
      <div className="row row-cols-1 row-cols-sm-2 row-cols-md-3 row-cols-lg-4 g-4">
        {users.map((user) => (
          <div className="col" key={user.id}>
            <div className="card h-100 shadow-sm border-primary">
              <img
                src={user.avatar_url}
                alt={user.login}
                className="card-img-top img-fluid rounded-top"
                style={{ height: "200px", objectFit: "cover" }}
              />
              <div className="card-body text-center">
                <h5 className="card-title">{user.login}</h5>
                <p className="card-text mb-1"><strong>ID:</strong> {user.id}</p>
                <p className="card-text mb-1"><strong>Type:</strong> {user.type}</p>
              </div>
              <div className="card-footer bg-light">
                <div className="d-flex flex-column gap-1">
                  <a
                    href={user.html_url}
                    target="_blank"
                    rel="noopener noreferrer"
                    className="btn btn-sm btn-outline-dark d-flex align-items-center justify-content-center gap-2"
                  >
                    <i className="bi bi-person-circle"></i> Profile
                  </a>
                  <a
                    href={user.followers_url}
                    target="_blank"
                    rel="noopener noreferrer"
                    className="btn btn-sm btn-outline-dark d-flex align-items-center justify-content-center gap-2"
                  >
                    <i className="bi bi-people-fill"></i> Followers
                  </a>
                  <a
                    href={user.following_url}
                    target="_blank"
                    rel="noopener noreferrer"
                    className="btn btn-sm btn-outline-dark d-flex align-items-center justify-content-center gap-2"
                  >
                    <i className="bi bi-person-check-fill"></i> Following
                  </a>
                  <a
                    href={user.gists_url}
                    target="_blank"
                    rel="noopener noreferrer"
                    className="btn btn-sm btn-outline-dark d-flex align-items-center justify-content-center gap-2"
                  >
                    <i className="bi bi-file-earmark-code"></i> Gists
                  </a>
                </div>
              </div>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default UsersComponent;
