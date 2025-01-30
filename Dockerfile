FROM openjdk:11-jre-slim

# Create a non-root user
RUN useradd -ms /bin/bash appuser

# Set the user to appuser
USER appuser

# Set the working directory
WORKDIR /app

# Copy the jar file
COPY target/SimpleTimeService-0.0.1-SNAPSHOT.jar app.jar

# Expose the port
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
