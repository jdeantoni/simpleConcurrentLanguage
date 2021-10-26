package fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.concurrLang.Statements

/**
 * Sample aspect that gives java.io.File the ability to store Text content and save it to disk
 */
@Aspect(className=Statements)
class StatementAspect {

	def void run(){
		println("run "+_self.name)
	}

}