# Jasypt 

This project uses jasypt instead of environment variables on local environment.

- `JASYPT_KEY` must not be shared.
  - This project is just a public example. So the env files are made public.
    But your project must not disclose the env files for your backend system.
- Jasypt is not stronger security method than the environment variables.
  - So I suggest it only for the local or some test(dev) environments.
  - And some important contents should be still provided with environment variables.

# Run

## Preparation

Append `local` to the active profiles. Append this to VM options:

```shell
-Dspring.profiles.active=local
```

Example when running with jar:

```shell
java -Dspring.profiles.active=local -jar Example.jar
```

If you use intellij ultimate,
you can easily input the active profiles at `Run/Debug Configuration`.
Then just input `local` to "Active Profiles".
