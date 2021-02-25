# Directories
export ROOTDIR=$(CURDIR)
export SRCDIR=$(ROOTDIR)/src
export BINDIR=$(ROOTDIR)/bin
export LIBDIR=$(ROOTDIR)/lib
export BUILDDIR=$(ROOTDIR)/build
export EXAMPLESDIR=$(ROOTDIR)/examples
export ANTLRFILES=$(SRCDIR)/main/antlr

# ANTLR
export ANTLR = $(LIBDIR)/antlr-4.9.1-complete.jar

# Compiler and Compilation Flags
export JC = javac
export JCFLAGS = -g -d $(BINDIR) -classpath $(CLASSPATH) -Werror

# Execution Flags
export JAVA = java
export JFLAGS = -classpath $(CLASSPATH)

# Class Path
# Adicione qualquer classpath externo que você precise
USERCLASSPATH=.

# Criando classpath dinâmico
TMPCLASSPATH=$(USERCLASSPATH):$(realpath $(BASE)$(BINDIR))
ifneq (,$(wildcard $(lib)/*))
    CLASSPATH=$(TMPCLASSPATH):$(subst $(space),:,$(foreach jar,$(wildcard $(LIBDIR)/*.jar),$(realpath $(jar))))
endif

# Parameters
export GRAMMAR ?= lcc
export ARGS ?=

GRAMMARTMP = $(EXAMPLESDIR)/$(GRAMMAR)/$(GRAMMAR).g4

# Rules
default: all

run: $(BINDIR)/main/java/Main.class
	cd $(BINDIR)
	java $(JFLAGS) main.java.Main $(ARGS)

all: clean make-dirs
ifneq ("$(wildcard $(GRAMMARTMP))","")
	cp $(GRAMMARTMP) $(ANTLRFILES)/MyGrammar.g4
	$(MAKE) -C src all
else
	echo Invalid Grammar Name!
endif

make-dirs:
	@mkdir -p $(BINDIR)

clean:
	$(MAKE) -C src clean
	$(RM) -rf $(BINDIR)
