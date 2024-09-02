# Étape 1 : Build de l'application Spring Boot
FROM maven AS builder

# Définit le répertoire de travail pour le build
WORKDIR /app

# Copie les fichiers de votre projet dans le conteneur
COPY pom.xml .
COPY src ./src

# Compile le projet et construit le fichier JAR
RUN mvn clean package -DskipTests

# Étape 2 : Créer l'image finale pour exécuter l'application
FROM openjdk:17-slim

# Définit le répertoire de travail dans l'image finale
WORKDIR /app

# Copie le fichier JAR depuis l'étape de build
COPY --from=builder /app/target/*.jar app.jar

# Expose le port sur lequel l'application va tourner (modifiable selon votre configuration)
EXPOSE 9090

# Commande pour exécuter l'application Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
