# Kotlin Koans

Fork de [Kotlin/kotlin-koans-edu](https://github.com/Kotlin/kotlin-koans-edu), el contenido de los koans de
[play.kotlinlang.org](https://play.kotlinlang.org/koans/overview), para resolverlos en local con sus tests.

## Cómo usarlo

`master` tiene los ejercicios sin resolver, igual que en el sitio. Cada uno trabaja en su propia rama:

```zsh
git switch -c <tu-nombre> master
```

Cada tarea es una carpeta `<Sección>/<Tarea>/` con el enunciado en `task.md`, el código a completar en
`src/Task.kt` y los tests en `test/`, que en el sitio no se ven. Se necesita Java 17 o superior:

```zsh
./gradlew :Collections-Introduction:test   # una tarea: <Sección>-<Tarea>, con _ en vez de espacios
./gradlew test --continue                  # todas
```

Mientras una tarea no esté resuelta, sus tests fallan, y en algunas ni siquiera compilan.

## Diferencias con el original

- El build corre con Gradle 9 y Kotlin 2.2 sobre Java 17; el original usa Gradle 6, que no arranca con Java 17.
- El original trae las soluciones en `src/` y el curso las oculta con los placeholders de `task-info.yaml`.
  En `master` ya están reemplazadas por esos placeholders, así que los offsets de `task-info.yaml` ya no
  calzan: este repo no sirve para editar el curso con EduTools.

Para traer cambios del original, usa "Sync fork" en GitHub. Si tocan una tarea, vuelve a aplicar su placeholder a mano.

---

[![official JetBrains project](https://jb.gg/badges/official-plastic.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)

# kotlin-koans-edu

Kotlin Koans are a series of exercises to get you familiar with the Kotlin Syntax.
Each exercise is created as a failing unit test, and your job is to make it pass.
You can work with Kotlin Koans in one of the following ways:

* You can play with Koans online: https://play.kotlinlang.org/koans/overview.
* You can solve the tasks right inside IntelliJ IDEA or Android Studio by
[installing the EduTools plugin](https://www.jetbrains.com/help/education/install-edutools-plugin.html?section=IntelliJ%20IDEA)
and [choosing Kotlin Koans course](https://www.jetbrains.com/help/education/learner-start-guide.html?section=Kotlin%20Koans).

You don't need this project if you want to solve the tasks. Install the educational plugin or do it online.
This project contains the task content, so please submit a new pull request if you want to contribute any changes
to the existing or new tasks.
