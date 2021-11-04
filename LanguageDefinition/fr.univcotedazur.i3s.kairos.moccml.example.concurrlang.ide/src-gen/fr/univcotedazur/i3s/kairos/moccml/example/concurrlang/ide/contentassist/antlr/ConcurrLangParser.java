/*
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.ide.contentassist.antlr.internal.InternalConcurrLangParser;
import fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.services.ConcurrLangGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ConcurrLangParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ConcurrLangGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ConcurrLangGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStatementsAccess().getAlternatives_0(), "rule__Statements__Alternatives_0");
			builder.put(grammarAccess.getStatementsAccess().getGroup(), "rule__Statements__Group__0");
			builder.put(grammarAccess.getJoinAccess().getGroup(), "rule__Join__Group__0");
			builder.put(grammarAccess.getJoinAccess().getGroup_0(), "rule__Join__Group_0__0");
			builder.put(grammarAccess.getForkAccess().getGroup(), "rule__Fork__Group__0");
			builder.put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
			builder.put(grammarAccess.getModelAccess().getStatementsAssignment(), "rule__Model__StatementsAssignment");
			builder.put(grammarAccess.getJoinAccess().getNameAssignment_0_0(), "rule__Join__NameAssignment_0_0");
			builder.put(grammarAccess.getJoinAccess().getForkAssignment_3(), "rule__Join__ForkAssignment_3");
			builder.put(grammarAccess.getForkAccess().getNameAssignment_1(), "rule__Fork__NameAssignment_1");
			builder.put(grammarAccess.getForkAccess().getForkedBlocksAssignment_3(), "rule__Fork__ForkedBlocksAssignment_3");
			builder.put(grammarAccess.getBlockAccess().getStatementsAssignment_3(), "rule__Block__StatementsAssignment_3");
			builder.put(grammarAccess.getActionAccess().getNameAssignment(), "rule__Action__NameAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ConcurrLangGrammarAccess grammarAccess;

	@Override
	protected InternalConcurrLangParser createParser() {
		InternalConcurrLangParser result = new InternalConcurrLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ConcurrLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ConcurrLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
