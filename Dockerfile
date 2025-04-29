FROM openjdk:21

WORKDIR /app

COPY . .

RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

ENTRYPOINT ["java", "-jar", "target/hospital-managment.jar"]
