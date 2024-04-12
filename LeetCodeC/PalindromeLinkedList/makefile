CC=gcc
CFLAGS=-Wall -Wextra -pedantic -Wshadow -Wformat=2 -Wconversion -fsanitize=address -fsanitize=undefined -fno-omit-frame-pointer

# Object files
OBJS=solution.o tests.o

# Executable name
EXEC=solution

all: $(EXEC)

$(EXEC): $(OBJS)
	$(CC) $(CFLAGS) -o $(EXEC) $(OBJS)

solution.o: solution.c
	$(CC) $(CFLAGS) -c solution.c

tests.o: tests.c
	$(CC) $(CFLAGS) -c tests.c

clean:
	rm -f $(OBJS) $(EXEC)
