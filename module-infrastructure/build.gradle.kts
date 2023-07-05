tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}

noArg {
    // TableEntity NoArgument Constructor
    annotation("jakarta.persistence.Entity")
}

dependencies {
    implementation(project(":module-domain"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    runtimeOnly("com.h2database:h2")
}