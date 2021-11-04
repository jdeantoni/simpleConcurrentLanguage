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
	 	inv forkCausalities1:
	 		let firstBlockExec : Event = Expression Inf(self.forkedBlocks.statements.execute) in
	 		Relation Precedes(self.execute, firstBlockExec)
	 
	 context Join
	 	inv joinCausalities1:
	 	let lastBlockExec : Event = Expression Sup(self.fork.forkedBlocks.statements.execute) in
	 		Relation Precedes(lastBlockExec, self.execute)
	 		
	 	inv executesWhenForksFinishes:
	 		Relation Coincides(self.fork.finish, self.execute)
	 
	 context _Block
	 	inv sequentialOrder:
	 		Relation Precedes(self.statements.execute)  
 endpackage