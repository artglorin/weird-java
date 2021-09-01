pluginManagement {
    if (System.getProperty("useCustomPluginRepository")?.toBoolean() == true) {
        val repositoryUrls: String = System.getProperty("customPluginRepositoryUrls")
        repositories {
            val username: String? = System.getProperty("customPluginRepositoryUsername")
            val pwd: String? = System.getProperty("customPluginRepositoryPassword")
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
}

rootProject.name = "weird-java"
