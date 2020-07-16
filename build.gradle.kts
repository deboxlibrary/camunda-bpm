allprojects {
    group = "com.deboxsoft.bpm"
    version = "0.4.0-SNAPSHOT"

}

subprojects {
    apply(plugin = "java-library")
    apply(plugin = "maven-publish")
    tasks.withType<JavaCompile> {
        sourceCompatibility = "1.8"
    }

    configure<PublishingExtension> {
        publications {
            create<MavenPublication>("maven") {
                from(components["java"])
            }
        }
        repositories {
            maven {
                name = "github"
                url = uri("https://maven.pkg.github.com/deboxlibrary/camunda-bpm-graphql")
                credentials {
                    username = System.getenv("GITHUB_USER")
                    password = System.getenv("GITHUB_KEY")
                }
            }
        }
    }
    repositories {
        mavenLocal()
        maven {
            url = uri("https://repo1.maven.org/maven2/")
        }
    }
}

