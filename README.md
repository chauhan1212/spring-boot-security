# spring-boot-security1

### 03 Adding Spring Security to new Spring Boot project

```
http://localhost:8080/
```

- Username : user
- Password: It will get printed when application starts

---

#### How it works

- 01. Adding spring security in pom.xml
- 02. It will treat as filter (intercepter of the requests) and redirect to login page based on authentication
- 03. Password will be generated in console. ( it is used for development purpose only). Username will be "User"


| Software                      | Version                |
| ------                        | ------                 |
| Java                          |  "1.8.0_161"           |
| Apache Maven                  |  "3.8.5"               |
| Spring Boot                   |  "2.4.1"               |
| spring-boot-starter-security  |  "Same as Spring Boot" |
