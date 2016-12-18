FROM mattdiggins/base

EXPOSE 8080

ADD target/soap-service*.jar /app.jar
RUN ls -la /
CMD ["java", "-jar", "/app.jar"]