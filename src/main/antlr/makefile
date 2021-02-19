# Builds Everything
build-antlr: build-lexer

compile-antlr: compile-lexer

# Cleans everything
clean:
	$(RM) ./*.interp ./*.tokens ./*.java ./*.g4

build-lexer:
	$(JAVA) $(JFLAGS) -jar $(ANTLR) $(ANTLRFILES)/$(GRAMMAR).g4

compile-lexer:
	$(JC) $(JCFLAGS) $(CURDIR)/$(wildcard *.java)
