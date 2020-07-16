
rootProject.name = "camunda-bpm-graphql-root"
include(":camunda-graphql")
include(":camunda-graphql-webapp")
include(":camunda-graphql-example")
project(":camunda-graphql").projectDir = file("graphql/schema")
project(":camunda-graphql-webapp").projectDir = file("graphql/webapp")
project(":camunda-graphql-example").projectDir = file("graphql/example")

pluginManagement {
    val springbootVersion: String by settings
    plugins {
        id("org.springframework.boot") version springbootVersion
    }
}
