# AI Resume Builder

AI Resume Builder is a full-stack application that helps users create, enhance, and manage resumes using AI.
The project follows a **monorepo structure** with a **Spring Boot backend** and a **React frontend**.

---

## Project Structure

```
AI RESUME/
│
├── resume-ai-backend/      # Spring Boot backend
├── resume-ai-frontend/     # React frontend
├── .gitignore
└── README.md
```

---

## Tech Stack

### Backend

* Java 17+
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* Maven
* PostgreSQL / MySQL

### Frontend

* React
* JavaScript (ES6+)
* HTML, CSS
* Axios
* Node.js, npm

---

## Prerequisites

Ensure the following are installed:

* Java 17 or higher
* Maven
* Node.js (v18+ recommended)
* npm or yarn
* Git

---

## Backend Setup (Spring Boot)

```bash
cd resume-ai-backend
```

### Configure Application

Create `application-local.yml` or `.env` (ignored by git):

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/ai_resume
    username: postgres
    password: password
```

### Run Backend

```bash
mvn spring-boot:run
```

Backend runs on:

```
http://localhost:8080
```

---

## Frontend Setup (React)

```bash
cd resume-ai-frontend
```

### Install Dependencies

```bash
npm install
```

### Run Frontend

```bash
npm start
```

Frontend runs on:

```
http://localhost:3000
```

---

## Frontend ↔ Backend Communication

Update API base URL if required:

```js
const API_BASE_URL = "http://localhost:8080";
```

---

## Environment Variables

### Backend

* `.env`
* `application-local.yml`
* `application-dev.yml`

### Frontend

* `.env`
* `.env.local`

> These files are intentionally excluded from version control.

---

## Git Workflow

```bash
git clone <repository-url>
git checkout -b feature/your-feature
git commit -m "Add new feature"
git push origin feature/your-feature
```

---

## Future Enhancements

* AI-based resume suggestions
* Resume templates
* PDF export
* Authentication & authorization
* Docker & Docker Compose
* CI/CD with GitHub Actions

---


Just tell me what you want next.
