FROM openjdk

COPY . .

RUN ./gradle build -x test

CMD ["./gradlew", "run"]