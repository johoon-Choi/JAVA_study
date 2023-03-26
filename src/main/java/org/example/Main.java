package org.example;

import org.example.domain.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        tasks.add(Task.builder()
                .content("go cafe")
                .build());

        tasks.add(Task.builder()
                .build());

        tasks.add(Task.builder()
                .content("go cafe")
                .isDone(true)
                .build());

        Task task1 = new Task();    // By NoArgsConstructor
        Task task2 = new Task("go to gym", true); // By AllArgsConstructor

        tasks.add(task1);
        tasks.add(task2);

        // stream() 메서드를 사용하여 tasks 리스트의 모든 요소 출력
        System.out.println("[Tasks list]");
        tasks.stream().forEach(System.out::println);

        List<Task> notDoneTasks = tasks
                .stream()
                .filter( task -> !task.getIsDone() )
                .collect(Collectors.toList());

        System.out.println("[not done Tasks list]");
        notDoneTasks.stream().forEach(System.out::println);
    }
}