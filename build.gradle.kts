import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.4.5"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.4.32"
	kotlin("plugin.spring") version "1.4.32"
}

group = "com.virginpulse"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-web-services")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

	implementation("io.cucumber:cucumber-java:6.10.0")
	implementation("io.cucumber:cucumber-junit:6.10.0")
	implementation("io.cucumber:cucumber-java8:6.10.0")
	implementation("io.cucumber:cucumber-spring:6.10.0")
	implementation("io.cucumber:cucumber-junit-platform-engine:6.10.0")

	implementation("org.springframework:spring-jdbc:5.3.3")
	implementation("org.springframework.boot:spring-boot-starter-data-jdbc:2.4.4")
	implementation("org.postgresql:postgresql:42.1.4")
	implementation("com.zaxxer:HikariCP:3.4.3")
	implementation("org.springframework.data:spring-data-jdbc:1.1.2.RELEASE")
	implementation("mysql:mysql-connector-java:8.0.17")

	//implementation("io.cucumber:gherkin:6.10.0")
	implementation("io.cucumber:cucumber-jvm:6.10.0")
	implementation("io.cucumber:cucumber-core:6.10.0")
	implementation("net.masterthought:cucumber-reporting:5.5.0")
	//implementation("com.github.spacialcircumstances:gradle-cucumber-reporting:0.1.23")
	testImplementation("io.rest-assured:rest-assured:4.3.3")
	implementation("org.apache.poi:poi-ooxml:5.0.0")
	implementation("org.apache.poi:poi:5.0.0")
	implementation("commons-io:commons-io:2.8.0")
	implementation("org.apache.commons:commons-csv:1.8")
	implementation("org.springframework.boot:spring-boot-test")
	implementation("org.springframework:spring-test")
	testImplementation("org.assertj:assertj-core:3.18.0")
	implementation("com.sun.xml.bind:jaxb-osgi:2.3.0")

	//implementation("javax.xml.bind:jaxb-api:2.3.0")
	//implementation("com.sun.xml.bind:jaxb-core:2.3.0")
	//implementation("com.sun.xml.bind:jaxb-impl:2.3.0")

	compileOnly("org.projectlombok:lombok")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	runtimeOnly("org.postgresql:postgresql")
	annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

	testImplementation("com.h2database:h2:1.4.200");

	//testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.1")
	//testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
	//testCompileOnly("junit:junit:4.13")
	//testRuntimeOnly("org.junit.vintage:junit-vintage-engine")

}

tasks.test {
	//useJUnitPlatform()
	useJUnitPlatform {
		includeTags("demo")
		excludeTags("slow")
	}
	reports.html.isEnabled = true
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
