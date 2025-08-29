import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import SearchWeather from './components/SearchWeather.jsx';
import TopLocationsWeather from './components/TopLocationsWeather.jsx';

function App() {
  return (
    <div className="container mt-4">
      <h2 className="text-center mb-4">🌍 Global Weather Dashboard</h2>
      <SearchWeather />
      <hr />
      <TopLocationsWeather />
    </div>
  );
}

export default App;
