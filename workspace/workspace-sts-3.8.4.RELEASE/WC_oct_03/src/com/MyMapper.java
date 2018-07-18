package com;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMapper extends Mapper<LongWritable , Text,Text,IntWritable> {

	Text text=new Text();
	IntWritable intWritable=new IntWritable(1);
	
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		
		String line=value.toString();
		StringTokenizer token=new StringTokenizer(line);
		while (token.hasMoreElements()) 
		{
			String name=(String) token.nextElement();
			text.set(name);
			context.write(text,intWritable);
		}
	}
}
