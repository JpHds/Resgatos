# Etapa 1: Build da aplicação
FROM maven:3.9.9-amazoncorretto-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -X -DskipTests

# Etapa 2: Imagem final da aplicação
FROM openjdk:21-ea-10-jdk-slim
WORKDIR /app

# Copia o .jar gerado na etapa de build
COPY --from=build ./app/target/*.jar ./resgatos.jar

# Configurando o entrypoint
ENTRYPOINT ["java", "-jar", "resgatos.jar"]