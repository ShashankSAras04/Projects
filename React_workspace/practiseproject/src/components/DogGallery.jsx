import React, { useEffect, useState } from "react";

const DogGallery = () => {
  const [dogs, setDogs] = useState([]);

  useEffect(() => {
    fetch("https://dog.ceo/api/breeds/image/random/20")
      .then((res) => res.json())
      .then((data) => setDogs(data.message));
  }, []);

  return (
    <div className="container mt-4">
      <h3 className="text-center text-success mb-4">Dog Gallery</h3>
      <div className="row row-cols-1 row-cols-md-3 row-cols-lg-4 g-4">
        {dogs.map((img, idx) => (
          <div className="col" key={idx}>
            <div className="card h-100 shadow-sm">
              <img
                src={img}
                alt="Dog"
                className="card-img-top"
                style={{ height: "250px", objectFit: "cover" }}
              />
              <div className="card-body text-center">
                <p className="card-text text-muted">
                  <i className="bi bi-camera-fill"></i> Random Dog Image
                </p>
              </div>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default DogGallery;
