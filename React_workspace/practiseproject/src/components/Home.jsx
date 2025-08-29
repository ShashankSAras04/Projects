import React from "react";

const Home = () => {
  return (
    <div className="container mt-5">
      <h1 className="text-primary">📦 React API Project Overview</h1>
      <p className="lead">
        This website is a demonstration of fetching and displaying real-time data from various public APIs using React.
        The project features multiple components, each built using different API integrations.
      </p>

      <h3 className="mt-4 text-success">📂 Included Pages:</h3>
      <ul className="list-group list-group-flush">
        <li className="list-group-item">
          <strong>📝 User Posts</strong> – Displays posts from JSONPlaceholder API.
        </li>
        <li className="list-group-item">
          <strong>👤 GitHub Users</strong> – Shows profiles from GitHub Users API.
        </li>
        <li className="list-group-item">
          <strong>🐶 Dog Gallery</strong> – A photo gallery powered by a public image API (or FakeStore API if you meant product images).
        </li>
        <li className="list-group-item">
          <strong>👥 Random Users</strong> – Generates random user cards from RandomUser API.
        </li>
        <li className="list-group-item">
          <strong>🧾 Users Profile Cards</strong> – Displays detailed profile cards with style, using data from APIs.
        </li>
      </ul>

      <h4 className="mt-4">🚀 Technologies Used:</h4>
      <ul>
        <li>React.js (with functional components and hooks)</li>
        <li>React Router DOM for page routing</li>
        <li>Bootstrap and basic CSS for styling</li>
        <li>Public APIs: JSONPlaceholder, RandomUser, FakeStore, GitHub Users API, etc.</li>
      </ul>

      <p className="text-muted mt-4">
        📌 This project is designed to showcase my ability to work with RESTful APIs and dynamic UI rendering using modern React practices.
      </p>
    </div>
  );
};

export default Home;
