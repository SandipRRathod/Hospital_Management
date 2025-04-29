FROM openjdk:21

COPY . .

RUN mvn clean package -DskipTests

COPY /target/hospital-managment.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

