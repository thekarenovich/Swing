import java.util.Timer;
import java.util.TimerTask;

public class Task {
    public void startTask(){
        newFrame nf = new newFrame();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                nf.createNewFrame();
            }
        };
        long delay = 1000l;
        long min = delay * 60;
        long outTime = min * 25;
        timer.schedule(task, outTime);
    }
}
