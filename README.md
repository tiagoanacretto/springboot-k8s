# knote-java

Simple Spring Boot app to take notes using Kubernetes.

The code is based on the article: https://learnk8s.io/spring-boot-kubernetes-guide

Commands:
```
# Creating a docker network
docker network create knote

# Stating mongo in a container
docker run --name=mongo --rm --network=knote mongo

# Creating a image of the project
docker build -t knote-java .

# Starting the container of the project
docker run --name=knote-java --rm --network=knote -p 8080:8080 -e MONGO_URL=mongodb://mongo:27017/dev knote-java

# Starting minikube
minikube start

# Deploying the app on the minikube (the image should be deployed in a repo)
kubectl apply -f kube

# Status of the deployment
kubectl get pods --watch

# Get URL to access the app
minikube service knote --url

# Scaling the POD
kubectl scale --replicas=2 deployment/knote
```