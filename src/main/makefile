# Build All
all: antlr-all java-all

# Cleans all
clean: antlr-clean

# Specific Rules
antlr-all:
	$(MAKE) -C antlr build-antlr && $(MAKE) -C antlr compile-antlr

java-all:
	$(MAKE) -C java all

antlr-clean:
	$(MAKE) -C antlr clean
