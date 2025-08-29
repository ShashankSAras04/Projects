import React, { useEffect, useState } from "react";

const PostList = () => {
  const [posts, setPosts] = useState([]);

  useEffect(() => {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((res) => res.json())
      .then((data) => setPosts(data));
  }, []);

  return (
    <div className="container mt-4">
      <h3 className="text-center text-primary mb-4">User Posts</h3>
      <div className="row row-cols-1 row-cols-md-2 row-cols-lg-3 g-4">
        {posts.map((post) => (
          <div className="col" key={post.id}>
            <div className="card h-100 shadow-sm border-secondary">
              <div className="card-body">
                <h6 className="text-muted">
                  <i className="bi bi-person-circle me-2"></i>User ID: {post.userId}
                </h6>
                <h5 className="card-title">
                  <i className="bi bi-pencil-square me-2"></i>{post.title}
                </h5>
                <p className="card-text">
                  <i className="bi bi-chat-left-text me-2"></i>{post.body}
                </p>
              </div>
              <div className="card-footer text-end bg-light">
                <span className="text-muted small">Post ID: {post.id}</span>
              </div>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default PostList;
