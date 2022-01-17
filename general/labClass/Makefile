JR := java
JC := javac
JA := jar

TARGET := Main
SOURCE_PATH := ./src
CLASS_PATH := ./out

$(CLASS_PATH)/$(TARGET).class:	./$(SOURCE_PATH)/$(TARGET).java
	$(JC) -sourcepath $(SOURCE_PATH) -d $(CLASS_PATH) $<

run:
	$(JR) -cp $(CLASS_PATH) $(TARGET)

clean:
	rm -rf $(CLASS_PATH)
	rm -rf *.jar

.PHONY: clean run