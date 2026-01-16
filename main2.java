//pr1.1
//Explain the difference between JVM, JRE, and JDK with examples. Also, list 
//two popular Java IDEs. 

// 1. JVM (Java Virtual Machine)
// Definition: JVM is an abstract machine that runs Java bytecode. It is responsible for converting compiled Java code (.class files) into machine-specific instructions.
// Function: Executes Java programs line-by-line.
// Platform Dependent: The JVM is platform-specific, i.e., different for Windows, Mac, Linux.

// Example:
// When you run java HelloWorld, the JVM loads the HelloWorld.class file and runs it.


// 2. JRE (Java Runtime Environment)
// Definition: JRE provides the environment to run Java applications. It includes the JVM + core Java libraries + supporting files.
// Function: Only runs Java programs (does not compile them).

// Contains:
// JVM
// Java class libraries
// Other supporting files

// Example:
// If you download Java to just run apps (like a Java game), you need the JRE.


// 3. JDK (Java Development Kit)
// Definition: JDK is a full software development kit used to develop Java applications.
// Function: It includes everything in JRE plus development tools like compiler (javac), debugger, etc.

// Contains:
// JRE (which contains JVM)
// Java compiler (javac)
// Debuggers, documentation tools, etc.

// Example:
// If you are writing and compiling Java code, like javac HelloWorld.java, you need the JDK.


// * Two Popular Java IDEs:
// 1.Eclipse
// Open-source
// Suitable for Java EE, Spring, and large projects

// 2.IntelliJ IDEA
// Smart code completion and refactoring
// Preferred for professional Java development