#!/bin/bash

echo "=============================="
echo " Secure CRUD DevOps Deployment"
echo "=============================="

echo "Stopping existing containers..."
docker-compose down -v

echo "Building Spring Boot JAR..."
mvn clean package -DskipTests

echo "Starting containers with Docker Compose..."
docker-compose up --build -d

echo "=============================="
echo " Deployment Completed!"
echo " App running at: http://localhost"
echo "=============================="
