val camundaEngineVersion: String by project
val graphqlSpringbootVersion: String by project
val camundaSpringbootVersion: String by project
val springbootVersion: String by project

plugins {
    id("war")
}
dependencies {
    implementation("org.camunda.bpm.springboot:camunda-bpm-spring-boot-starter:${camundaSpringbootVersion}")
    implementation("com.graphql-java-kickstart:graphql-spring-boot-starter:${graphqlSpringbootVersion}")
    implementation("com.graphql-java-kickstart:graphiql-spring-boot-starter:${graphqlSpringbootVersion}")
    implementation("org.springframework.boot:spring-boot-starter-web:${springbootVersion}")
    testImplementation("org.camunda.bpm.springboot:camunda-bpm-spring-boot-starter-test:${camundaSpringbootVersion}")
    testImplementation("org.springframework:spring-test:5.2.1.RELEASE")
    testImplementation("org.camunda.bpm.assert:camunda-bpm-assert:5.0.0")
    testImplementation("com.h2database:h2:1.4.200")
    testImplementation("com.jayway.jsonpath:json-path:2.4.0")
    testImplementation("com.google.code.gson:gson:2.8.6")
    providedCompile("org.camunda.bpm:camunda-engine:${camundaEngineVersion}")
    providedCompile("org.camunda.bpm:camunda-engine-plugin-spin:${camundaEngineVersion}")
    providedCompile("org.camunda.spin:camunda-spin-dataformat-all:1.7.4")
    providedCompile(project(":camunda-graphql"))
}
