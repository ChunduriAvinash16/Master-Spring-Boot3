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
- @AutoWired
- @PostConstruct
- @PreDestroy
- @Scope
  -  ConfigurableBeanFactory.SCOPE_PROTOTYPE
  -  ConfigurableBeanFactory.SCOPE_SINGLETON
- @Lazy
- @Named
- @Inject


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
- @SpringBootConfiguration => @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan


# Actuator
- management.endpoints.web.exposure.include = *
- management.endpoints.web.exposure.include = health,metrics

# Spring Boot
- Goal of Spring Boot is to help you build PRODUCTION-READY apps QUICKLY. 
  - QUICKLY - Spring Initializr, Spring Boot Starter Projects, Spring Boot Auto Configuration, Spring Boot DevTools
  - PRODUCTION-READY - Logging, Profiles, ConfigurationProperties, Monitoring (Spring Boot Actuator)