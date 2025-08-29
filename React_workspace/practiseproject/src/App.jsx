import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Navbar from "./components/Navbar";

import PostsPage from "./pages/PostsPage";
import UsersPage from "./pages/UsersPage";
import CommentsPage from "./pages/CommentsPage";
import RandomUsersPage from "./pages/RandomUsersPage";
import UserCardsPage from "./pages/UserCardsPage";
import Home from "./components/Home";

const App = () => {
  return (
    <Router>
      <Navbar />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/posts" element={<PostsPage />} />
        <Route path="/users" element={<UsersPage />} />
        <Route path="/comments" element={<CommentsPage />} />
        <Route path="/random-users" element={<RandomUsersPage />} />
        <Route path="/user-cards" element={<UserCardsPage />} />
      </Routes>
    </Router>
  );
};

export default App;
