# Herokuapp Selenium Java Example

End-to-end UI test examples for [The Internet (herokuapp)](https://the-internet.herokuapp.com/), written in **Java** with **Selenium 4** and **TestNG**, built with **Maven**.  
This repository demonstrates a maintainable test framework (Page Object Model), cross-browser runs, and headless execution suitable for local dev and CI.

---

## ✨ Features

- Selenium 4 WebDriver with W3C actions
- TestNG test runner (parallel friendly)
- Page Object Model (POM) structure
- Automatic driver management via WebDriverManager (no manual chromedriver)
- Configurable via Maven system properties (base URL, browser, headless, etc.)
- Basic reporting via Surefire + TestNG reports (optionally Allure)
- Sample flows covering common widgets on `the-internet.herokuapp.com`

---

## 🧰 Tech Stack

- **Language:** Java (11+ recommended; 17 LTS works great)
- **Build:** Maven 3.8+
- **Tests:** TestNG
- **UI Automation:** Selenium 4.x
- **Driver Management:** WebDriverManager
- **Reports:** TestNG/Surefire (Allure optional)

> If your local Java is older/newer, update the `maven-compiler-plugin` and/or toolchain as needed.

---

## 📁 Project Structure

## 🚀 Getting Started

### 1) Prerequisites
- **Java 11+** (`java -version`)
- **Maven 3.8+** (`mvn -v`)
- Internet access (tests open live herokuapp)
  
No need to manually download ChromeDriver/GeckoDriver—**WebDriverManager** handles it.

### 2) Clone
```bash
git clone https://github.com/nuwanthikaishani/herokuapp-selenium-java-example.git
cd herokuapp-selenium-java-example




