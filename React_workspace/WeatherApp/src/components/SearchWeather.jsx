import React, { useState } from 'react';

function SearchWeather() {
  const [city, setCity] = useState('');
  const [data, setData] = useState(null);
  const [error, setError] = useState('');
  const API_KEY = 'e6650d10ce208a2d83fb6824fe709229';

  async function fetchWeather() {
    if (city.trim() === '') return;

    try {
      const response = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${API_KEY}&units=metric`);
      const result = await response.json();

      if (result.cod === 200) {
        setData(result);
        setError('');
      } else {
        setData(null);
        setError(result.message);
      }
    } catch (error) {
      setData(null);
      setError('Failed to fetch data');
    }
  }


  return (
    <div className="mb-5 text-center">
      <input
        type="text"
        className="form-control w-50 d-inline-block me-2"
        placeholder="Enter a city name"
        value={city}
        onChange={(e) => setCity(e.target.value)} />

      <button className="btn btn-primary" onClick={fetchWeather}>
        <i className="fa fa-search"></i> Search
      </button>

      {error && <p className="text-danger mt-3">{error} </p>}

      {data && (
        <div className="card mx-auto text-center mt-3" style={{ maxWidth: '400px' }}>
          <div className="card-body">
            <h4>{data.name}, {data.sys.country}</h4>
            <img src={`https://openweathermap.org/img/wn/${data.weather[0].icon}@2x.png`} alt="icon" />
            <h5>{data.weather[0].description}</h5>
            <div
              className="fw-bold"
              style={{
                color:
                  data.main.temp >= 28
                    ? "red"
                    : data.main.temp < 20
                      ? "deepskyblue"
                      : "black",}}>
              🌡️ {data.main.temp}°C{" "}
              {data.main.temp >= 28
                ? "🔥"
                : data.main.temp < 20
                  ? "❄️"
                  : "🌤️"}
            </div>

            <p>
              <i className="fa fa-wind"></i> {data.wind.speed} m/s <br />
              <i className="fa fa-cloud"></i> {data.clouds.all}% clouds<br/>
             <i className="fas fa-sun"></i> Sunrise: {new Date(data.sys.sunrise * 1000).toLocaleTimeString()} <br />
             <i className="fas fa-sun"></i> Sunrise: {new Date(data.sys.sunset * 1000).toLocaleTimeString()} <br />
            </p>
          </div>
        </div>
      )}
    </div>
  );
}

export default SearchWeather;
