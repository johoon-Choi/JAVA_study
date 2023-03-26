package org.example.domain;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    private String content;
    @Builder.Default // Builder 에 대해 default 값을 부여.
    private Boolean isDone = false;
    // Constructor 를 사용하여 isDone 에 null 값이 들어가면,
    // default value 로 false 로 지정.
    // builder 를 사용하면 default value setting 안 된다.

    @Override
    public String toString() {
        return "Task{" +
                "name='" + content + '\'' +
                ", isDone=" + isDone +
                '}';
    }
}
