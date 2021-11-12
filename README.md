Maven Java application
----------------------

This project demonstrates the usage of Bazel to retrieve dependencies from Maven
repositories.

To build this example, you will need to [install
Bazel](http://bazel.io/docs/install.html).

Read [Bazel Overview](https://docs.bazel.build/versions/4.2.1/bazel-overview.html), 
[Starlark language](https://docs.bazel.build/versions/4.2.1/skylark/language.html),
[Tutorial for Java]() first.

The Java application makes use of a library in
[Guava](https://github.com/google/guava), which is downloaded from a remote
repository using Maven.

This application demonstrates the usage of
[`rules_jvm_external`](https://github.com/bazelbuild/rules_jvm_external/) to
configure dependencies. The dependencies are configured in the `WORKSPACE` file.

Build the application by running:

```
$ bazel build :java-maven

$ ./bazel-bin/java-maven

# (print main class output...)

```

Test the application by running:

```
$ bazel test :tests
```

Idea Maven dependency auto inject with bazel

```
1. install Bazel plugin

2. File > Import Bazel Project -> next to finish

3. `.ijwb` file generated and bazel icon will occur in idea tool bar

4. add `.ijwb` to .gitignore, it cannot replaced when import

```