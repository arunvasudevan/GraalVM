FROM oracle/graalvm-ce:19.3.0-java8 as graalvm
#FROM oracle/graalvm-ce:19.3.0-java11 as graalvm # For JDK 11
COPY . /home/app/graalvm-sample
WORKDIR /home/app/graalvm-sample
RUN gu install native-image
RUN native-image --no-server --static -cp target/graalvm-sample-*.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/graalvm-sample/graalvm-sample /app/graalvm-sample
ENTRYPOINT ["/app/graalvm-sample", "-Djava.library.path=/app"]
