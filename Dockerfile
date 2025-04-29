FROM openjdk:21

WORKDIR /app

# Copy everything into the container
COPY . .

# Ensure the correct file is built
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# Make sure the final JAR file is available in the target folder and use the correct path
ENTRYPOINT ["java", "-jar", "/app/target/hospital-managment.jar"]
