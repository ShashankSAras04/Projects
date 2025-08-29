import React, { useEffect, useState } from "react";

const PhotoGallery = () => {
  const [photos, setPhotos] = useState([]);

  useEffect(() => {
    fetch("https://jsonplaceholder.typicode.com/photos?_limit=12")
      .then((res) => res.json())
      .then((data) => setPhotos(data));
  }, []);

  return (
    <div className="row">
      {photos.map((photo) => (
        <div className="col-md-3 mb-4" key={photo.id}>
          <div className="card shadow-sm h-100">
            <img src={photo.thumbnailUrl} className="card-img-top" alt={photo.title} />
            <div className="card-body">
              <p className="card-text small">{photo.title}</p>
            </div>
          </div>
        </div>
      ))}
    </div>
  );
};

export default PhotoGallery;
