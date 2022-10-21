package homework.day6;

//- [ ] 1.4 имеется текстовый лог в виде (ниже общий вид, т.е. частный случай):
//- [ ]
//- [ ] access_log.2020.09.07 212.168.101.5 granted
//- [ ] access_log.2020.09.07 212.168.101.6 denied
//- [ ] access_log.2020.09.07 212.168.101.6 denied
//- [ ] access_log.2020.09.07 212.168.122.6 denied
//- [ ]
//- [ ] написать метод, который принимает на вход текст лога и выводит
// список из уникальных IP адресов и количества удачных и неудачных попыток доступа в формате:
//- [ ] ip 212.168.101.5: ok - 3, failed - 2
public class LogsTask {

    public static void showLogsStatistics(String log) {
        String[] partsOfLog = log.split(" |\\n");
        int numberOfUniqueIPs = 0;
        String[] IPs = new String[partsOfLog.length];
        for (int i = 1; i <= partsOfLog.length - 2; i += 3) {
            if (i == 1) {
                IPs[numberOfUniqueIPs] = partsOfLog[i];
                numberOfUniqueIPs++;
            } else {
                if (!partsOfLog[i].equals(partsOfLog[i - 3])) {
                    IPs[numberOfUniqueIPs] = partsOfLog[i];
                    numberOfUniqueIPs++;
                }
            }
        }
        for (String s : IPs) {
            if (s != null) {
                int ok = 0;
                int failed = 0;
                for (int i = 1; i <= partsOfLog.length - 2; i += 3) {
                    if (s.equals(partsOfLog[i])) {
                        if (partsOfLog[i + 1].equals("granted"))
                            ok++;
                        else if (partsOfLog[i + 1].equals("denied")) {
                            failed++;
                        }
                    }
                }
                System.out.println("ip " + s + ":" + " ok - " + ok + ", failed - " + failed);
            }
        }
    }
}






