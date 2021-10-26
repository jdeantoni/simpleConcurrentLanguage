# the "Simple" Concurrent Language
a very simple concurrent language to illustrate GEMOC model of concurrency

Let us consider the "Simple" language composed by *Statement*s where a statement can be an *Action*, a *Fork* with its parent and child *Block* of statements that can be executed concurrently, or a *Join*. The Figure below provides a program written in the Simple language together with its abstract syntax tree. 

<center>
<img src="https://user-images.githubusercontent.com/6162718/138898684-dea66ba0-b830-4934-b0e3-3b38526a4ff0.png" alt="a Simple program" width="300"/>
</center>


In this example, a computer scientist intuitively figures out that the *B;C* sequence is not ordered with the *D;E* one. The role of the concurrency model is to symbolically capture the different interleaving that can possibly appear in a program. To illustrate, the Figure below represents in extension the possible interleaving between all actions of the illustrative program presented above.
  
<img src="https://user-images.githubusercontent.com/6162718/138898862-b8cf355f-256a-41c5-a39b-34a2284b2bdb.png" alt="possible interleavings in the Simple program" width="200"/> 


On the left of the Figure, we can see that any execution starts with action *A*. It means that there is a single *atomic step* in the first *parallel step* of the execution. Then the execution continue with another parallel step composed of a single atomic step: *Fork*. At this point, three different steps are possible in an execution trace. One parallel step where only *B* appears, one where only *D* appears and one parallel step composed of two atomic steps *B* et *D* executed in parallel. If, for instance, the parallel step with only *B* is taken, then three new parallel steps are possible: *C*, *C* and *D* in parallel or *D* alone. The *diamond* actually represents all the acceptable interleaving between the execution of the *B;C* sequence and the *D;E* sequence considering the actions as atomic. It could of course be possible to characterize actions that actually take time and consequently the interleaving between the start / finish of each action would be captured in the concurrency model.

# Repo Organization

 In the videos folder one can find [a simulation of the simple program shown above in the gemoc omniscient debugger](videos/simulationExplorationDifferentInterleaving.mkv) where it is possible to choose a specific interleaving and to go back in time to explore another interleaving captured by the concurrency model. In another video it is shown [how to obtain the state space corresponding to the second picture in this readme](videos/exhaustiveSimulation.mkv) (note that the second picture is a graphical representation of the generated dot file provided by the [Graphia](https://graphia.app/) tool) 


 In the *LanguageDefinition* folder, you can find the different infredient that constitute the language according to the [GEMOC approach](https://hal.inria.fr/hal-00850770v2). Most of the artifacts are generated code and only few lines of code where written to develop this language.
 
 In the *examples* folder, you can find examples :)
