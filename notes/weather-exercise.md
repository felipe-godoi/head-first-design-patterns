# WeatherData:
Implements <<Subject>>

# 1 abstract class display, which implements Observer interface:
Display implements <<Observer>>

# 3 classes inheriting Display for the displays:
DisplayOne:
    - temp;
    - humidity;
    - pressure;

DisplayTwo:
    - avgTemp;
    - minTemp;
    - MaxTemp;

DisplayThree:
    - forecast
