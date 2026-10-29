# To-Do List API

A REST API for task control built with Java 17 and Spring Boot 3. Users sign up, then create, list and update their own tasks. Each user only sees and changes their own tasks.

Built while following a Rocketseat Java mini-course.

**Stack:** Java 17 · Spring Boot 3.3 · Spring Data JPA · H2 · Maven · BCrypt · Docker · deployed on Render

## How it works

- **Sign up:** `POST /users/` stores the user with a BCrypt-hashed password. A username that already exists is rejected.
- **Authentication:** every route under `/tasks/` requires HTTP Basic Auth. A request filter reads the credentials, finds the user and checks the password against the stored hash.
- **Ownership:** a task belongs to the user who created it. Updating a task that belongs to someone else is rejected.
- **Validation:** a task needs a start and end date in the future, the start before the end, and a title of at most 50 characters. Unreadable request bodies get a clear error message.
- **Partial updates:** `PUT /tasks/{id}` changes only the fields sent in the request.

## Endpoints

| Method | Path | Auth | What it does |
|---|---|---|---|
| `POST` | `/users/` | none | Creates a user |
| `POST` | `/tasks/` | Basic | Creates a task for the authenticated user |
| `GET` | `/tasks/` | Basic | Lists the authenticated user's tasks |
| `PUT` | `/tasks/{id}` | Basic | Updates the given fields of one of the user's tasks |

## Try it

Create a user:

```bash
curl -X POST http://localhost:8080/users/ \
  -H "Content-Type: application/json" \
  -d '{"username": "maria", "name": "Maria", "password": "12345"}'
```

Create a task:

```bash
curl -X POST http://localhost:8080/tasks/ \
  -u maria:12345 \
  -H "Content-Type: application/json" \
  -d '{
    "title": "Study Spring Boot",
    "description": "Read the JPA chapter",
    "priority": "HIGH",
    "startAt": "2030-01-10T10:00:00",
    "endAt": "2030-01-10T12:00:00"
  }'
```

List the tasks:

```bash
curl http://localhost:8080/tasks/ -u maria:12345
```

## Running locally

With Maven (needs JDK 17):

```bash
./mvnw spring-boot:run
```

With Docker:

```bash
docker build -t todolist .
docker run -p 8080:8080 todolist
```

The API answers on `http://localhost:8080`. Data lives in an in-memory H2 database, so it is cleared every time the application stops. The H2 console is enabled at `/h2-console`.

## Tests

```bash
./mvnw test
```

There is one smoke test, which checks that the application context starts.

## Project structure

```
src/main/java/io/github/thaisdmm/todolist/
├── user/     # user entity, repository and sign-up route
├── task/     # task entity, repository and task routes
├── filter/   # Basic Auth filter for /tasks/
├── errors/   # error handler for unreadable request bodies
└── utils/    # copies only the non-null fields on updates
```
