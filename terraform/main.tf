terraform {
  required_providers {
    docker = {
      source  = "kreuzwerker/docker"
      version = "~> 3.0.1"
    }
  }
}

provider "docker" {}

resource "docker_image" "nginx" {
  name         = "nginx:alpine"
  keep_locally = false
}

resource "docker_container" "nginx_iac" {
  image = docker_image.nginx.image_id
  name  = "iac-nginx-service"
  ports {
    internal = 80
    external = 8090
  }
}
