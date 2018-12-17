package helo.helo;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HeloJob implements Job {

    private static Logger LOG = LoggerFactory.getLogger(HeloJob.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("HeloJob, It's " + time.toString() + "!");
    }
}
