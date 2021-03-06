/*
 * generated by Xtext 2.25.0
 */
package fr.n7.parser.antlr;

import com.google.inject.Inject;
import fr.n7.parser.antlr.internal.InternalENIGMAParser;
import fr.n7.services.ENIGMAGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ENIGMAParser extends AbstractAntlrParser {

	@Inject
	private ENIGMAGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalENIGMAParser createParser(XtextTokenStream stream) {
		return new InternalENIGMAParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Jeu";
	}

	public ENIGMAGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ENIGMAGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
