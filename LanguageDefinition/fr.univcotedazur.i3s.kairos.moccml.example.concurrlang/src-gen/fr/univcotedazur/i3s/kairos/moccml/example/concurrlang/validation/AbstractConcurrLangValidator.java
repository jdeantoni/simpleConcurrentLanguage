/*
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractConcurrLangValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.concurrLang.ConcurrLangPackage.eINSTANCE);
		return result;
	}
}
