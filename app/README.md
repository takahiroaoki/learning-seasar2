## The unit of program
Each leaves of the following directry tree have Main.java.
This is the unit of execution.

/app/src/main/java/org/seasar/example/
- s2container/
  - annotation/
  - aop/
  - helloworld/
  - ognl/
  


## Before execution
Before execute the program, execute the following command on terminal.
```
$ cp -pr /app/src/main/resources/* /app/target
```

## Specific configuration
### /s2container/aop
When executing the Main.java, execute it with the following option.
```
--add-opens java.base/java.lang=ALL-UNNAMED
```
Without the option above, java.lang.reflect.InaccessibleObjectException would occur.