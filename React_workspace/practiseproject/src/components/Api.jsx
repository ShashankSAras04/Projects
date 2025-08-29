import React, { useEffect, useState } from 'react';


const Api = () => {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    const getUsers = async () => {
      const api_user = await fetch('https://api.github.com/users');
      const userData = await api_user.json();
      setUsers(userData);
    };
    getUsers();
  }, []);

  return (
    <div>
      <table border="1">
        <thead>
          <tr>
            <th>Name</th>
            <th>Profile Photo</th>
          </tr>
        </thead>
        <tbody>
          {users.map(user => (
            <tr key={user.id}>
              <td>{user.login}</td>
              <td>
                <img src={user.avatar_url} alt={user.login} width="50px" />
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default Api;
