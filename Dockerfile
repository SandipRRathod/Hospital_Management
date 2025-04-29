FROM openjdk:21 AS build

COPY . .

RUN mvn clean package -DskipTests

COPY --from=build /target/hospital-managment.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

