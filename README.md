# DZ AI

Starter foundation for the DZ AI personal assistant.

## Requirements
- Java 21
- Maven 3.6.3 or newer (or use the Maven wrapper if added later)

## Run in GitHub Codespaces
Open a terminal in the Codespace and run:

```bash
java -version
mvn spring-boot:run
```

When the app starts, open the forwarded port shown by Codespaces (usually **8080**).

- Dashboard: `/`
- Status endpoint: `/api/status`

## Project structure

```text
src/main/java/com/dzai/
  DzAiApplication.java
  web/StatusController.java
src/main/resources/static/
  index.html
```

This is a starter foundation, not the complete AI agent yet. Keep API keys and passwords out of GitHub; use Codespaces secrets or environment variables for credentials.
