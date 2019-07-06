package com.app.runner;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
@Component
public class ConsoleRunner implements CommandLineRunner {
private static Logger log=LogManager.getLogger(ConsoleRunner.class);
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		StopWatch s=new StopWatch("my service test");
try {
	
	s.start("Block started");
	log.info("ConsoleRunner Started");
	int a=10,b=20,c=0;
	log.info("Data init: Done");
	if(a>0&&b>0) {
		c=a+b;
		log.info("if block executed");
	}
	log.debug("final result is :"+c);
	if(c<0) {
		throw new RuntimeException("Hello Sample");
	}
	s.stop();
}catch(Exception e){
	log.error("problem found:"+e);
}
s.start("Block#1 started");
for(int i=0;i<=999999;i++) {
	double d=Math.random();
	d=Math.sin(d);
	d=Math.abs(d);
}
s.stop();
s.start("Block#2 started");
for(int i=0;i<=999999;i++) {
	double d=Math.random();
	d=Math.sin(d);
	d=Math.abs(d);
}
s.stop();
long ms=s.getTotalTimeMillis();
double sec=s.getTotalTimeSeconds();
log.info("block end"+ms);
log.info(s.prettyPrint());
	}
	
	//stop server
//System.exit(0);
}
