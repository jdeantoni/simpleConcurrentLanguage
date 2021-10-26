import 'http://www.univcotedazur.fr/i3s/kairos/moccml/example/concurrlang/ConcurrLang'

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"

package concurrLang

	 context Statements
	 	def: execute : Event = self
	 	
	 context Fork
	 	def : finish : Event = self
	 context Model
		inv sequentialOrder:
			Relation Precedes(self.statements.execute)
		inv singleExec:
			let firstStatementUniqueExecution : Event = Expression OneTickAndNoMore(self.statements->first().execute) in
			Relation Coincides(self.statements->first().execute, firstStatementUniqueExecution)
			
	 context Fork
	 	inv forCausalities1:
	 		Relation Precedes(self.execute, self.parent.statements->first().execute)
	 	inv forCausalities2:
	 		Relation Precedes(self.execute, self.child.statements->first().execute)
	 
	 context Join
	 	inv joinCausalities1:
	 		Relation Precedes(self.fork.parent.statements->last().execute, self.execute)
	 		
	 	inv joinCausalities2:
	 		Relation Precedes(self.fork.child.statements->last().execute, self.execute)
	 		
	 	inv executesWhenForksFinishes:
	 		Relation Coincides(self.fork.finish, self.execute)
	 context _Block
	 	inv sequentialOrder:
	 		Relation Precedes(self.statements.execute)  
 endpackage