Executing tasks: [:app:assembleDebug] in project C:\Users\Eduardo\Documents\Android\Recetario

Starting Gradle Daemon...
Gradle Daemon started in 3 s 133 ms
> Task :app:preBuild UP-TO-DATE
> Task :app:preDebugBuild UP-TO-DATE
> Task :app:compileDebugAidl NO-SOURCE
> Task :app:compileDebugRenderscript NO-SOURCE
> Task :app:dataBindingMergeDependencyArtifactsDebug UP-TO-DATE
> Task :app:dataBindingMergeGenClassesDebug UP-TO-DATE
> Task :app:generateDebugResValues UP-TO-DATE
> Task :app:generateDebugResources UP-TO-DATE
> Task :app:mergeDebugResources UP-TO-DATE
> Task :app:dataBindingGenBaseClassesDebug UP-TO-DATE
> Task :app:dataBindingTriggerDebug UP-TO-DATE
> Task :app:generateDebugBuildConfig UP-TO-DATE
> Task :app:checkDebugAarMetadata UP-TO-DATE
> Task :app:createDebugCompatibleScreenManifests UP-TO-DATE
> Task :app:extractDeepLinksDebug UP-TO-DATE
> Task :app:processDebugMainManifest UP-TO-DATE
> Task :app:processDebugManifest UP-TO-DATE
> Task :app:processDebugManifestForPackage UP-TO-DATE
> Task :app:processDebugResources UP-TO-DATE
> Task :app:kaptGenerateStubsDebugKotlin
> Task :app:javaPreCompileDebug UP-TO-DATE
> Task :app:mergeDebugNativeDebugMetadata NO-SOURCE
> Task :app:mergeDebugShaders UP-TO-DATE
> Task :app:compileDebugShaders NO-SOURCE
> Task :app:generateDebugAssets UP-TO-DATE
> Task :app:mergeDebugAssets UP-TO-DATE
> Task :app:compressDebugAssets UP-TO-DATE
> Task :app:processDebugJavaRes NO-SOURCE
> Task :app:checkDebugDuplicateClasses UP-TO-DATE
> Task :app:desugarDebugFileDependencies UP-TO-DATE
> Task :app:mergeExtDexDebug UP-TO-DATE
> Task :app:mergeLibDexDebug UP-TO-DATE
> Task :app:mergeDebugJniLibFolders UP-TO-DATE
> Task :app:mergeDebugNativeLibs NO-SOURCE
> Task :app:stripDebugDebugSymbols NO-SOURCE
> Task :app:validateSigningDebug UP-TO-DATE
> Task :app:writeDebugAppMetadata UP-TO-DATE
> Task :app:writeDebugSigningConfigVersions UP-TO-DATE

> Task :app:kaptDebugKotlin
C:\Users\Eduardo\Documents\Android\Recetario\app\build\tmp\kapt3\stubs\debug\com\sysmart\recetario\datos\EventoDao.java:52: error: Not sure how to handle query method's return type (java.lang.Object). DELETE query methods must either return void or int (the number of deleted rows).
    public abstract java.lang.Object deleteEvento(@org.jetbrains.annotations.NotNull()
                                     ^
C:\Users\Eduardo\Documents\Android\Recetario\app\build\tmp\kapt3\stubs\debug\com\sysmart\recetario\datos\EventoDao.java:53: error: Query method parameters should either be a type that can be converted into a database column or a List / Array that contains such type. You can consider adding a Type Adapter for this.
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
                                                              ^
C:\Users\Eduardo\Documents\Android\Recetario\app\build\tmp\kapt3\stubs\debug\com\sysmart\recetario\datos\EventoDao.java:52: error: Unused parameter: continuation
    public abstract java.lang.Object deleteEvento(@org.jetbrains.annotations.NotNull()
                                     ^
C:\Users\Eduardo\Documents\Android\Recetario\app\build\tmp\kapt3\stubs\debug\com\sysmart\recetario\datos\EventoDao.java:35: error: Not sure how to handle delete method's return type. Currently the supported return types are void, int or Int.
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
                                     ^
C:\Users\Eduardo\Documents\Android\Recetario\app\build\tmp\kapt3\stubs\debug\com\sysmart\recetario\datos\EventoDao.java:37: error: Type of the parameter must be a class annotated with @Entity or a collection/array of it.
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
                                                        ^
C:\Users\Eduardo\Documents\Android\Recetario\app\build\tmp\kapt3\stubs\debug\com\sysmart\recetario\datos\EventoDao.java:43: error: Type of the parameter must be a class annotated with @Entity or a collection/array of it.
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
                                                        ^
C:\Users\Eduardo\Documents\Android\Recetario\app\build\tmp\kapt3\stubs\debug\com\sysmart\recetario\datos\EventoDao.java:41: error: Not sure how to handle update method's return type. Currently the supported return types are void, int or Int.
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
                                     ^
C:\Users\Eduardo\Documents\Android\Recetario\app\build\tmp\kapt3\stubs\debug\com\sysmart\recetario\datos\EventoDao.java:47: error: Method annotated with @Transaction must not return deferred/async return type androidx.lifecycle.LiveData. Since transactions are thread confined and Room cannot guarantee that all queries in the method implementation are performed on the same thread, only synchronous @Transaction implemented methods are allowed. If a transaction is started and a change of thread is done and waited upon then a database deadlock can occur if the additional thread attempts to perform a query. This restrictions prevents such situation from occurring.
    public abstract java.lang.Object initEvento(@org.jetbrains.annotations.NotNull()
                                     ^

> Task :app:kaptDebugKotlin FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':app:kaptDebugKotlin'.
> A failure occurred while executing org.jetbrains.kotlin.gradle.internal.KaptWithoutKotlincTask$KaptExecutionWorkAction
   > java.lang.reflect.InvocationTargetException (no error message)

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 46s
28 actionable tasks: 2 executed, 26 up-to-date
