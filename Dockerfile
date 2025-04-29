FROM openjdk:19

WORKDIR /app

COPY . .

RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

CMD ["java", "-jar", "/app/target/hospital-managment.jar"]

