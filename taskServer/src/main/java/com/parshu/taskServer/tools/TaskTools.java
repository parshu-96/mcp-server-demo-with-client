package com.parshu.taskServer.tools;

import org.springframework.ai.mcp.annotation.McpTool;
import org.springframework.ai.mcp.annotation.McpToolParam;

import java.util.ArrayList;
import java.util.List;

public class TaskTools {
    private final List<String> tasks = new ArrayList<>();

    @McpTool(name="Create task", description="Create a new task with the given title.")
    public String createTask(@McpToolParam(description = "The title of the task to create",required = true) String title) {
        tasks.add(title);
        return "Task created: " + title;
    }

    @McpTool(name="List tasks", description="List all tasks.")
    public List<String> listTasks() {
        return List.copyOf(tasks);
    }

    @McpTool(name="Complete task", description="Mark a task as completed.")
    public String completeTask(@McpToolParam(description = "The title of the task to complete",required = true) String title) {
        if (tasks.remove(title)) {
            return "Task completed: " + title;
        } else {
            return "Task not found: " + title;
        }
    }

}
