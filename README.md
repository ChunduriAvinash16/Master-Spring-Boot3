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

# JDBC to Spring JDBC to JPA to Spring Data JPA
- @Transactional
- @PersistenceContext
- @Entity
- @Id
- @Column

- To pass the request parameter we will use something call Model (ModelMap). then view pick the value 
  by Expression Language(EL)
  
  
# Acronym
- JSP : Java Server Pages
- IOC : Inversion Of Control
- CDI : Context and Dependency Injection
- API : Application Programming Interface
- REST : Representational state transfer
- JDBC : Java Database Connectivity
- JPA : Java Persistence API 

  
