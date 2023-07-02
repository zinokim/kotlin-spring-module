tasks.bootJar {
    enabled = true
}

tasks.jar {
    enabled = true
}

dependencies {
    implementation(project(":module-domain"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}