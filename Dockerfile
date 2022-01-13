FROM gcc:9
WORKDIR /app/
COPY . /app/
COPY main.c ./
RUN gcc main.c -o main
RUN chmod +x main
