# turbo-octo-pancake

## PRE-REQUISITE
- Java 1.8.0_241
- Gradle 6.3. Refer to https://gradle.org/install/ for installation
- For ideal IDE, please use intellij IDEA
- Install Plugin `Cucumber for Java` and `Gherkin` from Code Editor (e.g in Intellij IDEA you can find it on `IntellijIDEA > Preferences > Plugins > Browse Repositories`)
- Chromedriver: this repo contains `chromedriver for MAC version 106.0.5249.61` in `src > main > resources`. If you use different OS or Chrome version:
    - Please download `chromedriver` from https://chromedriver.chromium.org/downloads
    - Choose version according to your Chrome version and your machine OS
    - Replace current chromedriver with newly downloaded chromedriver

## HOW TO RUN
- Open IntelliJ IDEA and select Import Project
- Locate the project folder and open
- If there is an error No JDK, setup the gradle on `Preferences > search "Gradle" > Choose Gradle JVM `
- For run the test:
   - Open `src > test > java > helper > TestRunner`, right click and choose `Run TestRunner` OR
   - Open terminal and run `gradle build`

## TEST REPORT
- After finished the test, you can see the report in: `target > index.html`
- Open the file using browser