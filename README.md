# MCP Server Demo with Client

A demo project showcasing the **Model Context Protocol (MCP)** using Spring AI. It contains a Spring Boot MCP server (`taskServer`) that exposes task-management tools and a Spring Boot client (`taskClient`) that connects to the server and integrates with an OpenAI model.

## Project Structure

- **`taskServer`** — Spring Boot MCP server exposing task tools to create, list, and complete tasks.
- **`taskClient`** — Spring Boot MCP client that consumes the server's tools and integrates OpenAI model support.

## Features

The `TaskTools` class exposes these MCP tools:

| Tool | Description |
|---|---|
| `Create_task` | Create a task with a title. |
| `List_tasks` | List all tasks. |
| `Complete_task` | Mark a task as completed. |

> **Note:** MCP tool names must use supported identifier characters. If your code uses names with spaces, replace them with names such as `create_task`, `list_tasks`, and `complete_task`, and use the same names when testing.

## Tech Stack

- Java 21
- Spring Boot 4.1.1
- Spring AI BOM 2.0.1
- Gradle Wrapper (reported version: 9.7.1)

## Prerequisites

- JDK 21 or newer
- No separate Gradle installation is required when using the included Gradle Wrapper.

## Getting Started

Run the server and client in separate terminals.

### 1. Start the MCP server

From the repository root:

```bash
cd taskServer
```

On Windows PowerShell:

```powershell
.\gradlew.bat bootRun
```

On macOS/Linux:

```bash
./gradlew bootRun
```

### 2. Start the MCP client

Open a second terminal from the repository root:

```bash
cd taskClient
```

On Windows PowerShell:

```powershell
.\gradlew.bat bootRun
```

On macOS/Linux:

```bash
./gradlew bootRun
```

> Confirm the configured server/client ports and any required environment variables in each module's `application.yml` before running. The exact OpenAI API-key variable and client behavior are not specified in this README draft.

## Build

Run from the relevant module directory:

```bash
./gradlew build
```

On Windows PowerShell, use:

```powershell
.\gradlew.bat build
```

## Tests

Run from the relevant module directory:

```bash
./gradlew test
```

On Windows PowerShell, use:

```powershell
.\gradlew.bat test
```

The client module includes a Spring Boot context-load test (`TaskClientApplicationTests`).

## Notes

- The task list is stored in memory by the provided `TaskTools` implementation. Tasks may be lost when the server restarts.
- Check each module's `build.gradle` and `application.yml` for the exact dependencies, ports, and runtime configuration.
- Add the project's chosen license before publishing.

## License

No license has been specified yet.
