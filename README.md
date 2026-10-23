# Quiz 2: Test Driven Development with JUnit 5

It has two parts:

1. Calculator with sum, subtract, multiply, divide, and isEven.
2. DateChecker with a Month enum and a has31Days method.

## How I work

1. Write one small test and run it. It must fail (Red).
2. Write the smallest code that makes it pass (Green).
3. Clean up the code while the tests still pass (Refactor).
## Tools

1. Java and Maven
2. JUnit 5 (Jupiter)

## Run the tests
Open the Maven panel, open Lifecycle and double click test. If Maven is isntalled,
you can also run 'mvn test' in the project folder. All 27 tests pass.

## Reflection
I wrote the test first for every method. I ran it and saw it fail before
I wrote the code. Then i wrote just enough code to pass.

My first code for has31Days was just return true. The next test showed that wasn't
enough, so I wrote the real logic.

Some tests passed right away, like the 30 day months and the odd number tests. My code already returned false, so those steps had no Red.

The hardest part was the setup. I put my test file in the main folder by mistake, so JUnit was not found. I moved it to the test folder and it worked.