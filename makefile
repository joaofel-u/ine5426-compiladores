# Directories
export ROOTDIR=$(CURDIR)
export BINDIR=$(ROOTDIR)/bin
export LIBDIR=$(ROOTDIR)/lib
export BUILDDIR=$(ROOTDIR)/build

# Class Path
# Adicione qualquer classpath externo que você precise
USERCLASSPATH=.

# Criando classpath dinâmico
TMPCLASSPATH=$(USERCLASSPATH):$(realpath $(BASE)$(BINDIR))
ifneq (,$(wildcard $(lib)/*))
    CLASSPATH=$(TMPCLASSPATH):$(subst $(space),:,$(foreach jar,$(wildcard $(LIBDIR)/*.jar),$(realpath $(jar))))
endif

# Compiler and Compilation Flags
export JC = javac
export JCFLAGS = -g -d $(BINDIR) -classpath $(CLASSPATH)

# Execution Flags
export JFLAGS = -classpath $(CLASSPATH)

# Rules
default: all

run: $(BINDIR)/main/java/Main.class
	cd $(BINDIR)
	java $(JFLAGS) main.java.Main

all: clean make-dirs
	$(MAKE) -C src all

make-dirs:
	@mkdir -p $(BINDIR)

clean:
	$(RM) -rf $(BINDIR)
