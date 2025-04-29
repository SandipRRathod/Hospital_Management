FROM openjdk:21

# Set working directory
WORKDIR /app

# Copy everything (including pom.xml, src, mvnw, etc.)
COPY . .

# Build the app
RUN ./mvnw clean package -DskipTests

# Copy the built jar (update the jar name if needed)
COPY target/hospital-managment.jar app.jar

# Run the app
CMD ["java", "-jar", "app.jar"]
