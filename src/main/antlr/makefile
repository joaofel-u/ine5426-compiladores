# Builds Everything
build-antlr: build-lexer

compile-antlr: compile-lexer

# Cleans everything
clean:
	$(RM) ./*.interp ./*.tokens ./*.java

build-lexer:
	$(JAVA) $(JFLAGS) -jar $(ANTLR) $(ANTLRFILES)/gramm.g4

compile-lexer:
	$(JC) $(JCFLAGS) $(CURDIR)/$(wildcard *.java)
