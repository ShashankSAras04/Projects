import React, { useEffect, useState } from 'react';

const API_KEY = 'e6650d10ce208a2d83fb6824fe709229';

const cities = [
  "Delhi", "Mumbai", "Bangalore", "Chennai", "Kolkata",
  "Hyderabad", "Ahmedabad", "Pune", "Jaipur", "Lucknow",
  "New York", "London", "Tokyo", "Paris", "Dubai",
  "Toronto", "Singapore", "Sydney", "Cape Town", "Moscow"
];

const TopLocationsWeather = () => {
  const [weatherList, setWeatherList] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      const responses = await Promise.all(
        cities.map(city =>
          fetch(`https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${API_KEY}&units=metric`)
        )
      );
      const jsonData = await Promise.all(responses.map(r => r.json()));
      const validData = jsonData.filter(item => item.cod === 200);
      setWeatherList(validData);
    };

    fetchData();
  }, []);

  return (
    <div className="container ">
      <h4 className="text-center mb-3">🌍 Top Cities Weather</h4>
      <div className="row ">
        {weatherList.map((item, index) => (
          <div className="col-md-4 mb-4" key={index}>
            <div className="card shadow border-primary">
              <div className="card-body text-center">
                <h5 className="fw-bold">{item.name}, {item.sys.country}</h5>
                <img src={`https://openweathermap.org/img/wn/${item.weather[0].icon}@2x.png`} alt="icon" />
                <p className="text-capitalize fw-bold">{item.weather[0].description}</p>
                <p className="fw-bold">
                  <span>
                    🌡️{" "}
                    <span
                      style={{
                        color:
                          item.main.temp >= 28
                            ? "red"
                            : item.main.temp < 20
                              ? "deepskyblue"
                              : "black",}}>
                      {item.main.temp}°C{" "}
                      {item.main.temp >= 28
                        ? "🔥"
                        : item.main.temp < 20
                          ? "❄️"
                          : "🌤️"}
                    </span>
                  </span>
                </p>


                <p className="fw-bold"><i className="fa fa-wind"></i>{item.wind.speed} m/s</p>
                <p className="fw-bold"><i className="fa fa-cloud"></i>{item.clouds.all}% clouds</p>
                <p className="fw-bold "><i className="fa fa-thermometer-half"></i> Feels like: {item.main.feels_like}°C</p>
                <p className="fw-bold "><i className="fas fa-sun"></i> Sunrise: {new Date(item.sys.sunrise * 1000).toLocaleTimeString()} </p>
                <p className="fw-bold "><i className="fas fa-sun"></i> Sunset: {new Date(item.sys.sunset * 1000).toLocaleTimeString()} </p>


              </div>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default TopLocationsWeather;
