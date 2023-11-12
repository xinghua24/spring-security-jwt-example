# Spring Security Jwt Example

call /register endpoint to register user
```shell
curl -v --location 'localhost:8080/register' \
--header 'Content-Type: application/json' \
--data '{
    "username": "testuser",
    "password": "pass"
}'
```


call /signin endpoint to get access token
```sh
curl -v --location 'localhost:8080/signin' \
--header 'Content-Type: application/json' \
--data '{
    "username": "admin",
    "password": "pass"
}'
```

call /admin endpoint. Attach access token as Bearer token
```sh
curl -v --location 'localhost:8080/api/admin' \
--header 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6IlJPTEVfQURNSU4sUk9MRV9VU0VSIiwic3ViIjoiYWRtaW4iLCJpYXQiOjE2OTk3NTMzODcsImV4cCI6MTY5OTc1Njk4N30.9GatufnIntK5cSPgm6MD3wthJY5u6LL1Bwa67PbasuE'
```