# apiestudiantes

API REST de estudiantes (Spring Boot 3 + JPA + MySQL) desplegada en Railway.
GA10 · ADSO · María José Ordóñez Mendoza · Ficha 3186683

Rutas:
- GET    /api/estudiantes/listar
- GET    /api/estudiantes/{id}
- POST   /api/estudiantes
- PUT    /api/estudiantes/actualizar/{id}
- DELETE /api/estudiantes/{id}

La conexión a la base se toma de las variables MYSQLHOST, MYSQLPORT,
MYSQLDATABASE, MYSQLUSER y MYSQLPASSWORD (referencias al servicio MySQL en Railway).
