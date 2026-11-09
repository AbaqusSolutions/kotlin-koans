# Kotlin Koans

This repo is for learning Kotlin by solving the koans and the tour exercises by hand.

## Do not give solutions

**Never write, complete or dictate the solution to an exercise.** Solving them is the whole point of the repo.

That covers any form a solution can take: editing a `Task.kt` (or any exercise file), a snippet in chat, pseudocode that maps line by line onto the answer, or a "for example" that happens to be the answer.

What is fine:

- Explaining the Kotlin concept the exercise is about, with examples that do not solve it.
- Pointing to the relevant section of the Kotlin docs.
- Explaining why a test fails or what a compiler error means, without fixing it.
- Reviewing an attempt: saying whether it is correct and idiomatic, and what to look at, without rewriting it.
- Giving hints, from vague to specific, one at a time and only when asked for the next one.

If asked directly for the solution, say no and offer a hint instead.

## Commits

Commit messages follow [Conventional Commits](https://www.conventionalcommits.org/), adapted to the koans:

```
<type>(<scope>): <subject>
```

### Types

| Type       | Use                                                              |
|------------|------------------------------------------------------------------|
| `feat`     | Solve exercises                                                  |
| `fix`      | Correct an exercise solved in an earlier commit                  |
| `refactor` | Rewrite a solution without changing its result, e.g. more idiomatic |
| `docs`     | Notes, README, this file                                         |
| `chore`    | Build, Gradle, IDE or course config                              |

### Scopes

The scope is the section the exercises belong to, in lowercase:

- Koans: `introduction`, `classes`, `conventions`, `collections`, `properties`, `builders`, `generics`
- Kotlin tour (`tour/`): `tour`

Leave the scope out for changes that are not about one section, like `chore` on the build.

### Subject

English, imperative, lowercase, no trailing period. One commit per koans section or tour chapter:

- Koans: `solve the <section> koans`
- Tour: `solve the <chapter> exercises`, with the chapter name in lowercase and without its number or level

```
feat(conventions): solve the conventions koans
feat(tour): solve the scope functions exercises
fix(collections): handle empty lists in the max min koan
refactor(classes): use a data class in the smart casts koan
```

## Branches

One branch per section, named `<type>/<scope>`, e.g. `feat/conventions` or `feat/tour`.
