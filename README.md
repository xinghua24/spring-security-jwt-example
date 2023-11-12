# Spring Security Jwt Example

call /signin endpoint to get access token
```sh
curl --location 'localhost:8080/signin' \
--header 'Content-Type: application/json' \
--data '{
    "username": "admin",
    "password": "pass"
}'
```

call /admin endpoint. Attach access token as Bearer token
```sh
curl --location 'localhost:8080/api/admin' \
--header 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6IlJPTEVfQURNSU4sUk9MRV9VU0VSIiwic3ViIjoiYWRtaW4iLCJpYXQiOjE2OTk3NDk1MDIsImV4cCI6MTY5OTc1MzEwMn0.pLpa77HODLwI6yuf3wDD2yNkrcKt1PlDalvk4GCrwu0%'
```