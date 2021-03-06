/*
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import com.google.inject.Inject;

import fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.concurrLang.Action;
import fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.concurrLang.Block;
import fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.concurrLang.Fork;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
public class ConcurrLangLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public ConcurrLangLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	
	String text(Block ele) {
			return "block #"+((Fork)ele.eContainer()).getForkedBlocks().indexOf(ele);
	}
//	String text(Join ele) {
//		return "Join "+ele.getFork().getName();
//	}
	
	String text(Action ele) {
		return "Action "+ele.getName();
	}
	
	String text(Fork ele) {
		return "Fork "+ele.getName();
	}

}
