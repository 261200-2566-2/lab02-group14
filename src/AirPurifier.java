//helped by ChatGPT
import java.util.HashMap;

public class AirPurifier {
    String model;
    String serialNo;
    boolean power;
    int fanspeed;
    boolean certified = true;

    static int modelCount = 0;
    static HashMap<String, Integer> modelOccur = new HashMap<>();
    void turnOn() {
        power = true;
        fanspeed = 1;
    }

    void turnOff() {
        power = false;
        fanspeed = 1;
    }

    int getFanSpeed() {
        return fanspeed;
    }
    void setFanSpeed(int speed) {
        fanspeed = Math.min(speed,3);
    }


    AirPurifier(String _model,String _serialNo) {
        model = _model.toLowerCase();
        serialNo = _serialNo;
        modelCount++;
        modelOccur.put(model, modelOccur.getOrDefault(model, 0) + 1);
    }
    static int getModelCount(){
        return modelCount;
    }
    static String mostPopularModel() {
        String mostPopularModel = null;
        int maxOccur = 0;

        for (String model : modelOccur.keySet()) {
            int occur = modelOccur.get(model);
            if (occur > maxOccur) {
                maxOccur = occur;
                mostPopularModel = model;
            }
        }

        return mostPopularModel;
    }

}
