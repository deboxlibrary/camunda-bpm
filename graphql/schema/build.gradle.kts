val camundaEngineVersion: String by project
val graphqlSpringbootVersion: String by project
val camundaSpringbootVersion: String by project
val springbootVersion: String by project

dependencies {
    implementation("com.graphql-java-kickstart:graphql-java-tools:5.7.1")
    implementation("org.camunda.bpm:camunda-engine-rest:${camundaEngineVersion}")
    implementation("commons-io:commons-io:2.6")
    implementation("javax.ws.rs:javax.ws.rs-api:2.1.1")
    implementation("com.auth0:java-jwt:3.9.0")
    implementation("com.graphql-java-kickstart:graphql-spring-boot-starter:${graphqlSpringbootVersion}")
    implementation("org.camunda.bpm:camunda-engine:${camundaEngineVersion}")
    implementation("org.camunda.spin:camunda-spin-core:1.7.4")
}
