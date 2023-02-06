# OWASP Juice Shop Vulnerability Test Automation Framework with Selenium

### Content index

- [Description](#descripcion)
- [Team](#integrantes)
- [Teacher](#teacher)
- [Tools](#tools)
- [Test architecture](#test-architecture)

### Descripción

Proyecto Final de **Vulnerability Test** del 
**Diplomado Testing de Software**
por la [Universidad Cátolica Boliviana "San Pablo"](https://lpz.ucb.edu.bo/) de Bolivia.

### Team

- [ARIZACA CALLEJAS GUISELA LIBERTAD](https://www.linkedin.com/in/guisela-arizaca/)
- [BAUDAZIO SANCHEZ JUAN DE DIOS](https://www.linkedin.com/in/juandediosbaudaziosanchez/)

### Teacher

- [Rolando Eynar Pari Cahuna](https://www.linkedin.com/in/eynar-pari/)

### Tools

- Java 11
- Intellij IDEA (optional)
- Selenium WebDriver
- Gson for Test Data
- Log4j2
- AllureReport
- TestNG for Run Test
- OWASP Zed Attack Proxy (ZAP)

### Test architecture

- ScreenPlay pattern
- Factory pattern for Web drivers
- Singleton pattern for Json Test Data
- Test Data Using Model Classes
- Support Chrome
- API Owasp ZAP - scan 
- API Owasp ZAP - status
- API Owasp ZAP - scanProgress
- API Owasp ZAP - htmlreport
- Run Local

### Gradle CommandLine List to Run Test to Terminal

- Run single Test Class: gradle clean test --tests RegisterTest

### XPATH Search Sample in the Chrome Console

- `<div _ngcontent-lvl-c158="" class="ng-star-inserted">All Products</div>:` `$x("//*[contains(text(),'All Products')]")`

### cssSelector Search Sample in the Chrome Console

- cssSeletor Lists: `$$(".cc-dismiss")`
