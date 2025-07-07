import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class RelogioDigital {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask tarefa = new TimerTask() {
            public void run() {
                LocalTime horaAtual = LocalTime.now();
                System.out.printf("Hora atual: %02d:%02d:%02d%n", 
                    horaAtual.getHour(), horaAtual.getMinute(), horaAtual.getSecond());
            }
        };

        timer.scheduleAtFixedRate(tarefa, 0, 1000);
    }
}
