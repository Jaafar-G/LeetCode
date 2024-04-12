# Define the compiler
CC=gcc

# Define compile-time flags for robust warnings and sanitizers for debugging
CFLAGS=-Wall -Wextra -pedantic -Wshadow -Wformat=2 -Wconversion -fsanitize=address -fsanitize=undefined -fno-omit-frame-pointer

# Define the target executable
TARGET=solution

# Define object files
OBJS=solution.o tests.o

# The first rule is the default when "make" is run without arguments
$(TARGET): $(OBJS)
	$(CC) $(CFLAGS) -o $(TARGET) $(OBJS)

# Rule for object files, the -c flag tells the compiler to generate object code
solution.o: solution.c solution.h
	$(CC) $(CFLAGS) -c solution.c

tests.o: tests.c solution.h
	$(CC) $(CFLAGS) -c tests.c

# Define a clean rule to remove object files and the executable
clean:
	rm -f $(OBJS) $(TARGET)

# Define a rule for running the program (for convenience)
run: $(TARGET)
	./$(TARGET)

