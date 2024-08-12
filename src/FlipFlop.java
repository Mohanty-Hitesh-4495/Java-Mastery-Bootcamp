import java.util.*;

public class FlipFlop {

    private String name;
    private int numInputs;
    private int numOutputs;
    private List<String> inputs;
    private List<String> outputs;
    private Map<String, List<String>> stateTable;
    private Map<String, List<String>> excitationTable;

    public FlipFlop(String name, int numInputs, int numOutputs, List<String> inputs, List<String> outputs) {
        this.name = name;
        this.numInputs = numInputs;
        this.numOutputs = numOutputs;
        this.inputs = inputs;
        this.outputs = outputs;
        this.stateTable = new HashMap<>();
        this.excitationTable = new HashMap<>();
    }

    public void generateStateTable() {
        for (int i = 0; i < Math.pow(2, numInputs); i++) {
            String currentState = Integer.toBinaryString(i).substring(numInputs - 1);
            List<String> nextStates = new ArrayList<>();
            for (int j = 0; j < Math.pow(2, numInputs); j++) {
                String nextState = Integer.toBinaryString(j).substring(numInputs - 1);
                if (currentState.equals(nextState)) {
                    nextStates.add("0");
                } else {
                    nextStates.add("1");
                }
            }
            stateTable.put(currentState, nextStates);
        }
    }

    public void generateExcitationTable() {
        for (int i = 0; i < Math.pow(2, numInputs); i++) {
            String currentState = Integer.toBinaryString(i).substring(numInputs - 1);
            List<String> nextStates = new ArrayList<>();
            for (int j = 0; j < Math.pow(2, numInputs); j++) {
                String nextState = Integer.toBinaryString(j).substring(numInputs - 1);
                if (currentState.equals(nextState)) {
                    nextStates.add("0");
                } else {
                    nextStates.add("1");
                }
            }
            excitationTable.put(currentState, nextStates);
        }
    }

    public String getName() {
        return name;
    }

    public int getNumInputs() {
        return numInputs;
    }

    public int getNumOutputs() {
        return numOutputs;
    }

    public List<String> getInputs() {
        return inputs;
    }

    public List<String> getOutputs() {
        return outputs;
    }

    public Map<String, List<String>> getStateTable() {
        return stateTable;
    }

    public Map<String, List<String>> getExcitationTable() {
        return excitationTable;
    }

    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();
        inputs.add("D");
        inputs.add("Clock");
        List<String> outputs = new ArrayList<>();
        outputs.add("Q");
        FlipFlop flipFlop = new FlipFlop("D Flip Flop", 2, 1, inputs, outputs);
        flipFlop.generateStateTable();
        flipFlop.generateExcitationTable();
        System.out.println("State table:");
        for (String currentState : flipFlop.getStateTable().keySet()) {
            System.out.println(currentState + ": " + flipFlop.getStateTable().get(currentState));
        }
        System.out.println("Excitation table:");
        for (String currentState : flipFlop.getExcitationTable().keySet()) {
            System.out.println(currentState + ": " + flipFlop.getExcitationTable().get(currentState));
        }
    }
}