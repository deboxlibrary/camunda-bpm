val springbootVersion: String by project
val camundaSpringbootVersion: String by project
val graphqlSpringbootVersion: String by project

plugins {
    java
    id("org.springframework.boot")
}

springBoot {
    mainClassName = "org.camunda.bpm.getstarted.loanapproval.WebappExampleProcessApplication"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:${springbootVersion}")
    implementation("org.springframework.boot:spring-boot-dependencies:${springbootVersion}")
    implementation("org.camunda.bpm.springboot:camunda-bpm-spring-boot-starter-webapp:${camundaSpringbootVersion}")
    implementation("com.graphql-java-kickstart:graphql-spring-boot-starter:${graphqlSpringbootVersion}")
    implementation("com.graphql-java-kickstart:graphiql-spring-boot-starter:${graphqlSpringbootVersion}")
    implementation(project(":camunda-graphql"))
    implementation("com.h2database:h2:1.4.200")
    implementation("com.sun.xml.bind:jaxb-impl:2.2.3")
}
