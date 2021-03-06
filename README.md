<p align="center">
  <h3 align="center">Spring Boot Bootstrap</h3>
  <p align="center">
    REST API Application
  </p>
</p>

## About The Project
Spring boot REST API bootstrap for a more complete project from spring initializer.  

#### Endpoints:
```
Person:
  api/person:
    /add              POST  
    /update           PUT
    /delete/{email}   DELETE
    /listAll          GET
    /get/{email}      GET
    /{email}/exists   GET
```

#### Layers Tested
```
(43 Tests)
Unit Tests:
  @Controller 
  @Service
Integration Tests:
  @WebMvcTest
  @JpaDataTest
  @SpringBootTest 
```

#### Dependencies:
```
Spring Boot DevTools,
Spring Web,
Spring Data JPA,
Lombok,
Rest Repositories,
PostgreSQL Driver
```

### Built With
* [Springboot 2.5.3]
* [Java 11]
* [Gradle]

### Usage for CLI
1. Clone the repo
   ```sh
   git clone https://github.com/joshuahenriques/spring-boot-bootstrap.git
   ```
3. In root directory build the app
   ```sh
   ./gradlew build
   ```
4. Then run it
   ```sh
   ./gradlew bootRun
   ```
   
#### Usage for Docker
1. Clone the repo
   ```sh
   git clone https://github.com/joshuahenriques/spring-boot-bootstrap.git
   ```
2. In root directory build the app
   ```sh
   docker-compose up

## Contributing
Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License
Distributed under the MIT License. See `LICENSE` for more information.

## Contact
[https://joshuahenriques.com](https://joshuahenriques.com)

[https://github.com/joshuahenriques/spring-boot-bootstrap](https://github.comjoshuahenriques/spring-boot-bootstrap)
