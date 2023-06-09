# Master-Spring-Boot3

- @Bean
- @Component
- @Repoisitory
- @Service
- @Controller
- @Configuration
- @ComponentScan
- @Primary
- @Qualifier
  - @Qualifier has more priority than @Primary.
- @AutoWired
- @PostConstruct
- @PreDestroy
- @Scope
  -  ConfigurableBeanFactory.SCOPE_PROTOTYPE
  -  ConfigurableBeanFactory.SCOPE_SINGLETON
- @Lazy
  - @Lazy(value = true) -> Lazy 
  - @Lazy(value = false) -> Eager (Default)
- @Named is replacement for @Component
- @Inject is replacement for @Autowired


### IOC Inversion Of Control

## logging levels
- logging.level.org.springframework
- trace
- debug
- info
- warning
- error
- off

# Spring Web
- @ConfigurationProperties
- @RestController
- @RequestMapping
- @ResponseBody
- @Controller
- **@SpringBootConfiguration => @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan**
- @GetMapping

# Actuator
- management.endpoints.web.exposure.include = *
- management.endpoints.web.exposure.include = health,metrics

# Spring Boot
- Goal of Spring Boot is to help you build PRODUCTION-READY apps QUICKLY. 
  - QUICKLY - Spring Initializr, Spring Boot Starter Projects, Spring Boot Auto Configuration, Spring Boot DevTools
  - PRODUCTION-READY - Logging, Profiles, ConfigurationProperties, Monitoring (Spring Boot Actuator)

# Spring h2 Database
- spring.h2.console.enabled = true 
- spring.datasource.url = jdbc:h2:mem:test
- spring.jpa.show-sql = true
- spring.jpa.defer-datasource-initialization=true

# MYSQL :
- docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword --env MYSQL_USER=todos-user --env MYSQL_PASSWORD=dummytodos --env MYSQL_DATABASE=todos --name mysql --publish 3306:3306 mysql:8-oracle
- spring.jpa.hibernate.ddl-auto=update 
- spring.datasource.url=jdbc:mysql://localhost:3306/todos 
- spring.datasource.username=todos-user 
- spring.datasource.password=dummytodos 
- spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
- MYSQLSH Commands
  - mysqlsh 
  - \connect todos-user@localhost:3306 
  - \sql 
  - use todos 
  - select * from todo; 
  - \quit
# JDBC to Spring JDBC to JPA to Spring Data JPA
- @Transactional
- @PersistenceContext
- @Entity
- @Id
- @Column

- To pass the request parameter we will use something call Model (ModelMap). then view pick the value 
  by Expression Language(EL)
  
# Validations using Spring Boot Starter Validation
  - Command Bean (Form Backing Object)
2 way binding
    - 
    - 
- spring.mvc.format.date = yyyy-MM-dd

  
# Acronym
- JSP : Java Server Pages
- IOC : Inversion Of Control
- CDI : Context and Dependency Injection
- API : Application Programming Interface
- REST : Representational state transfer
- JDBC : Java Database Connectivity
- JPA : Java Persistence API 
- CSRF : Cross-Site Request Forgery 

# Auto configure 
- DispatcherServletAutoConfiguration : Front Controller Pattern.
- JacksonHttpMessageConvertersConfiguration : Converts Bean into JSON Object.
- ErrorMvcAutoConfiguration : Error Mapping.
