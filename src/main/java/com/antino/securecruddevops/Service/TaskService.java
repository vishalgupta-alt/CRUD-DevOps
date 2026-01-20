package com.antino.securecruddevops.Service;

import com.antino.securecruddevops.Entity.Task;
import com.antino.securecruddevops.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repo;

    public Task create(Task task) {
        return repo.save(task);
    }

    public List<Task> getAll() {
        return repo.findAll();
    }

    public Task update(Long id, Task task) {
        Task existing = repo.findById(id).orElseThrow();
        existing.setTitle(task.getTitle());
        existing.setDescription(task.getDescription());
        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

