# gh-copilot-workspace-demo-01

[![Build Status](https://github.com/pmeleroa/gh-copilot-workspace-demo-01/actions/workflows/ci.yml/badge.svg)](https://github.com/pmeleroa/gh-copilot-workspace-demo-01/actions/workflows/ci.yml)
[![Code Coverage](https://img.shields.io/codecov/c/github/pmeleroa/gh-copilot-workspace-demo-01)](https://codecov.io/gh/pmeleroa/gh-copilot-workspace-demo-01)
[![License](https://img.shields.io/github/license/pmeleroa/gh-copilot-workspace-demo-01)](https://github.com/pmeleroa/gh-copilot-workspace-demo-01/blob/main/LICENSE)

## Summary

This repository contains a demo project for a Spring Boot application. The application provides a simple RESTful API with a single endpoint `/hello` that returns a "Hello, World!" message.

## Local Usage Guide

### Prerequisites

- Java 17
- Maven
- Docker (optional, for building Docker images)
- Kubernetes (optional, for deploying to a Kubernetes cluster)

### Running the Application Locally

1. Clone the repository:

   ```bash
   git clone https://github.com/pmeleroa/gh-copilot-workspace-demo-01.git
   cd gh-copilot-workspace-demo-01
   ```

2. Build the application using Maven:

   ```bash
   mvn clean install
   ```

3. Run the application:

   ```bash
   java -jar target/demo-0.0.1-SNAPSHOT.jar
   ```

4. Access the `/hello` endpoint:

   Open your web browser and navigate to `http://localhost:8080/hello`. You should see the message "Hello, World!".

### Building and Running the Docker Image

1. Build the Docker image:

   ```bash
   docker build -t demo:latest .
   ```

2. Run the Docker container:

   ```bash
   docker run -p 8080:8080 demo:latest
   ```

3. Access the `/hello` endpoint:

   Open your web browser and navigate to `http://localhost:8080/hello`. You should see the message "Hello, World!".

### Deploying to a Kubernetes Cluster

1. Ensure you have a Kubernetes cluster running and `kubectl` configured to interact with it.

2. Apply the Kubernetes manifests:

   ```bash
   kubectl apply -f k8s/
   ```

3. Access the `/hello` endpoint:

   Open your web browser and navigate to `http://<your-cluster-ip>/hello`. You should see the message "Hello, World!".

