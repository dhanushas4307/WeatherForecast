# WeatherForecast
Implemented an Weather forcast server using SpringBoot Java and integrated Weather API from Rapid API.
* https://rapidapi.com/wettercom-wettercom-default/api/forecast9

Exposed an RestApi 
* Get the Weather forecast summary of Any city using API
http://localhost:8080/weather/berlin
    Respone --- weather Summary of the mentioned city in JSON format

* Get hourly Weather forecast details of Any city using API
http://localhost:8080/weather/berlin/hourly
    Respone --- Hourly weather Summary of the mentioned city in JSON format


Also implemented the custom header authentication 
* In this user can get the random client Id and Client secret to have a access to public facing Api's
* Those random Client Id and Client Secret will get generate at the server level whenever the Application is started. By using that user can provide those Id and secret for the headers mentioned below and can get an authorisation for the public facing api.
    X-Client-ID  --- > Client Id
    X-Client-Secret ---> Client Secret 

Note: 
  * Please do add the rapidApi client id and client host in application.properties file to get access to an external API.
  * Also for the application authorisation user will get the client Id and client secret from the application console 

TODO 

In this application we have been used a random string generation logic for generating an Id and secret, But we can also implement any algorithm based authentication mechanism for authorisation and validation.
We can enahnce the authorisation process using any authorisation mechanism like Oauth2 or Database or JWT etc.,
We can also implement the UI for this service.
