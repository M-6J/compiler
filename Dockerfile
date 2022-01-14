FROM openjdk:8
WORKDIR /app/
COPY ./* ./
ENV CLASSPATH="./antlr-4.9.2-complete.jar:$CLASSPATH"
RUN javac Main.java