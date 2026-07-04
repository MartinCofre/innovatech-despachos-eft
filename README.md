# Innovatech Chile — Plataforma de Despachos

Proyecto desarrollado para la Evaluación Final Transversal - Introducción a Herramientas DevOps.

## Descripción

Plataforma compuesta por un Frontend, un Backend y una base de datos relacional, con
integración, pruebas, empaquetado y despliegue automatizados mediante GitHub Actions,
orquestada en producción sobre Amazon ECS (Fargate).

## Componentes

- **Frontend**: React (Vite)
- **Backend**: Spring Boot (Java)
- **Base de datos**: MySQL — contenedor local / Amazon RDS en producción

## Cómo levantar el entorno en local

```bash
docker-compose up --build
```

Esto levanta los 3 servicios (frontend, backend y base de datos) conectados mediante
redes internas de Docker, con persistencia de datos vía un volumen nombrado.

## CI/CD

El pipeline en GitHub Actions se activa automáticamente al hacer push a la rama `deploy`,
ejecutando: build de las imágenes → pruebas → publicación en Amazon ECR → actualización
del servicio en Amazon ECS.

## Arquitectura en producción

- VPC dedicada con subredes públicas y privadas
- Application Load Balancer como único punto de entrada
- Clúster ECS Fargate con Auto Scaling (min 1 / max 3 tareas)
- Amazon RDS (MySQL) en subred privada
- Observabilidad mediante Amazon CloudWatch (logs y métricas)

Diagrama de arquitectura completo disponible en el informe técnico entregado.


Martín Cofré — Sección 001D
