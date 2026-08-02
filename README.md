# Standard JPA Server Initialization - setting up the core Spring Boot application, configuring PostgreSQL database connectivity, and establishing the foundational server architecture.
# Description
This project represents the successful creation and initialization of a universal server backend from scratch using Spring Boot and PostgreSQL. It establishes the core application architecture, integrates Spring Data JPA for data management, and sets up a robust foundation for building scalable backend services.

## Requirements Compliance
- Java 23 runtime configuration.
- Spring Boot 3.3.0 enterprise starter stack.
- PostgreSQL database integration via HikariCP connection pooling.
- Clean Code architecture and proper package structuring.

## Architectural Stack
- **Language:** Java 23
- **Framework:** Spring Boot 3.3.0
- **Data Access:** Spring Data JPA, Hibernate ORM
- **Database:** PostgreSQL
- **Build Tool:** Maven

## Implementation Details
- Built the foundational server entry point (`MyUniversalServerApplication`) from scratch.
- Configured application properties for seamless database communication.
- Implemented core domain models and repository layers to handle server-side data operations.

## Expected result
The universal server successfully initializes, binds to port 8080, establishes a stable connection with PostgreSQL, and runs error-free with active request handling capabilities.
### Project Structure:

    JavaBasics_Task_538/
    ├─ src/main/java/
    │  │   │    └──────────────────────────────────────────── com/yurii/pavlenko/
    │  │   └── resources/images/                                        ├── app/
    │  │       │         ├── assistant.png                              │   └── MyAssistantApp.java
    │  │       │         └── MyAssistantDiagram.png                     ├── controller/ 
    │  │       └── simplelogger.properties                              │   ├─ tools/
    │  └─ test/                                                         │   │  ├─ calculator/
    │     └─ java/                                                      │   │  │  ├─ BackspaceProcessor.java
    │        └─ com/                                                    │   │  │  ├─ CalculatorController.java
    │           └─ yurii/                                               │   │  │  ├─ ExecutionProcessor.java
    │              └─ pavlenko/                                         │   │  │  ├─ InputProcessor.java
    │                 ├─ controller/                                    │   │  │  ├─ MemoryProcessor.java
    │                 │  ├─ tools/                                      │   │  │  ├─ OperatorProcessor.java
    │                 │  │  ├─ calculator/                              │   │  │  ├─ ResultFormatter.java
    │                 │  │  │  ├─ BackspaceProcessorTest.java           │   │  │  └─ UnaryOperatorProcessor.java
    │                 │  │  │  ├─ CalculatorControllerTest.java         │   │  ├─ currency/
    │                 │  │  │  ├─ ExecutionProcessorTest.java           │   │  │  └─ CurrencyController.java
    │                 │  │  │  ├─ InputProcessorTest.java               │   │  └─ weather/
    │                 │  │  │  ├─ MemoryProcessorTest.java              │   │     └─ WeatherController.java
    │                 │  │  │  ├─ OperatorProcessorTest.java            │   └── TaskController.java
    │                 │  │  │  ├─ ResultFormatterTest.java              ├── model/   
    │                 │  │  │  └─ UnaryOperatorProcessorTest.java       │   ├─ tools/     
    │                 │  │  ├─ currency/                                │   │  ├─ calculator/
    │                 │  │  │  └─ CurrencyControllerTest.java           │   │  │  └─ CalculatorModel.java
    │                 │  │  └─ weather/                                 │   │  ├─ currency/
    │                 │  │     └─ WeatherControllerTest.java            │   │  │  └─ CurrencyModelDTO.java
    │                 │  └── TaskControllerTest.java                    │   │  └─ weather/
    │                 ├─ repository/                                    │   │     └─ WeatherModelDTO.java
    │                 │  └─ impl/                                       │   └── Task.java
    │                 │     └─ JsonTaskRepositoryImplTest.java          ├─ repository/
    │                 ├─ service/impl/                                  │  ├─ impl/ 
    │                 │  │       └─ TaskServiceImplTest.java            │  │  ├─ DatabaseTaskRepositoryImpl.java
    │                 │  └─ tools/                                      │  │  ├─ InMemoryTaskRepositoryImpl.java
    │                 │      ├─ calculator/                             │  │  └─ JsonTaskRepositoryImpl.java
    │                 │      │  ├─ CalculatorMemoryTest.java            │  └─ TaskRepository.java
    │                 │      │  ├─ CalculatorServiceImplTest.java       ├─ service/
    │                 │      │  ├─ ExpressionParserTest.java            │  ├─ impl/ 
    │                 │      │  └─ MathOperationEvaluatorTest.java      │  │  └─ TaskServiceImpl.java
    │                 │      ├─ currency/                               │  ├─ tools/
    │                 │      │  └─ CurrencyServiceImplTest.java         │  │  ├─ calculator/
    │                 │      └─ weather/                                │  │  │  ├─ impl/
    │                 │         └─ WeatherServiceImplTest.java          │  │  │  │  ├─ CalculatorMemory.java
    │                 ├── ui/actions/                                   │  │  │  │  ├─ CalculatorServiceImpl.java
    │                 │   │  ├─ filtration/                             │  │  │  │  ├─ ExpressionParser.java
    │                 │   │  │  └─ TaskFilterServiceTest.java           │  │  │  │  └─ MathOperationEvaluator.java
    │                 │   │  └─ sorting/                                │  │  │  └─ CalculatorService.java
    │                 │   │     └─ TaskComparatorFactoryTest.java       │  │  ├─ currency/
    │                 │   └─ panels/tools/                              │  │  │  ├─ impl/ 
    │                 │             └─ WeatherPanelTest.java            │  │  │  │  └─ CurrencyServiceImpl.java
    │                 └── utils/                                        │  │  │  └─ CurrencyService.java
    │                     ├─ CityTranslitUtilTest.java                  │  │  └─ weather/
    │                     ├─ DateFormatterUtilTest.java                 │  │     ├─ impl/
    │                     ├─ MoonPhaseCalculatorTest.java               │  │     │  └─ WeatherServiceImpl.java
    │                     ├─ WeatherCodeMapperTest.java                 │  │     └─ WeatherService.java
    │                     ├─ WeatherIconPainterTest.java                │  └─ TaskService.java
    │                     └─ WindConverterTest.java                     ├── ui/
    │                                                                   │   ├─ actions/
    │                                                                   │   │  ├─ filtration/
    │                                                                   │   │  │  └─ TaskFilterService.java
    │                                                                   │   │  ├─ pressingbuttons/
    │                                                                   │   │  │  ├─ AddTaskAction.java
    │                                                                   │   │  │  ├─ ClearAllTasksAction.java
    │                                                                   │   │  │  ├─ DeleteCompletedTasksAction.java
    │                                                                   │   │  │  ├─ DeleteTaskAction.java
    │                                                                   │   │  │  └─ EditTaskAction.java
    │                                                                   │   │  └─ sorting/
    │                                                                   │   │     └─ TaskComparatorFactory.java
    │                                                                   │   ├─ components/
    │                                                                   │   │  └─ TaskFooterPanel.java
    │                                                                   │   ├─ dialogs/
    │                                                                   │   │  ├─ DialogHelperDelete.java
    │                                                                   │   │  └─ TaskDialog.java
    │                                                                   │   ├─ frames/
    │                                                                   │   │  └─ TaskFrame.java
    │                                                                   │   ├─ listeners/
    │                                                                   │   │  ├─ TaskEventListener.java
    │                                                                   │   │  └─ TaskMouseHandler.java
    │                                                                   │   ├─ panels/
    │                                                                   │   │  ├─ tools/
    │                                                                   │   │  │  ├─ CalculatorDisplay.java
    │                                                                   │   │  │  ├─ CalculatorPanel.java
    │                                                                   │   │  │  ├─ CurrencyConverterPanel.java
    │                                                                   │   │  │  └─ WeatherPanel.java
    │                                                                   │   │  ├─ MainTabbedPanel.java
    │                                                                   │   │  ├─ TaskPanel.java
    │                                                                   │   │  └─ ToolsPanel.java
    │                                                                   │   └─ renderers/
    │                                                                   │      ├─ SortComboBoxRenderer.java
    │                                                                   │      └─ TaskCellRenderer.java
    │                                                                   └── utils/
    │                                                                       ├─ CalculatorHotkeyConfigurator.java
    │                                                                       ├─ CityTranslitUtil.java
    │                                                                       ├─ ConfigureUtil.java
    │                                                                       ├─ CurrencyApiConfig.java
    │                                                                       ├─ DateFormatterUtil.java
    │                                                                       ├─ FilterStatus.java
    │                                                                       ├─ MoonPhaseCalculator.java
    │                                                                       ├─ SortOrderOption.java
    │                                                                       ├─ WeatherApiConfig.java
    │                                                                       ├─ WeatherCodeMapper.java
    │                                                                       ├─ WeatherIconPainter.java
    │                                                                       └─ WindConverter.java
    ├── logger.txt
    ├── tasks.json
    ├── pom.xml
    ├── LICENSE
    ├── TASK.md
    ├── THEORY.md
    └── README.md

## 💻 Code Example

```java
package com.yurii.pavlenko.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.yurii.pavlenko.assistant.tasks.repositories")
@EntityScan(basePackages = "com.yurii.pavlenko.assistant.tasks.models.entity")
public class MyUniversalServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyUniversalServerApplication.class, args);
    }
}
```

## ⚖️ License
This project is licensed under the **MIT License**.

Copyright (c) 2026 Yurii Pavlenko

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files...

License: [MIT](LICENSE)
