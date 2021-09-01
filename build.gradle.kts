plugins {
    java
}
repositories {
    if (System.getProperty("useCustomRepository")?.toBoolean() == true) {
        val repositoryUrls: String = System.getProperty("customRepositoryUrls")
        repositories {
            val username: String? = System.getProperty("customRepositoryUsername")
            val pwd: String? = System.getProperty("customRepositoryPassword")
            repositoryUrls
                .splitToSequence(",")
                .map { it.trim() }
                .forEach {
                    maven(it) {
                        credentials {
                            this.username = username
                            this.password = pwd
                        }
                    }
                }
        }
    }
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
}

tasks.test {
    useJUnitPlatform()
}
