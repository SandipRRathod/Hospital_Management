FROM openjdk:21

# Expose port
EXPOSE 8080

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file to the container
COPY target/hostpital-managment.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]