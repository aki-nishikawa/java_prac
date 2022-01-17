
run:
	hadoop jar /opt/hadoop/share/hadoop/tools/lib/hadoop-streaming-3.3.1.jar \
		-input ../input.txt \
		-output output \
		-mapper mapper.py \
		-reducer reducer.py 

.PHONY: run
