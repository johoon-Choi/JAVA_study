## 23.03.26 (일)
- stream() 을 사용하여 List 들을 출력
- builder 사용시 해야할 것
  ```java
    // build.gradle 에 아래 두 개를 추가.
    annotationProcessor 'org.projectlombok:lombok:1.18.22'
    testAnnotationProcessor 'org.projectlombok:lombok:1.18.22'
- 한국어 사용 처리
  `setting` 에서 `File Encodings` 에서 `Properties Files` 를 `UTF-8`로 처리
  - 하지만, 설정 한 뒤 잠시동안만 되고, 다시 Error 발생
  - [Build, Execution, Deployment > Build Tools > Gradle] 메뉴로 이동 후
    Build and run using을 `IntelliJ IDEA`로 변경 으로 해결
- 만능 `lombok`
  1. `@Getter`
  2. `@Setter`
  3. `@NoArgsConstructor`
  4. `@AllArgsConstructor`
- `@Builder.Default` 로 builder 사용시 default value 설정