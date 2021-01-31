Gradle multimodule project 
===============================
This is a plain layered java project adapted for Gradle 6.7 and following recommended practices:
- common build logic is placed into `java-common-conventions.gradle` plugin
- project properties are placed into `gradle.properties`

Description
---------------
The root project consists of 4 modules depending on each other:
- web (type: web application)
- services layer
- data layer
- integration layer

Issues
---------------
`gradle init` fails to produce correct names of the conventions plugins if project package ends with `*.gradle`, i.e. `'tld.my-domain.gradle'`. The project won't compile as a consequence.

Information used
---------------
- <a href="https://docs.gradle.org/current/userguide/organizing_gradle_projects.html">Organizing Gradle Projects</a>
- <a href="https://docs.gradle.org/current/userguide/declaring_dependencies_between_subprojects.html">Declaring Dependencies between Subprojects</a>
- <a href="https://docs.gradle.org/current/samples/sample_convention_plugins.html">Sharing build logic between subprojects Sample</a>