FROM openjdk:21

WORKDIR /app

# Copy the already-built jar into the image
COPY target/hospital-managment.jar app.jar

# Run the app
CMD ["java", "-jar", "app.jar"]
