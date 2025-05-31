package java_23may;

import org.jetbrains.annotations.NotNull;

//a status(assigned, in progress, or not yet assigned).•a priority, High, Low, or Medium
enum Status {
    ASSIGNED, IN_PROGRESS, IN_QUEUE,
}

enum Priority {
    High, Low, Medium
}

public class Task implements Comparable<Task> {
    private Status status;
    private Priority priority;
    private String projectName;
    private String description;
    private String assignee;

    public Task(Status status, Priority priority, String projectName, String description, String assignee) {
        this.status = status;
        this.priority = priority;
        this.projectName = projectName;
        this.description = description;
        this.assignee = assignee;
    }

    public Task(Priority priority, String projectName, String description, String assignee) {
        this(assignee == null ? Status.IN_QUEUE : Status.ASSIGNED, priority, projectName, description, assignee);
    }


    public Task(Priority priority, String projectName, String description) {
        this(priority, projectName, description, null);
    }


    public Status status() {
        return status;
    }

    public Priority priority() {
        return priority;
    }

    public String projectName() {
        return projectName;
    }

    public String description() {
        return description;
    }

    public Task setStatus(Status status) {
        this.status = status;
        return this;
    }

    public Task setPriority(Priority priority) {
        this.priority = priority;
        return this;
    }

    public Task setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public Task setDescription(String description) {
        this.description = description;
        return this;
    }

    public Task setAssignee(String assignee) {
        this.assignee = assignee;
        return this;
    }

    public String assignee() {
        return assignee;
    }


    @Override
    public String toString() {
        return "Task{" +
                "status=" + status +
                ", priority=" + priority +
                ", projectName='" + projectName + '\'' +
                ", description='" + description + '\'' +
                ", assignee='" + assignee + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;
        return projectName.equals(task.projectName) && description.equals(task.description);
    }

    @Override
    public int hashCode() {
        int result = projectName.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }

    @Override
    public int compareTo(@NotNull Task o) {
        int result = this.projectName.compareTo(o.projectName);
        if (result == 0) {
            result = this.description.compareTo(o.description);
        }
       
        return result;
    }
}
